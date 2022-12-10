package com.federation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("federationdb");
        EntityManager em=emf.createEntityManager();
        
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        Joueur joueur1=new Joueur("DJANTA", "Samuel", "DJAS020800", 10);
        em.persist(joueur1);
        tx.commit();
    }
}
