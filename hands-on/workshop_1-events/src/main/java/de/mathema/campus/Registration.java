package de.mathema.campus;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import de.mathema.campus.stereotypes.SingletonService;

@Transactional
@SingletonService
public class Registration implements IRegistration {

	@Inject
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see de.mathema.campus.IRegistration#register(de.mathema.campus.Customer)
	 */
	public String register(Customer customer) {
		Customer pCust = new Customer(customer);
		entityManager.persist(pCust);
		return "confirmation";
	}
}
