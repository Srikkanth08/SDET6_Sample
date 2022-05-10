package MavenExample;

import org.testng.annotations.Test;

public class ReadingDataFromCommandLineTest
{
	@Test(groups = "smoke")
	public void readingDataFromCommandLineTest()
	{
		System.out.println("Execute Poll SCM in Jenkins");
		String URL = System.getProperty("url");
		String UN = System.getProperty("username");
		String PWD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
	}
	
	@Test(groups = "regression")
	public void regression()
	{
		System.out.println("Execute Poll SCM in Jenkins");
		System.out.println("it is a regression test");
	}
	
}
