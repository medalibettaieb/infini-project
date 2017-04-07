package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistence.Property;
import persistence.User;

/**
 * Session Bean implementation class TaxesServices
 */
@Stateless
public class TaxesServices implements TaxesServicesRemote, TaxesServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public TaxesServices() {
	}

	@Override
	public void saveOrUpdateUser(User user) {
		entityManager.merge(user);
	}

	@Override
	public void saveOrUpdateProperty(Property property) {
		entityManager.merge(property);

	}

	@Override
	public void assignPropertyToUser(Integer idProperty, Integer idUser) {
		User userFound = entityManager.find(User.class, idUser);

		Property property = entityManager.find(Property.class, idProperty);
		property.setUser(userFound);

		entityManager.merge(property);

	}

	@Override
	public List<Property> findAllPropertiesByUserId(Integer idUser) {
		return entityManager.createQuery("SELECT p FROM Property p WHERE p.user.id=:param", Property.class)
				.setParameter("param", idUser).getResultList();
	}

	@Override
	public Double calculateTaxesByUserId(Integer idUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
