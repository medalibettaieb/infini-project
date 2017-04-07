package services;

import java.util.List;

import javax.ejb.Remote;

import persistence.Property;
import persistence.User;

@Remote
public interface TaxesServicesRemote {
	void saveOrUpdateUser(User user);

	void saveOrUpdateProperty(Property property);

	void assignPropertyToUser(Integer idProperty, Integer idUser);

	List<Property> findAllPropertiesByUserId(Integer idUser);

	Double calculateTaxesByUserId(Integer idUser);
}
