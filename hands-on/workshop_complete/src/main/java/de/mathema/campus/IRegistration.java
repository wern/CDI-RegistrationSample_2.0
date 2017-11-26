package de.mathema.campus;

import javax.inject.Named;

@Named("registration")
public interface IRegistration {

	public abstract String register(Customer customer);

}