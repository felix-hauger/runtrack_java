/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour1.job06;

import java.util.ArrayList;

/**
 *
 * @author fel
 */
public class Etudiant {
    String nom;
    
    ArrayList<Integer> notes = new ArrayList<Integer>();
    
    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant();
        
        etudiant.nom = "Toto";
        
        etudiant.afficherNom();
            
        etudiant.ajouterNote(12);
        
        etudiant.ajouterNote(10);
        
        etudiant.ajouterNote(17);
        
        etudiant.ajouterNote(14);
        
        etudiant.afficherNotes();
        
        etudiant.meilleureNote();
        
        etudiant.pireNote();
        
        etudiant.moyenne();
    }
    
    public void afficherNom() {
        System.out.println("Nom de l'étudiant : " + this.nom);
    }
    
    public void ajouterNote(int note) {
        this.notes.add(note);
    }
    
    public void afficherNotes() {
        System.out.println("Notes : " + this.notes);
    }
    
    public void meilleureNote() {
        int meilleureNote = this.notes.get(0);
       
        for (int note : this.notes) {
            if (note > meilleureNote) {
                meilleureNote = note;
            }       
       }
       
       System.out.println("Note la plus haute : " + meilleureNote);
    }
    
    public void pireNote() {
        int pireNote = this.notes.get(0);
       
        for (int note : this.notes) {
            if (note < pireNote) {
                pireNote = note;
            }       
        }
       
        System.out.println("Note la plus basse : " + pireNote);    
    }
    
    public void moyenne() {
        double total = 0;
        
        for (int note : this.notes) {
            total += note;
        }
        
        double moyenne = total / this.notes.size();
        
        System.out.println("Moyenne : " + moyenne);
    }
}
