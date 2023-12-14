import java.util.LinkedList;

public class Note {
  private  Etudiant id;
  private  Matier Idmat;
  private  float not;
   
  public Note(Etudiant idEtud,Matier Idmat,float not) {
    this.id = idEtud;
    this.Idmat = Idmat;
    this.not = not;
  }
  
  
  LinkedList<Note> Note = new LinkedList<Note>();
  
  public void setID(Matier iD) {
      Idmat = iD;
  }
  public void setId(Etudiant id) {
      this.id = id;
  }
  public void setNot(float not) {
      this.not = not;
  }
  public Matier getID() {
      return Idmat;
  }
  public Etudiant getId() {
      return id;
  }
  public float getNot() {
      return not;
  }
  
  public boolean AddNoteM(Note note) {
    boolean added = false;
      if( Note.add(note)) {
        added = true;
      }
  return added;
   }

   public float moyenne (Note et)
   {
    float Moyen = 0;
    int SomMat=0;
      
    for(Note ind : Note) 
       {
          if(ind.id == et.id)
          {
           Moyen=+ ind.not;     
           SomMat++;
          }
       }
       Moyen = Moyen / SomMat;
    return Moyen;
   }
public String mentien (Note et)
{
   float M = et.moyenne(et);
   
    if (M >= 16) {
        return "Très bien";
    } else if (M >= 14) {
        return "Bien";
    } else if (M >= 12) {
        return "Assez bien";
    } else if (M >= 10) {
        return "Passable";
    } else {
        return "Insuffisant";
    }

}
public void afficheNote() {
}

}

   
