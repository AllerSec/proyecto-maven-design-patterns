package com.example.designpatterns.facade;

/**
 * Fachada que simplifica la interacción entre el TaskManager y el NotificationManager.
 */
public class ProjectFacade {
    private TaskManager taskManager;
    private NotificationManager notificationManager;

    public ProjectFacade() {
        this.taskManager = new TaskManager();
        this.notificationManager = new NotificationManager();
    }

    /**
     * Metodo que crea una tarea y, de manera automática, envía una notificación.
     */
    public void createTaskWithNotification(String taskName) {
        taskManager.createTask(taskName);
        notificationManager.sendNotification("Se ha creado la tarea: " + taskName);
    }
}
