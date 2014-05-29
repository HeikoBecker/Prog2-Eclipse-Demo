Einführung in Eclipse
===

Anhand dieses Projekts soll die Bedienung von Eclipse beispielhaft vorgeführt
werden.  Sie werden lernen, neue Projekte zu erstellen und bereits existierende
Projekte zu importieren. 

###Inhalt

1. Projekte importieren/anlegen
2. Wichtige Editor Features
3. Refaktorisierung mit Eclipse
4. Projekte laufen lassen
5. Assertions verwenden
6. Debuggen mit Hilfe von Breakpoints
7. jUnit Tests schreiben


###1. Projekte importieren/anlegen

- klonen Sie das Repository wie Sie es aus der Vorlesung kennen

  ```
  https://github.com/ImmanuelHaffner/Prog2-Eclipse-Demo.git
  ```

- Öffnen Sie Eclipse
- Ein neues Java Projekt anlegen mit **File -> New -> Java Project**
- Ein bereits existierendes Projekt importieren mit **File -> Import...**

###2. Wichtige Editor Features

- Projekt komplett formatieren: **Strg + A** um alles auszuwählen, dann
**Strg + Shift + F** zum formatieren
- Fehlende Pakete importieren: **Strg + Shift + O**
- Zur Definition einer Funktion springen **F3**
- Zur Benutzung einer Funktion springen **Strg + Shift + G**

###3. Refaktorisierung mit Eclipse

- Rechts klick auf Methode/ Variable, dann **Refactor -> Rename**

###4. Projekte laufen lassen

- oben in der Toolbar gibt es einen großen grünen Knopf wie beim DVD Spieler
**Strg + F11** drücken

###5. Assertions verwenden

- neben Run auf den kleinen schwarzen Pfeil klicken, Run as auswählen und bei
Java eine neue Konfiguration anlegen. Dort bei VM Argumenten
**-ea** hinzufügen

###6. Debuggen mit Hilfe von Breakpoints

- Debugger starten mit Klick auf Käfer, dann die Stepper oben benutzen zum
durchgehen

###7. jUnit Tests schreiben

- neues Package erstellen
- Rechtsklick -> Neu -> jUnit Test -> Variablen anlegen und Testmethoden
- Rechtsklick auf Datei, dann Run as jUnit Testcase


@author Heiko Becker <mailto:heikobecker92@gmail.com>

@author Immanuel Haffner <mailto:haffner@cs.uni-saarland.de>
