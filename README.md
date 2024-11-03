# IntelliJ Maven Projekt

>**Hinweis:** Dieses Projekt verwendet **kein DevExtreme-Element**. HTML, CSS und JavaScript können ignoriert werden.

## Wichtige Inhalte

Die folgenden Komponenten sind für das Projekt besonders wichtig:

### 1. OverviewController
- Übergabe der Daten an das Frontend
- Erstellen, Löschen und Bearbeiten von Zeilen (über DevExtreme-Events/Eventhandling)

### 2. BackendApplication
- Hauptanwendungsklasse

### 3. Repositorys
- Aufbau und Struktur der Repositorys

### 4. Services
- Aufbau und Struktur der Service-Klassen

### 5. Table Classes
- Aufbau und Struktur der Tabellenklassen

> **Hinweis:** Es gibt in diesem Projekt mehrere Repositorys, Services und Table Classes, da mehrere Datenbanktabellen visualisiert werden.

---

## Ersten Schritte

Schritt-für-Schritt-Anleitung zur Einrichtung des Projekts:

1. **MySQL Datenbank erstellen**
2. **Maven Projekt in IntelliJ aufsetzen**
   - Konfiguration der `pom.xml`-Datei
   - Konfiguration der `application.properties`-Datei
3. **Anpassung der 5 Komponenten an die Datenbank**
4. **DevExtreme-Element einbauen**
   - Einfache Funktionen für Anzeige, Hinzufügen, Löschen und Bearbeiten (New/Delete/Edit)
