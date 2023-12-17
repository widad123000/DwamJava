package tp8;

public interface MonApi {
    // Afficher sur l'unite standard de sortie
    public void print();

    // formate un objet vers un text
    public String convText();

    // compare this avec o. return -1, 0 ou 1
    public int compare(Object o);
}
