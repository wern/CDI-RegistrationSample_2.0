package de.mathema.campus;

import de.mathema.campus.stereotypes.SingletonService;

@SingletonService
public class Registration implements IRegistration {

	/* (non-Javadoc)
	 * @see de.mathema.campus.IRegistration#register(de.mathema.campus.Customer)
	 */
	public String register(Customer customer) {
		System.out.println(customer + " registered.");
		return "confirmation";
	}
}
