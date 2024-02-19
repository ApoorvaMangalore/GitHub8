package workingWithUnitTestngTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	@DataProvider(name = "testdata")
	public String[][] getData() {
		String[][] data = new String[2][5];
		data[0][0] = "Apoorva";
		data[0][1] = "Mangalore";
		data[0][2] = "0987abc";
		data[0][3] = "0987abc";
		data[0][4] = "abc@123";

		data[1][0] = "Managlore";
		data[1][1] = "Apoorva";
		data[1][2] = "0987xyz";
		data[1][3] = "0987xyz";
		data[1][4] = "abc@098";
		return data;
	}

	@Test(dataProvider = "testdata")
	public void dataDemo(String Firstname, String Lastname, String pwd, String cnfmPwd, String email) {
		{
			System.out.println(Firstname);
			System.out.println(Lastname);
			System.err.println(pwd);
			System.out.println(cnfmPwd);
			System.out.println(email);
		}
	}
}
