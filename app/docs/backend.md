# Diseño del Backend (Conceptual) - Sistema de Coworking

## 1. Arquitectura Basada en Capas
Para garantizar que el sistema sea escalable y fácil de mantener, se propone una arquitectura de **tres capas**:

1.  Capa de Controladores (API/Entry Point): Es la puerta de entrada. Se encarga de recibir las peticiones HTTP (JSON) de la app móvil y validar que el formato sea correcto.
2.  Capa de Servicios (Lógica de Negocio): Es el "cerebro". Aquí se aplican las reglas: por ejemplo, verificar si un espacio está disponible antes de confirmar una reserva o calcular el precio total.
3.  Capa de Datos (Repositorio/Persistencia): Se encarga exclusivamente de la comunicación con la base de datos (SQL o NoSQL), realizando las consultas y guardando los registros.

## 2. Flujo de una Petición (Request Flow)
El camino que sigue una solicitud de reserva, por ejemplo, es el siguiente:

1.  Cliente (App Móvil): Envía un `POST` con los datos de la reserva.
2.  Controlador:Recibe el JSON, extrae los datos y llama al servicio de reservas.
3.  Servicio: Consulta a la capa de datos si el espacio `WK-005` está libre en esa fecha.
4.  Repositorio:Realiza el `SELECT` en la Base de Datos.
5.  Base de Datos: Devuelve el estado del espacio.
6.  Servicio:Si está libre, le pide al repositorio guardar la reserva y cambia el estado del espacio a "ocupado".
7.  Respuesta: El controlador devuelve un código `201 Created` a la aplicación.

## 3. Justificación de Decisiones Técnicas
*   Uso de Capas: Se eligió esta estructura para permitir que, en el futuro, se pueda cambiar la base de datos sin tener que reescribir la lógica de negocio (Desacoplamiento).
*   API RESTful: Se optó por REST con formato JSON por ser el estándar más compatible con aplicaciones nativas en Kotlin, facilitando la comunicación síncrona y el manejo de errores mediante códigos de estado HTTP (200, 400, 500).
*   Escalabilidad: Al separar la lógica en servicios, el sistema puede crecer para incluir pagos, notificaciones o membresías sin afectar la estabilidad de la búsqueda de espacios.
