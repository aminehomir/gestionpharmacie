package gestionpharmacie;

import java.util.ArrayList;

public class Client extends Personne{

    private int nbVente;


    public Client(int id, String firstname, String lastname, int phone, String email, int nbVente) {
        super(id, firstname, lastname, phone, email);
        this.nbVente = nbVente;
    }

    public int getNbVente() {
        return nbVente;
    }

    public void setNbVente(int nbVente) {
        this.nbVente = nbVente;
    }

    public Client(){

    }

    

    @Override
	public String toString() {
		return super.toString() + "\n Nombre de Vente :" + nbVente;
	}

	public String addPerson(ArrayList<Personne> person, Client client){
        try{
            return super.addPerson(person, client);
        }catch(Exception ex){
            return ex.getMessage();
        }
    }

    public String editPerson(ArrayList<Personne> person, Client client, int index){
        try {
            return super.editPerson(person, client, index);
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
