package gestionpharmacie;

import java.util.ArrayList;

import java.util.Comparator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Medicament> medicaments = new ArrayList<Medicament>();
        ArrayList<Personne> clients = new ArrayList<Personne>();
        ArrayList<Personne> pharmaciens = new ArrayList<Personne>();

        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        boolean var = true;

        while(var){
        
            System.out.println("****** Menu de gestion pharmacie ******");
            System.out.println("(1) Gestion medicament");
            System.out.println("(2) gestion Client");
            System.out.println("(3) gestion Pharmacien");

            int choix = scanner.nextInt();

            switch (choix){
                case 1:
                    boolean var1 = true;
                    while(var1){
                     

                        System.out.println("(1) add medicament");
                        System.out.println("(2) delete medicament");
                        System.out.println("(3) update medicament");
                        System.out.println("(4) show all medicaments");
                        System.out.println("(5) search in list medicament");
                        System.out.println("(6) retour à les Choix");

                        System.out.println("CHoix :");

                        int choixPharmacien = scanner.nextInt();
                        switch (choixPharmacien){
                            case 1 :
                                System.out.println("add id product:");
                                int id = medicaments.size() + 1;
                                System.out.println(id);
                                
                                System.out.println("add name Product:");
                                String nameProduct = scanner.next();
                                
                                System.out.println("add description Product:");
                                scanner.nextLine();
                                String descriptionProduct = scanner.nextLine();
                                
                                System.out.println("Add price product:");
                                int price = 0;
                                boolean isNumber;
                                do {
                                	 if(scanner.hasNextInt()) {
                                    	 price = scanner.nextInt();
                                         System.out.println("DH");
                                         isNumber = true;
                                    }else {
                                    	System.out.println("Please enter number betwenn [0-9]");
                                    	isNumber = false;
                                    	scanner.next();
                                    }
                                }while(!(isNumber));
                                System.out.println(price);
                               
                                Medicament medicament = new Medicament(id, nameProduct, descriptionProduct, price);
                                medicament.addMedicament(medicaments, medicament);
                              
                                System.out.print("please enter number : ");

                                break;

                            case 2:
                                System.out.print("Select medicament to delete : ");
                                int idIndex = scanner.nextInt();
                                 Medicament deleteMedicament = new Medicament();
                                 deleteMedicament.deleteMedicament(medicaments, idIndex - 1);
                                System.out.println("Medicament deleted !!");
                                break;

                            case 3:
                            	System.out.print("select index medicament to update : ");
                                int ii = scanner.nextInt() -1;
                                for (int i = 0; i < medicaments.size(); i ++){
                                    if(ii == i){
                                        System.out.print("Enter index medicament : ");
                                        int newId = scanner.nextInt();

                                        System.out.print("new Name the Product : ");
                                        String newName  = scanner.next();

                                        System.out.print("new Description the product : s");
                                        scanner.nextLine();
                                        String newDescription = scanner.nextLine();

                                        System.out.print("new Price the product : ");
                                        int newPrice = 0;
                                        boolean isNewNumber;
                                        do {
                                        	 if(scanner.hasNextInt()) {
                                        		 newPrice = scanner.nextInt();
                                                 System.out.println("DH");
                                                 isNewNumber = true;
                                            }else {
                                            	System.out.println("Please enter number betwenn [0-9]");
                                            	isNewNumber = false;
                                            	scanner.next();
                                            }
                                        }while(!(isNewNumber));
                                        System.out.println(newPrice);
                                       
                                        
                                        
                                        

                                        Medicament updateMedicament = new Medicament(newId, newName, newDescription, newPrice);
                                        updateMedicament.editMedicament(medicaments, updateMedicament, newId - 1);
                                        System.out.println("Product Updated");
                                    }else{
                                        System.out.println("no id is associated try again more");
                                    }
                                }

                                System.out.println("Update successfly");
                                break;

                            case 4:
                                System.out.println("Show Mediacament");
                                Medicament showMedicament = new Medicament();
                                String data = showMedicament.afficheMedicament(medicaments);
                                System.out.println(data);
                                break;

                            case 5 :
                                System.out.print("Search your medicament : ");
                                String search = scanner.next();

                              for (int i = 0; i < medicaments.size(); i++){
                                  if(medicaments.get(i).getNameProduct().contains(search)){
                                    @SuppressWarnings("unused")
									Medicament searchMedicament = new Medicament();
                                      System.out.println(medicaments.get(i).toString());
                                      System.out.println();
                                      System.out.println("Yes is excesste");
                                      System.out.println("------------------------------");
                                  }else{
                                      System.out.println("this medicament is not in stock");
                                  }
                              }
                              break;

                            case 6:
                                System.out.println("End");
                                var1 = false;
                                var = true;
                                break;

                            default:
                                System.out.println("Choix invalid !!!!");
                                break;
                        }
                    }

                    break;

                case 2:
                    boolean var2 = true;
                    while (var2){
                       
                        System.out.println("(1) add client");
                        System.out.println("(2) delete client");
                        System.out.println("(3) update client");
                        System.out.println("(4) show client");
                        System.out.println("(5) retour Ã  les Choix");

                        System.out.println("Choix :");
                        int choixClient = scanner.nextInt();

                        switch (choixClient){
                            case 1:
                                int id = clients.size() + 1;
                                System.out.print("add firstname Client: ");
                                String firstname = scanner.next();

                                System.out.print("add lastname Client: ");
                                String lastname = scanner.next();

                                System.out.print("add phone CLient: ");
                                int phone = scanner.nextInt();

                                System.out.print("add email Client: ");
                                String email = scanner.next();

                                System.out.print("Add Some Vente Client : ");
                                int nbVente = scanner.nextInt();

                                Client client = new Client(id, firstname, lastname, phone, email, nbVente);
                                client.addPerson(clients, client);


                              
                               
                                String result = phone >= 10 ? "Client Added" : "error in length number the phone ";
                                System.out.println(result);
                                
                               
                                String resultVente = nbVente >= 3 ? "cette person une client fedéle :) :)" : "cette person n' a pas une client fedéle ";
                                System.out.println(resultVente);

                                break;

                            case 2:
                                System.out.println("Delete Client");
                                System.out.println("----------------------------------------------");

                                System.out.print("select id client to deleted  : ");
                               
                                int idDelete = scanner.nextInt();
                                Client deleteCient = new Client();
                                deleteCient.deletePerson(clients, idDelete - 1);
                                System.out.println("deletes succussfly");
                                
                                break;
                                

                               

                                
                                

                            case 3:
                                System.out.print("Enter Id : ");
                                int newId = scanner.nextInt();

                                System.out.print("Enter new firstname : ");
                                String newFirstname = scanner.next();

                                System.out.print("Enter new lastname : ");
                                String newLastname = scanner.next();

                                System.out.print("Enter new Phone : ");
                                int newPhone = scanner.nextInt();

                                System.out.print("Enter new Email : ");
                                String newEmail = scanner.next();

                                System.out.print("Enter new Number Vente : ");
                                int newNbVente = scanner.nextInt();

                                Client updateClient = new Client(newId, newFirstname, newLastname, newPhone, newEmail, newNbVente);
                                updateClient.editPerson(clients, updateClient, newId - 1);

                                System.out.println(" Client Updated !!");
                                break;
                                
                           
                            case 4:
                            	   System.out.println("Show client");
                                   Client showclient = new Client();
                                   String data = showclient.affichePerson(clients);
                                   System.out.println(data);
                                   break;
                            	
                            case 5:
                                System.out.println("End");
                                var2 = false;
                                var = true;
                                break;

                            default:
                                System.out.println("Choix invalid !!!!");
                                break;

                        }
                    }

                    break;

                case 3:
                    boolean var3 = true;

                    while (var3){
                        
                        System.out.println("(1) add pharmacien");
                        System.out.println("(2) delete pharmacien");
                        System.out.println("(3) update pharmacien");
                        System.out.println("(4) retour à les Choix");

                        System.out.println("Choix :");
                        int choixPharmacien = scanner.nextInt();
                        switch (choixPharmacien){
                            case 1:
                                int id = clients.size() + 1;
                                System.out.print("add firstname Pharmacien: ");
                                String firstname = scanner.next();

                                System.out.print("add lastname Pharmacien: ");
                                String lastname = scanner.next();

                                System.out.print("add phone Pharmacien: ");
                                int phone = scanner.nextInt();

                                System.out.print("add email Pharmacien: ");
                                String email = scanner.next();


                                Pharmacien pharmacien = new Pharmacien(id, firstname, lastname, phone, email);
                                pharmacien.addPerson(pharmaciens, pharmacien);


                               
                                String result = phone >= 10 ? "Client Added" : "error in length number the phone ";
                                System.out.println(result);

                                break;

                            case 2 :
                                System.out.println("Delete Client");
                                System.out.println("----------------------------------------------");
                                System.out.println("select client to deleted !!");
                                int idDelete = scanner.nextInt();
                                Pharmacien deletePharmacien = new Pharmacien();
                                deletePharmacien.deletePerson(pharmaciens, idDelete - 1);
                                System.out.println("deletes succussfly");
                                break;


                            case 3 :
                                System.out.print("Enter Id : ");
                                int newId = scanner.nextInt();

                                System.out.print("Enter new firstname : ");
                                String newFirstname = scanner.next();

                                System.out.print("Enter new lastname : ");
                                String newLastname = scanner.next();

                                System.out.print("Enter new Phone : ");
                                int newPhone = scanner.nextInt();

                                System.out.print("Enter new Email : ");
                                String newEmail = scanner.next();


                                Pharmacien updatePharmacien = new Pharmacien(newId, newFirstname, newLastname, newPhone, newEmail);
                                updatePharmacien.editPerson(pharmaciens, updatePharmacien, newId - 1);

                                System.out.println("Pharmacien Updated !!");
                                break;
                            
                          
                            case 4:
                                System.out.println("End");
                                var3 = false;
                                var = true;
                                break;

                            default:
                                System.out.println("Choix invalid !!!!");
                                break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("=+++++++++++  END ================");
                    System.out.println(0);
                    break;

                default:
                    System.out.println("Choix invalid !!!!!!");
                    break;
            }
        }

    }
    
	public static Comparator<Personne> nameComparator = new Comparator<Personne>() {

        public int compare(Personne c1, Personne c2) {
           String clientName = c1.getFirstname(), clientLName = c2.getLastname();
           

           //ascending order
           return clientName.compareTo(clientLName);

        }


    };
}
