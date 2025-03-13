package com.example.designpatterns.factory;

/**
 * Fábrica que crea instancias de Project según el tipo solicitado.
 */
public class ProjectFactory {
    public static Project createProject(String type) {
        if (type.equalsIgnoreCase("web")) {
            return new WebProject();
        } else if (type.equalsIgnoreCase("mobile")) {
            return new MobileProject();
        }
        throw new IllegalArgumentException("Tipo de proyecto no soportado: " + type);
    }
}
