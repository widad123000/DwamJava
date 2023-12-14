
public class Etudiant {
private int ID;
private String name;
private String prenom;
private int age;
private String Email;

public Etudiant(int ID, String name, String prenom, int age, String Email) {
this.ID=ID;
this.name = name;
this.prenom = prenom;
this.age=age;
this.Email = Email;
}
//getter
public int getID() {
    return ID;
}    
public String getName() {
    return name;
}
public String getPrenom() {
    return prenom;
}
public int getAge() {
    return age;
}
public String getEmail() {
    return Email;
}
//seters
public void setID(int iD) {
    ID = iD;
}
public void setName(String name) {
    this.name = name;
}
public void setPrenom(String prenom) {
    this.prenom = prenom;
}
public void setAge(int age) {
    this.age = age;
}
public void setEmail(String email) {
    Email = email;
}

}

