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
	- Öffnen Sie Eclipse
	- Auf der rechten Seite im Feld "Project Explorer" klicken Sie rechts und wählen "Neues Projekt"
	- Dort wählen Sie aus, dass Sie nicht den Standardordner möchten und geben den Ort des soeben 
		geklonten Repos an
###2. Wichtige Editor Features
	- Projekt komplett formatieren: Strg+a um alles auszuwählen, dann Strg+Shift+f zum formatieren
	- fehlende Pakete importieren: Strg+Shift+o
	- zur Definition einer Funktion springen F3
	- zur Benutzung einer Funktion springen Strg+Shift+g
###3. Refaktorisierung mit Eclipse
	- Rechts klick auf Methode/ Variable --> Rename
###4. Projekte laufen lassen
	- oben in der Toolbar gibt es einen großen grünen Knopf wie beim DVD Spieler/ Strg+F11 drücken
###5. Assertions verwenden
	- neben Run auf den kleinen schwarzen Pfeil klicken, Run as auswählen und bei Java eine neue 
	Konfiguration anlegen. Dort bei VM Argumenten -ea hinzufügen
###6. Debuggen mit Hilfe von Breakpoints
	- Debugger starten mit Klick auf Käfer, dann die Stepper oben benutzen zum durchgehen
###7. jUnit Tests schreiben
	- neuen Ordner erstellen
	- Rechtsklick -> Neu -> jUnit Test -> Variablen anlegen und Testmethoden
	- Rechtsklick auf Datei, dann Run as jUnit Testcase


@author Heiko Becker <heikobecker92(at)gmail.com>
@author Immanuel Haffner <haffner(at)cs.uni-saarland.de>
