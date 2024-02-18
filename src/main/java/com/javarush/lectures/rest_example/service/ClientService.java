package com.javarush.lectures.rest_example.service;

import com.javarush.lectures.rest_example.model.Client;

import java.util.List;

public interface ClientService {

    void create(Client client);

    List<Client> readAll();

    Client read(int id);

    boolean update(Client client, int id);

    boolean delete(int id);
}
