package com.example.designpatterns.factory;

/**
 * Clase para demostrar el uso del patrón Factory Method.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Project project1 = ProjectFactory.createProject("web");
        project1.displayInfo();

        Project project2 = ProjectFactory.createProject("mobile");
        project2.displayInfo();
    }
}
