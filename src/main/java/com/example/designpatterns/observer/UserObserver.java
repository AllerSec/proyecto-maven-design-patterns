package com.example.designpatterns.observer;

/**
 * Observador concreto que representa un usuario suscrito a notificaciones.
 */
public class UserObserver implements Observer {
    private String userName;

    public UserObserver(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println("Notificación para " + userName + ": " + message);
    }
}
