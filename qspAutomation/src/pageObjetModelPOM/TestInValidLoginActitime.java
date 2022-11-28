package pageObjetModelPOM;

import java.io.IOException;

public class TestInValidLoginActitime extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
        int rc=flib.getRowCount(Excel_PATH, "invaliddata");
		for(int i=1;i<rc;i++)
		{
			String invalidUsername = flib.readExcelData(Excel_PATH, "invaliddata", i, 0);
			String invalidPassword = flib.readExcelData(Excel_PATH, "invaliddata", i, 1);

			lp.inValidLoginToActiTime(invalidUsername, invalidPassword);

		}
		
		bt.tearDown();



	}

}
