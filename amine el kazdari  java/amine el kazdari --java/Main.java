public class Main {
        static public void main(String[] args){
        
            Etudiant e1 = new Etudiant(01, "abdelmoughit", "mouradi", 19, "mouradiAbdelmoughit@gmail.com");
            Matier m1 = new Matier("01", "java", 4, 0);
            Matier m2 = new Matier("02", "jee", 4, 0);
             //Note n = new Note(null,null,0);
            Note n1 = new Note(e1,m1,17);
            Note n2 = new Note(e1,m2,16);
            n1.AddNoteM(n1);
          // System.out.println(n2.AddNoteM(n2)); 
           System.out.println( n2.getNot() ) ;
          
           // n.afficheNote();
      
    }

}
