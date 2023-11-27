Motivation:
Dieses Projekt dient dem Nachbau einer GUI zur Vorbereitung auf das Abschlussprojekt.
Die Entwickler sollen lernen wie sie eine Weboberfläche designen und und wie die Kommunikation zwischen Frontend und Backend funktioniert.

Verwendete Technologien:

- Spring Boot als Backend Framework 
- TeleportHQ zur Erstellung des Basis HTML Templates
- Thymeleaf für das darstellen(serverseitige Template Engine) von HTML/CSS
- BootStrap für CSS
- Poppers für Tooltips

Anforderungen:

- Java 21 (JAVA_HOME Path gesetzt)
- Maven

Build the Application:

```shell
mvn clean install
```

Start the Application:

```shell
./mvnw spring-boot:run
```