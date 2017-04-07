package services;

import java.util.List;

import javax.ejb.Local;

import persistence.Property;
import persistence.User;

@Local
public interface TaxesServicesLocal {
	void saveOrUpdateUser(User user);

	void saveOrUpdateProperty(Property property);

	void assignPropertyToUser(Integer idProperty, Integer idUser);

	List<Property> findAllPropertiesByUserId(Integer idUser);

	Double calculateTaxesByUserId(Integer idUser);
}
