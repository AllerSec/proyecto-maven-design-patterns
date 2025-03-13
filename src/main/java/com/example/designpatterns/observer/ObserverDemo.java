package com.example.designpatterns.observer;

/**
 * Clase para demostrar el uso del patrón Observer.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        ProjectSubject project = new ProjectSubject();

        // Crear observadores (usuarios) y registrarlos en el proyecto.
        Observer user1 = new UserObserver("Juan");
        Observer user2 = new UserObserver("María");
        project.attach(user1);
        project.attach(user2);

        // Cambiar el estado del proyecto y notificar a los observadores.
        project.setState("El proyecto ha sido actualizado con nuevos cambios.");
    }
}
