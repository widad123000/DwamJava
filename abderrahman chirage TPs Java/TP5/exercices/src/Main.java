class Test{
    static public void main(String args[]){
        Coureur c = new Coureur() ;
        c.courirOuMarcher();

        Loisir c1 = new Coureur();
        c.courirMoins();

        Loisir mesLoisirs[] = { new Marcheur(), new Coureur() } ;
        mesLoisirs[0].courirOuMarcher();
        mesLoisirs[1].courirOuMarcher();
    }
}
