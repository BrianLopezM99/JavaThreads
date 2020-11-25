package com.company;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Presiona 1 para crear el servidor en el puerto 6666");
        System.out.println("Presiona 2 para crear un cliente");

        String input = d.readLine();

        if (input.equals("1")) {
            ServerPool serverPool = new ServerPool(10,2);
            serverPool.startServer();
        } else {
            new Client("localhost",6666).startGame();
        }
    }
}
