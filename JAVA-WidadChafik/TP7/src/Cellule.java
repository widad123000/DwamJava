class Cellule  implements Cloneable {
    int i = 0;
    int[] t = {1, 2};



        public Object clone(){

                Cellule tmp = new Cellule();
                tmp.i=i;
                for(int j=0;j<tmp.t.length;j++){
                    tmp.t[i]=t[i];
                }

                return tmp;


        }
        public Cellule(){
            i=0;
           t[0]=1;
           t[1]=2;
        }
    public Cellule (Cellule x){
        this.i = x.i;
        for (int i=0; i<2; i++)
            this.t[i]=x.t[i];
    }


    public void afficher() {

    System.out.println(i +" "+ t[0]+" "+t[1]);
           }
    public void changeMe(){
        i = 10;
        t[0] = 11;

        t[1] = 12;
    }

}


