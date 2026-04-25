## Arquitectura del sistema
 
## Tipo de aplicación: Nativa
Se optó por un desarrollo Nativo para el desarrollo (Kotlin/Jetpack Compose), para garantizar máximo rendimiento y una experiencia de usuario fluida, aprovechando capacidades del hardware.
Para el desarrollo se propone una arquitectura que permita escalabilidad mediante un backend centralizado (API REST), asegurando que se siga la lógica del negocio y la disponibilidad de los espacios coworking sean consistentes. Con esto más el nativo se podría integrar multiplataforma para compartir datos con tecnologías como IOS y web sin sacrificar rendimiento nativo.
## Patrón de arquitectura: MVVM
El patrón de arquitectura recomendado sería el MVVM esto ṕor qué es el estandar para trabajar en el desarrollo con Jetpack Compose, facilitando el mantenimiento y permitiendo que la vista se actualice de forma reactiva ante cambios en la disponibilidad de los espacios.

## Flujo general del sistema
Usuario: Abre la aplicación y solicita ver los espacios disponibles.
Vista (UI): La interfaz le pide al ViewModel la lista de espacios.
ViewModel: Solicita los datos al Repositorio.
Repositorio: Consulta la fuente de datos (API REST).
Respuesta: Los datos regresan al ViewModel, este actualiza el Estado (State) y la interfaz de Jetpack Compose se repitan automáticamente para mostrar las tarjetas de los espacios

