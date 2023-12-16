package tp8;

public interface MonApi {

    void print(); // Affiche sur l'unité standard de sortie

    String convTexte(); // Formate un objet vers un texte imprimable

    int compare(Object o); // compare this avec o. retourne -1, 0 ou 1
}
