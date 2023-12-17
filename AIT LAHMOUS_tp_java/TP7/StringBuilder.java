public class StringBuilder {
    Pile p = new Pile();
    public void inser(int i,char c){
        p.top+=1;
        for (int j=p.top;j>=i;j++){
         p.t[j] =p.t[j-1];
        }
        p.t[i]=c;
    }
    public char charAt(int i){return p.t[i];}

    public int length() { return p.top;
    }

    public void append(char c) {
        p.empiler(c);
    }

    public void deleteCharAt(int j) {
       p.depiler();
    }
}
