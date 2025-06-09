# Tarea: Servlet Request Listener

## Descripción

Este proyecto implementa un `ServletRequestListener` en Java como parte de una tarea. El listener tiene como objetivo [Describe brevemente el objetivo principal de tu listener, por ejemplo: "agregar un atributo con un nombre completo a cada petición HTTP entrante"].

## Funcionalidades Implementadas

*   **NombreRequestListener**: Un listener que se activa con cada petición HTTP.
    *   En `requestInitialized`: [Describe qué hace tu listener cuando se inicializa una petición, por ejemplo: "Se establece el atributo 'nombreCompleto' en el objeto ServletRequest con el valor 'Jeferson Murillo'."]
    *   En `requestDestroyed`: [Describe qué hace tu listener cuando se destruye una petición, por ejemplo: "Se imprime un mensaje en la consola indicando la finalización de la petición."]

## Requisitos

*   Java SDK 16 (o la versión que estés utilizando)
*   Un contenedor de Servlets compatible (por ejemplo, Apache Tomcat, Jetty, etc.)
*   Apache Maven (si lo usas para gestionar dependencias y construir el proyecto)

## Configuración y Despliegue

1.  **Clonar el repositorio (si aplica):**
    ```bash
    git clone [URL_DE_TU_REPOSITORIO]
    cd [NOMBRE_DEL_DIRECTORIO_DEL_PROYECTO]
    ```
2.  **Construir el proyecto (si usas Maven o Gradle):**
    *   Con Maven:
        ```bash
        mvn clean install
        ```
3.  **Desplegar el archivo `.war`:**
    Despliega el archivo `nombre-de-tu-aplicacion.war` (generado en el directorio `target` si usas Maven) en tu contenedor de servlets.
4.  **Acceder a la aplicación:**
    [Describe cómo alguien podría probar o ver el efecto de tu listener, por ejemplo: "Accede a cualquier servlet de la aplicación y verifica que el atributo 'nombreCompleto' está disponible o revisa los logs del servidor para los mensajes del listener."]

## Cómo funciona el Listener

El `NombreRequestListener.java` implementa la interfaz `ServletRequestListener`.
*   El método `requestInitialized(ServletRequestEvent sre)` se invoca cuando una petición HTTP está a punto de entrar en el ámbito de la aplicación web. Aquí es donde se añade el atributo `nombreCompleto` a la petición.
*   El método `requestDestroyed(ServletRequestEvent sre)` se invoca cuando la petición ha sido procesada y está a punto de salir del ámbito de la aplicación.

## Autor

*   Jeferson Murillo ([murillopalacioj@gmail.com])
