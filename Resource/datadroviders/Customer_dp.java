package datadroviders;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Ultility.Dataprovidercontroller;

public class Customer_dp 
{

	@DataProvider(name="createcustomer")
	public Object[][] customer () throws IOException
	{
		
		return Dataprovidercontroller.Customer_DC();
	}
	
	@DataProvider(name="deletecustomer")
	public Object[][] deletecustomer () throws IOException
	{
		
		return Dataprovidercontroller.deletecustomer_DC();
	}
	
}
