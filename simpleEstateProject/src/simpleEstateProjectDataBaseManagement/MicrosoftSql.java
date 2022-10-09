package simpleEstateProjectDataBaseManagement;

import simpleEstateProjectintities.Realty;

public class MicrosoftSql implements EstateDao{

	@Override
	public void add(Realty realty) {
		System.out.println("Microsoft databasesine eklendi");
		
	}

}
