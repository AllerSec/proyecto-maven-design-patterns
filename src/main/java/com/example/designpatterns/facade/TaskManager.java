package com.example.designpatterns.facade;

/**
 * Clase que simula la gestión de tareas en la plataforma.
 */
public class TaskManager {
    public void createTask(String taskName) {
        System.out.println("Creando tarea: " + taskName);
    }

    public void updateTask(String taskName) {
        System.out.println("Actualizando tarea: " + taskName);
    }
}
