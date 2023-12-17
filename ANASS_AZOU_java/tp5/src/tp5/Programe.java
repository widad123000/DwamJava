package tp5;

class Programe {

	public static void main(String[] args) {
		 Coureur c = new Coureur() ;
		 Loisir d = new Coureur() ;
		 //false "Loisir l = new Loisir(); "// :-(

		 c.courirOuMarcher();
		 c.courirMoins();
		 Loisir mesLoisirs[] = { new Marcheur(), new Coureur() } ;
		 mesLoisirs[0].courirOuMarcher();
		 mesLoisirs[1].courirOuMarcher();

		 



	}

}
