/**
 * Pile
 */
public class Pile {

    char t[];
    int top;
    static int max=8;
    //Programmation des opérations (méthodes) de la pile
    public Pile(){
        this.t = new char[max+1];
        this.top=-1;
    }
    public boolean estPleine(){
        return(this.top==max);
    }
      public boolean estVide(){
        return(this.top==-1);
    }
     public void empiler(char c){
        if  (!estPleine())
        {
         t[++top]=c;   
        }
        else{
            System.out.println("Pile pleine");
        }
    }
     public char sommet() {
     // Retourne le caractère au sommet de la pile, si
     // ... a compléter ...
       return(t[top]);
     }
     public void depiler() {
         // décapite la pile (retire le sommet )
         // ... a compléter ...
        if (!estVide()) {
            top--;
        }
        else{System.out.println("Pile est vide");}
         }
     public String toString() {
            String e=" ";
            for (int i=0 ;i<=top;i++){
                e=t[i]+" ";
            }
            return e;
         }
    
} 