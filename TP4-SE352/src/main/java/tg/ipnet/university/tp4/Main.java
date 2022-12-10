package tg.ipnet.university.tp4;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import tg.ipnet.university.tp4.entities.Cours;
import tg.ipnet.university.tp4.entities.Departement;
import tg.ipnet.university.tp4.entities.Etudiant;
import tg.ipnet.university.tp4.entities.Professeur;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("universitePU");
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction et = em.getTransaction();
        et.begin();
        
        Departement departement1 = new Departement("Programmation Systeme", "biologie.com");
        
        Departement departement2 = new Departement("Informatique", "informatique.com");
        
        Cours cours1 = new Cours("Programmation Systeme", new Date());
        Cours cours2 = new Cours("Programmation Orientée Objet", new Date());
        Cours cours3 = new Cours("Analyse Numérique", new Date());
        
        Etudiant etudiant1 = new Etudiant("Daniel", "GOGO K. ", "kossi.gogo@ipnetinstitute.com", "Lomé - TOGO", "93856735");
        etudiant1.setDepartement(departement2);
        Etudiant etudiant2 = new Etudiant("CEH", "Ethical danie ", "ec-concil.com", "Lomé - TOGO", "91233322");
        etudiant2.setDepartement(departement1);
        Etudiant etudiant3 = new Etudiant("OCA", "Javav", "oracle.com", "Lomé - TOGO", "3322444");
        etudiant3.setDepartement(departement1);
        Etudiant etudiant4 = new Etudiant("eJPT", "Elearning", "NLE@ipnetinstitute.com", "Lomé - TOGO", "99009988");
        etudiant4.setDepartement(departement2);
        
        
        Professeur professeur1 = new Professeur("HAMZA", "kondah", "kondah@ll.com", "Enseignant");
        Professeur professeur2 = new Professeur("BOSS", "123", "123B@ll.com", "Chef département");
        Professeur professeur3 = new Professeur("KAKA", "playOFF", "playOFF@dd.com", "Enseignant");
        

        em.persist(etudiant1);
        em.persist(etudiant2);
        em.persist(etudiant3);
        em.persist(etudiant4);
        et.commit();
        
    }
}
