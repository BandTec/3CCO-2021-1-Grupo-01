package com.carlossantana.TrelloApiTest.controllers;

import com.carlossantana.TrelloApiTest.models.Developer;
import com.carlossantana.TrelloApiTest.models.User;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionsController {

//    User user = new User();
    User dev = new Developer("1239120", "vicentin123", "Victor Vicente",
            "123", "321");

    String boardId = AppConfig.idBoardMonitored;


    @GetMapping("/all-actions-of-board")
    public String getAllActionsBoard(){

        HttpResponse<JsonNode> response = Unirest.get("https://api.trello.com/1/boards/" + boardId + "/actions")
                .queryString("key", dev.getKey())
                .queryString("token", dev.getToken())
                .asJson();

        System.out.println(response.getBody().toPrettyString());

        return response.getBody().toPrettyString();
    }

    @GetMapping("/last-action-of-board")
    public String getLastActionsBoard(){

        HttpResponse<JsonNode> response = Unirest.get("https://api.trello.com/1/boards/" + boardId + "/actions")
                .queryString("key", dev.getKey())
                .queryString("token", dev.getToken())
                .queryString("limit", 1)
                .asJson();

        System.out.println(response.getBody().toPrettyString());

        return response.getBody().toPrettyString();
    }

    @GetMapping("/all-actions-of-member")
    public String getAllActionsMember(){

        String memberId = "60391afe8cf7ef17518fdb63";

        HttpResponse<JsonNode> response = Unirest.get("https://api.trello.com/1/members/" + memberId + "/actions")
                .queryString("key", dev.getKey())
                .queryString("token", dev.getToken())
                .asJson();

        System.out.println(response.getBody().toPrettyString());

        return response.getBody().toPrettyString();
    }

    @GetMapping("/all-actions-of-member-of-board")
    public String getAllActionsMemberBoard(){
        //TODO: implementar resquisição com retorno de todas as ações de um usuário de um quadro
        return "";
    }

///Definir o que fazer ocm dados e como gameficar?
    //

}
