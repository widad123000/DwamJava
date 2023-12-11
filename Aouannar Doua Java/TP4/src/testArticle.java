
public class testArticle {

	public static void main(String[] args) {

			Article a = new Article();
			Article a2= new Article(1,"Pomme",11.0,10);
			Article a3 = new Article(a );
			
			
			
		  System.out.println(a.getResp_numéro());
		  
		  System.out.println(a.getNomdelarticle());
		  
		  System.out.println(a.getPrix_HT());
		  
		  System.out.println(a.getLa_quantité_actuelle_en_stock());
		  
		  
          System.out.println(a2.getResp_numéro());
		  
		  System.out.println(a2.getNomdelarticle());
		  
		  System.out.println(a2.getPrix_HT());
		  
		  System.out.println(a2.getLa_quantité_actuelle_en_stock());
		  
		  
          System.out.println(a3.getResp_numéro());
 		  
		  System.out.println(a3.getNomdelarticle());
		  
		  System.out.println(a3.getPrix_HT());
		  
		  System.out.println(a3.getLa_quantité_actuelle_en_stock());
		  
		  
		  Article[] chariot = {
				  new Article(1, "Pomme", 10, 100 ),
				  new ArticleLuxe(2, "iPhone", 200, 100),
				  new Vetement(3, "Pull", 30, 100, 5, "Ve")
				  } ;
				  double montant = 0;
				  for (Article p:chariot) {
				  montant += p.prixTTC();
				  }
				  System.out.println(montant);
				  methodeparam.afficheprix(a2);                                                                                                                                     
				  
				  
				  Article b = new Article(2, "iPhone", 200, 100);
				  System.out.println(b.convText());
				  System.out.println(b.Compare(a2));
	}
	
	
				  }



	


