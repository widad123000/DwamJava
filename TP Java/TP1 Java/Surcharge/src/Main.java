class DataArtist {
    static void draw(String s) {
        System.out.println("Ceci est une chaîne: "+s);
    }
    static void draw(int i) {
        System.out.println("Ceci est un entier: "+i);
    }
    static void draw(double f) {
        System.out.println("Maintenant un double: "+f);
    }
    static void draw(int i, double f) {
        System.out.format("Une entier %d et un double %f %n",i,f);
    }
    public static void main (String []args){
        DataArtist.draw ("Picasso");
        DataArtist.draw (1);
        DataArtist.draw (3.1459);
        DataArtist.draw (2, 1.68);
    }


}
