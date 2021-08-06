/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.fatoumatabintandiaye.gestionscolaire.test;

import java.util.List;
import java.util.Scanner;
import sn.fatoumatabintandiaye.gestionscolaire.imp.EtudiantImp;
import sn.fatoumatabintandiaye.gestionscolaire.imp.GroupeEtudiantsImp;
import sn.fatoumatabintandiaye.gestionscolaire.imp.GroupeImp;
import sn.fatoumatabintandiaye.gestionscolaire.imp.ProfesseurImp;
import sn.fatoumatabintandiaye.gestionscolaire.model.Etudiants;
import sn.fatoumatabintandiaye.gestionscolaire.model.Groupe;
import sn.fatoumatabintandiaye.gestionscolaire.model.GroupeEtudiants;
import sn.fatoumatabintandiaye.gestionscolaire.model.Professeur;

/**
 *
 * @author fatoumata binta  
 */
public class Test {
   public static void main(String [] args){
       EtudiantImp etudiantImp = new EtudiantImp();
       ProfesseurImp profesImp = new ProfesseurImp();
       GroupeImp groupImp = new GroupeImp();
       GroupeEtudiantsImp groupEtImp = new GroupeEtudiantsImp();
       boolean var = true ;
       
       while (var) {
           
       System.out.println("*****************MINI-PROJET***********************"); 
       
       System.out.println("***********Menu principale**************");
       
       System.out.println("1- Gestion Etudiant");
       System.out.println("2- Gestion Professeur");
       System.out.println("3- Gestion Groupe");
       System.out.println("4- Gestion Groupe-Etudiants");
       System.out.println("5- Quitter");
       
       System.out.println("choix : ");
       Scanner sc = new Scanner(System.in);
       
       int choix  = sc.nextInt();
       switch(choix)
       {
           case 1:
               
               boolean var1 = true ;
               
               while (var1) {
                   
               
               System.out.println("*****************Gestion Etudiants***********************");
               
               System.out.println("1- Ajouter etudiant");
               System.out.println("2- Supprimer etudiant");
               System.out.println("3- Modifier etudiant");
               System.out.println("4- Afficher etudiant");
               System.out.println("5- voir detail");
               System.out.println("6- Retour");
               
               
               System.out.println("choix : ");
       
               int choixEtudiant  = sc.nextInt();
               switch(choixEtudiant)
               {
                   case 1:
                       
                       
                       System.out.println("Ajouter etudiants");
                       
                       System.out.println(" ID :");
                       
                       int id = sc.nextInt();
                       
                       System.out.println(" NOM :");
                       
                       String nom = sc.next();
                       
                       System.out.println(" PRENOM :");
                       
                       String prenom = sc.next();
                       
                       System.out.println(" ADRESSE :");
                       
                       String adresse = sc.next();

                       System.out.println(" TELEPHONE :");
                       
                       String tel = sc.next();
                       
                       System.out.println(" LOGIN :");
                       
                       String login = sc.next();
                       
                       System.out.println(" PASSWORD :");
                       
                       String password = sc.next();
                       
                       Etudiants etudiants = new Etudiants(id, nom, prenom, adresse, tel, login, password);
                       
                       etudiantImp.addEtudiant(etudiants);
                       System.out.println(" Etudiant ajouter avec succés");
                   break;
                   
                   case 2:
                       System.out.println("Supprimer etudiant ");
                       
                       System.out.println(" ID :");
                       
                       int IdSup = sc.nextInt();
                       Etudiants etudiants2 = etudiantImp.getEtudiantsbyId(IdSup);
                       etudiantImp.deleteEtiant(etudiants2);
                       System.out.println("Suppression reussis");
                   break;
                   
                   case 3:
                       System.out.println("Modifier etudiant");
                       
                       System.out.println(" ID :");
                       
                       int IdMod = sc.nextInt();
                       Etudiants etudiants3 = etudiantImp.getEtudiantsbyId(IdMod);
                       
                       System.out.println(" NOM :");
                       String nomE = sc.next();
                       etudiants3.setNom(nomE);
                       
                       System.out.println(" PRENOM :");
                       String prenomE = sc.next();
                       etudiants3.setPrenom(prenomE);
                       
                       System.out.println(" ADRESSE :");
                       String adresseE = sc.next();
                       etudiants3.setAdresse(adresseE);
                       
                       System.out.println(" TELEPHONE :");
                       String telE = sc.next();
                       etudiants3.setTel(telE);
                       
                       System.out.println(" LOGIN :");
                       String loginE = sc.next();
                       etudiants3.setLogin(loginE);
                       
                       System.out.println(" PASSWORD :");
                       String passwordE = sc.next();
                       etudiants3.setPassword(passwordE);
                       
                       etudiantImp.updateEtudiants(etudiants3);
                       System.out.println("Modification reussis");
                   break;
                   
                   case 4:
                        System.out.println("Afficher etudiant");
                       
                       List<Etudiants> etudiant = etudiantImp.getAllEtudiants();
                       for(Etudiants etudiants4:etudiant)
                       {
                           System.out.println("Id: "+etudiants4.getId()+", Nom: "+etudiants4.getNom()+", Prenom: "+
                                   etudiants4.getPrenom()+", Adresse: "+etudiants4.getAdresse()+", Telephone: "+
                                   etudiants4.getTel()+", Login: "+etudiants4.getLogin()+", Password: "+
                                   etudiants4.getPassword());            
                       }
                   break;
                   
                   case 5:
                       System.out.println("ID :");
                       int IdE= sc.nextInt();
                       Etudiants Et = etudiantImp.getEtudiantsbyId(IdE);
                       System.out.println("Nom: "+Et.getNom());
                       System.out.println("Prenom: "+Et.getPrenom());
                       System.out.println("Adresse: "+Et.getAdresse());
                       System.out.println("Telephone: "+Et.getTel());
                       System.out.println("Login: "+Et.getLogin());
                       System.out.println("Password: "+Et.getPassword());
                      
                   break;
                   
                   case 6:
                       System.out.println("au revoir");
                       
                       var1 = false;
                       var = true;
                   break;
                    default:
                     System.out.println("Choix invalid");
                     break;
               }
            }
               break;
               
               
           
           case 2:
                
                 boolean var2 = true ;
               
               while (var2) {
                
               System.out.println("*****************Gestion Professeur***********************"); 
               
               System.out.println("1- Ajouter professeur");
               System.out.println("2- Supprimer professeur");
               System.out.println("3- Modifier professeur");
               System.out.println("4- Afficher professeur");
               System.out.println("5- Voir detail");
               System.out.println("61- Retour");
               
               System.out.println("choix : ");
       
               int choixProfesseur  = sc.nextInt();
               switch(choixProfesseur)
               {
                   case 1:
                       
                       
                       System.out.println("Ajouter Professeur");
                       
                       System.out.println(" ID :");
                       
                       int id = sc.nextInt();
                       
                       System.out.println(" NOM  :");
                       
                       String nom = sc.next();
                       
                       System.out.println(" PRENOM :");
                       
                       String prenom = sc.next();
                       
                       System.out.println(" ADRESSE :");
                       
                       String adresse = sc.next();

                       System.out.println(" TELEPHONE :");
                       
                       String tel = sc.next();
                       
                       System.out.println(" LOGIN :");
                       
                       String login = sc.next();
                       
                       System.out.println(" PASSWORD :");
                       
                       String password = sc.next();
                       
                       Professeur prof = new Professeur(id, nom, prenom, adresse, tel, login, password);
                       
                       profesImp.addProfesseur(prof);
                       System.out.println(" Professeur ajouter avec succés");
                   break;
                   
                   case 2:
                       System.out.println("Supprimer Professeur ");
                       
                       System.out.println(" ID :");
                       
                       int IdSup = sc.nextInt();
                       Professeur Prof2 = profesImp.getProfesseurbyId(IdSup);
                       profesImp.deleteProfesseur(Prof2);
                       System.out.println("Suppression reussis");
                   break;
                   
                   case 3:
                       System.out.println("Modifier professeur");
                       
                       System.out.println(" ID :");
                       
                       int IdMod = sc.nextInt();
                       Professeur prof2 = profesImp.getProfesseurbyId(IdMod);
                       System.out.println(" NOM :");
                       String nomP = sc.next();
                       prof2.setNom(nomP);
                       
                       System.out.println(" PRENOM :");
                       String prenomP = sc.next();
                       prof2.setPrenom(prenomP);
                       
                       System.out.println(" ADRESSE :");
                       String adresseP = sc.next();
                       prof2.setAdresse(adresseP);
                       
                       System.out.println(" TELEPHONE :");
                       String telP = sc.next();
                       prof2.setTel(telP);
                       
                       System.out.println(" LOGIN :");
                       String loginP = sc.next();
                       prof2.setLogin(loginP);
                       
                       System.out.println(" PASSWORD :");
                       String passwordP = sc.next();
                       prof2.setPassword(passwordP);
                      
                       Professeur prof3 = profesImp.getProfesseurbyId(IdMod);
                       profesImp.updateProfesseur(prof3);
                       System.out.println("Modification reussis");
                   break;
                   
                   case 4:
                        System.out.println("Afficher professeur");
                       
                       List<Professeur> profe = profesImp.getAllprofesseur();
                       for(Professeur prof4:profe)
                       {
                           System.out.println("Id: "+prof4.getId()+",Nom: "+prof4.getNom()+", Prenom: "+
                                   prof4.getPrenom()+", Adresse: "+prof4.getAdresse()+", Tel: "+
                                   prof4.getTel()+", Login: "+prof4.getLogin()+", Password: "+
                                   prof4.getPassword());            
                       }
                   break;
                   
                   case 5:
                       System.out.println("ID :");
                       int IdE= sc.nextInt();
                       Professeur prof5 = profesImp.getProfesseurbyId(IdE);
                       System.out.println("Nom: "+prof5.getNom());
                       System.out.println("Prenom: "+prof5.getPrenom());
                       System.out.println("Adresse: "+prof5.getAdresse());
                       System.out.println("Telephone: "+prof5.getTel());
                       System.out.println("Login: "+prof5.getLogin());
                       System.out.println("Password: "+prof5.getPassword());
                      
                   break;
                   
                   case 6:
                       System.out.println("au revoir");
                       
                       var2 = false;
                       var = true;
                   break;
                    default:
                     System.out.println("Choix invalid");
                     break;
               }
            }
               
               break;
               
           case 3:
                
                 boolean var3 = true ;
               
               while (var3) {
 
                
               System.out.println("*****************Gestion Groupe***********************"); 
               
               System.out.println("1- Ajouter Groupe");
               System.out.println("2- Supprimer Groupe");
               System.out.println("3- Modifier Groupe");
               System.out.println("4- Afficher Groupe");
               System.out.println("5- voir detail ");
               System.out.println("6- Retour ");
               
               System.out.println("choix : ");
       
               int choixGroupe  = sc.nextInt();
               switch(choixGroupe)
               {
                   case 1:
                       
                       
                       System.out.println("Ajouter Groupe");
                       
                       System.out.println(" ID :");
                       
                       int id = sc.nextInt();
                       
                       System.out.println(" NOM GROUPE :");
                       
                       String nomGroupe = sc.next();
                       
                       System.out.println(" DATE CREATION :");
                       
                       String date_creation = sc.next();
                       
                       Groupe gro = new Groupe(id, nomGroupe, date_creation);
                       groupImp.addGroupe(gro);
                       System.out.println(" Groupe ajouter avec succés");
                   break;
                   
                   case 2:
                       System.out.println("Supprimer Gfroupe ");
                       
                       System.out.println(" ID :");
                       
                       int IdSup = sc.nextInt();
                       Groupe grou2 = groupImp.getGroupebyId(IdSup);
                       groupImp.deleteGroupe(grou2);
                       System.out.println("Suppression reussis");
                   break;
                   
                   case 3:
                       System.out.println("Modifier groupe");
                       
                       System.out.println(" ID :");
                       int IdMod = sc.nextInt();
                       Groupe Grp = groupImp.getGroupebyId(IdMod);
                       System.out.println(" NOM GROUPE:");
                       String nomG = sc.next();
                       Grp.setNomGroupe(nomG);
                       
                       System.out.println(" DATE CREATION :");
                       String date_creationG = sc.next();
                       Grp.setDate_creation(date_creationG);
                       Groupe grou3 = groupImp.getGroupebyId(IdMod);
                       groupImp.updateGroupe(grou3);
                       System.out.println("Modification reussis");
                   break;
                   
                   case 4:
                        System.out.println("Afficher Groupe");
                       
                       List<Groupe> grou = groupImp.getAllGroupe();
                       for(Groupe gro3:grou)
                       {
                           System.out.println("ID: "+gro3.getId()+" Nom Groupe: "+gro3.getNomGroupe()+","+
                                   " Date Creation: "+gro3.getDate_creation());            
                       }
                   break;
                   
                   case 5:
                       System.out.println("ID :");
                       int IdE= sc.nextInt();
                       Groupe groupe6 = groupImp.getGroupebyId(IdE);
                       System.out.println("Nom groupe: "+groupe6.getNomGroupe());
                       System.out.println("Date creation: "+groupe6.getDate_creation());
                      
                   break;
                   
                   case 6:
                       System.out.println("au revoir");
                       
                       var3 = false;
                       var = true;
                   break;
                   
                    default:
                     System.out.println("Choix invalid");
                     break;
               }
            }
               break;
               
                case  4:
                
                 boolean var4 = true ;
               
               while (var4) {
                
               System.out.println("*****************Gestion Groupe-Etudiant***********************"); 
               
               System.out.println("1- Ajouter Groupe-Etudiant");
               System.out.println("2- Supprimer Groupe-Etudiant");
               System.out.println("3- Modifier Groupe-Etudiant");
               System.out.println("4- Afficher Groupe-Etudiant");
               System.out.println("5- Voir detail");
               System.out.println("6- Retour");
               
               System.out.println("choix : ");
       
               int choixGroupeEtudiant  = sc.nextInt();
               switch(choixGroupeEtudiant)
               {
                   case 1:
                       
                       
                       System.out.println("Ajouter Groupe-Etudiants");
                       
                       System.out.println(" NOM GROUPE  :");
                       
                       String NomGroupe = sc.next();
                       
                       System.out.println(" ID :");
                       
                       int id = sc.nextInt();
                       
                       System.out.println(" NOM  :");
                       
                       String nom = sc.next();
                       
                       System.out.println(" PRENOM :");
                       
                       String prenom = sc.next();
                       
                       System.out.println(" ADRESSE :");
                       
                       String adresse = sc.next();

                       System.out.println(" TELEPHONE :");
                       
                       String tel = sc.next();
                       
                       System.out.println(" LOGIN :");
                       
                       String login = sc.next();
                       
                       System.out.println(" PASSWORD :");
                       
                       String password = sc.next();
                       
                       GroupeEtudiants grpEtd = new GroupeEtudiants(id, nom, prenom, adresse, tel, login, password, NomGroupe, password);
                       groupEtImp.addGroupeEtudiant(grpEtd);
                       System.out.println(" Groupe-Etudiant ajouter avec succés");
                   break;
                   
                   case 2:
                       System.out.println("Supprimer Groupe-Etudiants ");
                       
                       System.out.println(" ID :");
                       
                       int IdSup = sc.nextInt();
                       GroupeEtudiants grpEtd2 = groupEtImp.getGroupeEtudiantsbyId(IdSup);
                       groupEtImp.deleteGrpEtudiant(grpEtd2);
                       System.out.println("Suppression reussis");
                   break;
                   
                   case 3:
                       System.out.println("Modifier Groupe - Etudiants");
                       
                       System.out.println(" ID :");
                       
                       int IdMod = sc.nextInt();
                       GroupeEtudiants grp = groupEtImp.getGroupeEtudiantsbyId(IdMod);
                       
                       System.out.println(" NOM GROUPE:");
                       String nomG = sc.next();
                       grp.setNomGroupe(nomG);
                       
                       System.out.println(" NOM :");
                       String nomE = sc.next();
                       grp.setNom(nomE);
                       
                       System.out.println(" PRENOM :");
                       String prenomE = sc.next();
                       grp.setPrenom(prenomE);
                       
                       System.out.println(" ADRESSE :");
                       String adresseE = sc.next();
                       grp.setAdresse(adresseE);
                       
                       System.out.println(" TELEPHONE :");
                       String telE = sc.next();
                       grp.setTel(telE);
                       
                       System.out.println(" LOGIN :");
                       String loginE = sc.next();
                       grp.setLogin(loginE);
                       
                       System.out.println(" PASSWORD :");
                       String passwordE = sc.next();
                       grp.setPassword(passwordE);
                      
                       GroupeEtudiants grpEtd3 = groupEtImp.getGroupeEtudiantsbyId(IdMod);
                       groupEtImp.updateGrpEtudiants(grpEtd3);
                       System.out.println("Modification reussis");
                   break;
                   
                   case 4:
                        System.out.println("Afficher Groupe - Etudiants");
                       List<GroupeEtudiants> GrpEtu = groupEtImp.getAllgrpEtudiants();
                       for(GroupeEtudiants grpEtd4:GrpEtu)
                       {
                           System.out.println("Nom Groupe: "+grpEtd4.getNomGroupe()+", Id: "+grpEtd4.getId()+", Nom: "+grpEtd4.getNom()+", Prenom: "+
                                   grpEtd4.getPrenom()+", Adresse: "+grpEtd4.getAdresse()+", Telephone: "+
                                   grpEtd4.getTel()+", Login: "+grpEtd4.getLogin()+", Password: "+
                                   grpEtd4.getPassword());            
                       }
                   break;
                   
                   case 5:
                       System.out.println("ID :");
                       int IdE= sc.nextInt();
                       GroupeEtudiants grpEt = groupEtImp.getGroupeEtudiantsbyId(IdE);
                       System.out.println("Nom Groupe: "+grpEt.getNomGroupe());
                       System.out.println("Nom: "+grpEt.getNom());
                       System.out.println("Prenom: "+grpEt.getPrenom());
                       System.out.println("Adresse: "+grpEt.getAdresse());
                       System.out.println("Telephone: "+grpEt.getTel());
                       System.out.println("Login: "+grpEt.getLogin());
                       System.out.println("Password: "+grpEt.getPassword());
                      
                   break;
                   
                   case 6:
                       System.out.println("au revoir");
                       
                       var4 = false;
                       var = true;
                   break;
                    default:
                     System.out.println("Choix invalid");
                     break;
               }
            }
               
               break;
            case 5:
               System.out.println("***************** Fin du programme ***********************"); 
               System.exit(0);
               
               break;
            default:
                System.out.println("choix invalid");
                break;
                
       }
   } 
       }
       
}
