package com.example.designpatterns.factory;

/**
 * Implementación de un proyecto web.
 */
public class WebProject implements Project {
    @Override
    public void displayInfo() {
        System.out.println("Proyecto Web: Desarrollo de una aplicación web.");
    }
}
