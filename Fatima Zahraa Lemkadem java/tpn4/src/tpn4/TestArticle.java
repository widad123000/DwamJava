package tpn4;

public class TestArticle {

	public static void main(String[] args) {
		Article a = new Article(1,"pomme",10,2);
		System.out.println(a.getNumero());
		System.out.println(a.getDesignation());
		System.out.println(a.getPrix());
		System.out.println(a.getQte());
		
		System.out.println(a.afficherPrix(a));
		
	}

}
