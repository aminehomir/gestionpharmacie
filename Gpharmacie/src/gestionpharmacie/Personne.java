package gestionpharmacie;
import java.util.ArrayList;

public class Personne {
	private int id;
    private String firstname;
    private String lastname;
    private int phone;
    private String email;

    public Personne(int id, String firstname, String lastname, int phone, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Personne(){

    }

    
    
    @Override
    public String toString() {
        return "\n Id:" + id + "\n firstname :" + firstname + "\n lastname :" + "\n phone :" + phone + "\n Email :" + email;
    }

    public String addPerson(ArrayList<Personne> person, Personne personne){
        try{
            person.add(personne);
            return "Person Added";
        }catch(Exception ex){
            return ex.getMessage();
        }
    }

    public String editPerson(ArrayList<Personne> person, Personne personne, int index){
        try {
            person.set(index, personne);
            return "Person Edited !";
        }catch (Exception ex){
            return  ex.getMessage();
        }
    }

    public String deletePerson(ArrayList<Personne> person, int index){
        try {
            person.remove(index);
            return "Person Deleted !";
        }catch (Exception ex){
            return ex.getMessage();
        }
    }

    public String affichePerson(ArrayList<Personne> person){
        try{
            String pr = "";
            for(Personne personne : person){
                pr += personne.toString();
            }
            return pr;
        }catch(Exception ex){
            return ex.getMessage();
        }
    }

}
