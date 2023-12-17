import java.lang.Exception;

public class ExceptionPileOverflow extends Exception{
    public ExceptionPileOverflow(){
        super("Pile pleine : impossible d'ajouter un element.");
    }
}
