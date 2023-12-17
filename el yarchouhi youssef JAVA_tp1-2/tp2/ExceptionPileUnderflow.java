import java.lang.Exception;

public class ExceptionPileUnderflow extends Exception {
    public ExceptionPileUnderflow(){
        super("Pile vide: impossibel d'acceder a l'element.");
    }
}
