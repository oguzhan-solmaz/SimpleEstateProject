package simpleEstateProjectDataBaseManagement;

import simpleEstateProjectintities.Realty;

public class MysqlDatabase implements EstateDao {

	@Override
	public void add(Realty realty) {
		System.out.println("Mysql databasesine eklendi");
		
	}

	
	
}
