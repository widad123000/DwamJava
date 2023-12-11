package tpone;

import tpone.ObjetsVsValeurs.C;

public class passagedesparametres {
	public static void modifObj(int p[]) {
		//p[0]=p[0]+200; //obj references p est modefie
		//p=new int [] {200,300,400}	;
		
	}
	public static void modifObj(C p) {
		p.setX(p.getX()+200); // objet reference p et modefie
	}
	public static void modifVal(int x) {
		x=x+200;
	}

	public static void main(String[] args) {
		int x = 2;
		System.out.println("avant modif, x ="+x);
		modifVal(x);
		System.out.println("apres modif, x ="+x);
		int[] t= {2,3};
		System.out.println("avant modif, t[0]="+t[0]);
		C o =new C();
		modifObj(o);
		System.out.println("Apres modif, t[0] =" + o);
		System.out.println("Apres modif, t[0] =" + t[0]);
		
		
		}

	
	
	
	}


