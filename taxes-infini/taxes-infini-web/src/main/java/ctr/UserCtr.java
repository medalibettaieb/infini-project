package ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import persistence.Agent;
import services.TaxesServicesLocal;

@ManagedBean
public class UserCtr {
	@EJB
	private TaxesServicesLocal taxesServicesLocal;
	private Agent agent = new Agent();

	public void doSaveOrUpdateAgent() {
		taxesServicesLocal.saveOrUpdateUser(agent);
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

}
