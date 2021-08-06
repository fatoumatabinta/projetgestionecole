/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.fatoumatabintandiaye.gestionscolaire.Doa;

import java.util.List;
import sn.fatoumatabintandiaye.gestionscolaire.model.Professeur;


/**
 *
 * @author fatoumata binta 
 */
public interface IProfesseur {
    public void addProfesseur(Professeur prof);
    public void deleteProfesseur(Professeur id);
    public void updateProfesseur(Professeur etudiant);
    public Professeur getProfesseurbyId(int i);
    public List<Professeur> getAllProfesseur();
}
