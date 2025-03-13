package com.example.designpatterns.factory;

/**
 * Implementación de un proyecto móvil.
 */
public class MobileProject implements Project {
    @Override
    public void displayInfo() {
        System.out.println("Proyecto Móvil: Desarrollo de una aplicación móvil.");
    }
}
