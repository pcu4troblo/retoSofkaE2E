**Proyecto base para automatizacion de pruebas con Serenity Screenplay**

Proyecto inicial para comenzar a automatizar pruebas con la libreria Serenity utilizando el patron de diseño Screenplay utilizando versiones actualizadas a Cucumber4

**Documentacion oficial**

Writting User-centric tests using Serenity Screenplay

https://serenity-bdd.github.io/theserenitybook/latest/serenity-screenplay.html

Uso de version con Cucumber4

https://github.com/serenity-bdd/serenity-cucumber4-starter


**Antes de iniciar**

1. Revisar archivos base


    settings.gradle
    build.gradle
    serenity.properties

Completar tasks TODO que deben actualizarse para cada cliente (nombre del proyecto, uso de dependencias, actualizacion de versiones de gradle)

2. Renombrar paquetes co.com.client.project a acoplarse con cliente y proyecto

3. Eliminar carpeta .git antes de subir cambios al repositorio del cliente 

4. Verificar versiones correctas de drivers en carpeta src/test/resources, actualizar con versiones correctas descargadas de:

https://chromedriver.chromium.org/downloads

https://github.com/mozilla/geckodriver/releases

Setear en carpeta src/test/resources y verificar correcta referencia a esta carpeta en archivo serenity.properties

5. Actualizar README.md file

**Paquetes**

lib - inclusion de .jar propios en el proyecto
ci - responsabilidad de almacenar jenkinsfile o yml files para CI/CD
gradle - ubicacion del gradle wrapper
src - arquitectura de automatizacion


