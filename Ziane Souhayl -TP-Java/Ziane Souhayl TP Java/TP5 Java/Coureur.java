class Coureur implements Loisir {
    final int distance = 10;

    @Override
    public void courirOuMarcher() {
        System.out.println("Je cours " + distance + " Km.");
    }

    public void courirMoins() {
        System.out.println("Je cours " + (distance / 2) + " Km.");
    }
}
