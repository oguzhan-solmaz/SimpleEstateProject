/**
 * 
 */
package simpleEstateProject.estateManagement;


import simpleEstateProjectDataBaseManagement.EstateDao;
import simpleEstateProjectintities.Realty;

/**
 * @author oguzh
 *
 */
public class Managment {
	
	private EstateDao estatedao;
	
	public Managment(EstateDao estatedao) {
		super();
		this.estatedao = estatedao;
	}

	public void add(Realty realty) throws Exception {
		if(realty.getUnitPrice()<400000) {
			throw new Exception("400000 den aşağı ev bulunmaz");
		}
		estatedao.add(realty);
		
		
	}

}
