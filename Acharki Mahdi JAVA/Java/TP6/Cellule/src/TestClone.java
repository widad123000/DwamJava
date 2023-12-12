class TestClone {
    public static void main(String args[]){
        Cellule x = new Cellule();
        x.afficher();
        Cellule y = (Cellule) x.clone();
        y.afficher();
        Cellule y0 = new Cellule();
        y0 = (Cellule) x.clone();
        x.changeMe();
        x.afficher();
        y.afficher();
        Cellule x0 = new Cellule();
        Cellule y1 = new Cellule(x0);
    }
}
