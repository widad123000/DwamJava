package org.tp5;

public class Coureur implements Loisir {
    public void courirMarcher() {
        System.out.println("Je cours " + distance + " km.");
    }

    public void courirMoins() {
        System.out.println("Je cours " + (distance / 2) + " km.");
    }
}
