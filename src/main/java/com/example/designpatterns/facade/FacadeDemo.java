package com.example.designpatterns.facade;

/**
 * Clase para demostrar el uso del patrón Facade.
 */
public class FacadeDemo {
    public static void main(String[] args) {
        ProjectFacade facade = new ProjectFacade();
        facade.createTaskWithNotification("Implementar patrón Facade");
    }
}
