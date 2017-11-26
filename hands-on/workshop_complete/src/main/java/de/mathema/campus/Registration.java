package de.mathema.campus;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import de.mathema.campus.qualifiers.Registered;
import de.mathema.campus.stereotypes.SingletonService;

@Transactional
@SingletonService
public class Registration implements IRegistration {

	@Inject
	private EntityManager entityManager;

	@Inject @Registered
	private Event<Customer> newCustomerEvent;

	/* (non-Javadoc)
	 * @see de.mathema.campus.IRegistration#register(de.mathema.campus.Customer)
	 */
	public String register(Customer customer) {
		Customer pCust = new Customer(customer);
		entityManager.persist(pCust);
		newCustomerEvent.fire(pCust);
		return "confirmation";
	}
}
