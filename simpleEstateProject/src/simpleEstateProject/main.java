package simpleEstateProject;

import simpleEstateProject.estateManagement.Managment;
import simpleEstateProjectDataBaseManagement.MicrosoftSql;
import simpleEstateProjectDataBaseManagement.MysqlDatabase;
import simpleEstateProjectintities.Realty;

public class main {

	public static void main(String[] args) throws Exception {
		Realty realty =new Realty(1,"malatya","140mkare",600000);
		Managment m1=new Managment(new MysqlDatabase());
		m1.add(realty);
		

	}

}
