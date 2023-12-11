public class Matier {
    private String CodAlpha;
    private String designation;
    private int Vhoraire;
    private int IDprof;
    public Matier(String CodAlpha, String designation, int Vhoraire, int IDprof) {
       this.CodAlpha = CodAlpha;
       this.designation = designation;
       this.Vhoraire = Vhoraire;
       this.IDprof = IDprof;
    }
    //setteris
    public void setCodAlpha(String codAlpha) {
        CodAlpha = codAlpha;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setIDprof(int iDprof) {
        IDprof = iDprof;
    }public void setVhoraire(int vhoraire) {
        Vhoraire = vhoraire;
    }
    //geters
    public String getCodAlpha() {
        return CodAlpha;
    }
    public String getDesignation() {
        return designation;
    }public int getVhoraire() {
        return Vhoraire;
    }public int getIDprof() {
        return IDprof;
    }
}
