
public class MaPile implements Pile{
   
      private StringBuilder pile;

     public MaPile(){
        pile = new StringBuilder();
     }

     @Override
     public void empiler(char c) {
         if(!pleine()){
            pile.append(c);
          }else{
            System.out.println("pile est pleiner");
         }

         }
     @Override
     public char sommet() {
         if(!vide()){
            return pile.charAt(pile.length() - 1);
         }else{
            System.out.println("La pile est vide. Aucun sommet à consulter.");
            return '\0'; 
         }
         
     }
    
     @Override
     public void depiler() {
         if(!vide()){
            pile.deleteCharAt(pile.length() - 1);
         }else{
            System.out.println("La pile est vide. Impossible de dépiler.");

         }
     }
      @Override
      public boolean vide() {
          return pile.length() == 0;
      }
      
      @Override
      public boolean pleine() {
          return pile.length() == MAX;
      }
    
}