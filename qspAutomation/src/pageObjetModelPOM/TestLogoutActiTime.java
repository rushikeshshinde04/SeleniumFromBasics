package pageObjetModelPOM;import java.io.IOException;

public class TestLogoutActiTime extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		BaseTest bt = new BaseTest();
		bt.setUp();

		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUsername = flib.readPropertyData(PROP_PATH, "username");
		String validPassword = flib.readPropertyData(PROP_PATH, "password");

		lp.validLoginToActiTime(validUsername, validPassword);
		//we can use directly also after practice
		//lp.validLoginToActiTime( flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
        
		HomePage hp = new HomePage(driver);
		hp.logOutMethod();
	}

}
