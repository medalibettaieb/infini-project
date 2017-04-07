package gui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.TaxesServicesRemote;

public class TestAssignPropertiesToUsers {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TaxesServicesRemote taxesServicesRemote = (TaxesServicesRemote) context
				.lookup("taxes-infini-ear/taxes-infini-ejb/TaxesServices!services.TaxesServicesRemote");

		taxesServicesRemote.assignPropertyToUser(1, 2);
		taxesServicesRemote.assignPropertyToUser(2, 2);
		taxesServicesRemote.assignPropertyToUser(3, 3);

	}

}
