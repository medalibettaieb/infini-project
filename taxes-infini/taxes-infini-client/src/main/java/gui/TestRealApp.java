package gui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Agent;
import persistence.Citizen;
import persistence.Property;
import services.TaxesServicesRemote;

public class TestRealApp {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TaxesServicesRemote taxesServicesRemote = (TaxesServicesRemote) context
				.lookup("taxes-infini-ear/taxes-infini-ejb/TaxesServices!services.TaxesServicesRemote");

		Citizen citizen = new Citizen();
		citizen.setName("salah");
		citizen.setRegion("gafsa");

		Citizen citizen2 = new Citizen();
		citizen2.setName("samia");
		citizen2.setRegion("tunis");

		Agent agent = new Agent();
		agent.setLevel("moudir");
		agent.setName("kamel");

		Property property = new Property();
		property.setPlace("gamarth");

		Property property2 = new Property();
		property2.setPlace("ghazela");

		Property property3 = new Property();
		property3.setPlace("sahara");

		taxesServicesRemote.saveOrUpdateUser(agent);
		taxesServicesRemote.saveOrUpdateUser(citizen);
		taxesServicesRemote.saveOrUpdateUser(citizen2);

		taxesServicesRemote.saveOrUpdateProperty(property);
		taxesServicesRemote.saveOrUpdateProperty(property2);
		taxesServicesRemote.saveOrUpdateProperty(property3);

	}

}
