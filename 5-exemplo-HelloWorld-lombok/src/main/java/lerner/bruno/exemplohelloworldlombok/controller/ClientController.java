package lerner.bruno.exemplohelloworldlombok.controller;

import lerner.bruno.exemplohelloworldlombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 15/04/2020 11:05
 */
@RestController
public class ClientController {

    @GetMapping("/clientes")
    public Client getClient() {

        Client client = new Client();
        client.setName("Bruno");
        client.setLastName("Lerner");
        client.setEmail("brunolerner@gmail.com");

        return client;
    }

    @GetMapping("/listaclientes")
    public ArrayList<Client> getListClient() {

        Client client1 = new Client();
        client1.setName("Bruno");
        client1.setLastName("Lerner");
        client1.setEmail("brunolerner@gmail.com");

        Client client2 = new Client();
        client2.setName("Fernanda");
        client2.setLastName("Silva");
        client2.setEmail("fernandasilva@gmail.com");

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        return clients;
    }
}
