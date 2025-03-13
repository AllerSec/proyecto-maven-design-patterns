package com.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Sujeto que notifica a los observadores cuando cambia su estado.
 */
public class ProjectSubject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    // Metodo para registrar un observador
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Metodo para remover un observador
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // Establece un nuevo estado y notifica a todos los observadores
    public void setState(String newState) {
        this.state = newState;
        notifyObservers();
    }

    // Notifica a cada observador con el nuevo estado
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
