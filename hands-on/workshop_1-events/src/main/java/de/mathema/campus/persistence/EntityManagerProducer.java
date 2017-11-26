package de.mathema.campus.persistence;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
* Zentrale Factory fuer EntityManager.
* 
*/
@ApplicationScoped
public class EntityManagerProducer {

	@Produces
	@Default
	@PersistenceContext
	private EntityManager em;
}
