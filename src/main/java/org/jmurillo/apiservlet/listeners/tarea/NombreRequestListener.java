package org.jmurillo.apiservlet.listeners.tarea;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class NombreRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletRequest req = sre.getServletRequest();

        System.out.println("Listener: Petición inicializada. Agregando atributo 'nombreCompleto'.");

        req.setAttribute("nombreCompleto", "Jeferson Murillo");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Listener: Petición finalizada.");
    }
}
