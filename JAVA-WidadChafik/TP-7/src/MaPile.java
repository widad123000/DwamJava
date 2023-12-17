public class MaPile  implements IPile{
    StringBuilder s;
    MaPile(){
        s=new StringBuilder(MAX);
    }

    @Override
    public void empiler(char c) {

        s.insert(0,c);



    }

    @Override
    public void depiler() {
        s.deleteCharAt(0);
    }

    @Override
    public boolean vide() {

        return s.isEmpty();
    }

    @Override
    public char sommet() {
        return s.charAt(0);
    }

    @Override
    public boolean pleine() {
        return s.length()==MAX;
    }

    @Override
    public String toString() {
        String s1="";
        for(int i=0 ;i<s.length();i++){
            s1=s1+s.charAt(i);
        }

        return s1;
    }
}
