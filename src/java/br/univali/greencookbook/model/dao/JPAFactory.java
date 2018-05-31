/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.greencookbook.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author biankatpas
 */
public class JPAFactory {

    private static EntityManagerFactory factory;

    private JPAFactory() {
 
    };

    public static EntityManager getEntityManager() {
	if (factory == null) {
	    factory = Persistence.createEntityManagerFactory("GCBPU");
	}
	return factory.createEntityManager();
    }
}
