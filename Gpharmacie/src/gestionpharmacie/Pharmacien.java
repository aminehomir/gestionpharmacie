package gestionpharmacie;

import java.util.ArrayList;

public class Pharmacien extends Personne{

    public Pharmacien(int id, String firstname, String lastname, int phone, String email) {
        super(id, firstname, lastname, phone, email);
    }

    public Pharmacien() {
    }

    public String addPerson(ArrayList<Personne> person, Pharmacien pharmacien){
        try{
            return super.addPerson(person, pharmacien);
        }catch(Exception ex){
            return ex.getMessage();
        }
    }

    public String editPerson(ArrayList<Personne> person, Pharmacien pharmacien, int index){
        try {
            return super.editPerson(person, pharmacien, index);
        }catch (Exception ex){
            return  ex.getMessage();
        }
    }

    public String deletePerson(ArrayList<Personne> person, int index){
        try {
            return super.deletePerson(person, index);
        }catch (Exception ex){
            return ex.getMessage();
        }
    }

    public String affichePerson(ArrayList<Personne> person){
        try{
            return super.affichePerson(person);
        }catch(Exception ex){
            return ex.getMessage();
        }
    }
}
