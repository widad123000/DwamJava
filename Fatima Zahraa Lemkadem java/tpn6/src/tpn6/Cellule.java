package tpn6;

public class Cellule extends Object implements Cloneable{
	int i = 0 ;
	int []t= {1,2};
	public Cellule(Cellule x) {
		this.i = x.i;
		for(int i = 0 ; i<2; i ++) {
			this.t[i] = x.t[i];
		}
	}
	
	public Cellule() {
		this.i = 0 ;
		int[]t= {0,0};
	}
	public Object clone() {
		try {
			Cellule tmp = (Cellule) super.clone();
			tmp.t =(int []) this.t.clone();
			return tmp ;
		}catch (CloneNotSupportedException e) {
			throw new InternalError ();
		}
	}
	public void afficher() {
		System.out.println(i + " " + t[0]+" "+t[1]);
	}
	
	public void ChangeMe() {
		i = 10 ; 
		t[0]=11;
		t[1]=12;
	}
}
