/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.fatoumatabintandiaye.gestionscolaire.Doa;

import java.util.List;
import sn.fatoumatabintandiaye.gestionscolaire.model.Etudiants;

/**
 *
 * @author fatouamata binta 
 */
public interface IEtudiant {
    public void addEtudiant(Etudiants etudiant);
    public void deleteEtiant (Etudiants id);
    public void updateEtudiants(Etudiants etudiant);
    public Etudiants getEtudiantsbyId(int i);
    public List<Etudiants> getAllEtudiants();
}
