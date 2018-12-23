import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
public class userService {
	
	public static ArrayList<userEntity> users = new ArrayList<userEntity>();

	public void registerUser()
	{
		userController ob = new userController();
		userEntity obj = new userEntity();
		userAccess object = new userAccess();
		System.out.println("Plz fill the following registration form \n");
		Scanner in_info = new Scanner(System.in);
		System.out.println("enter your name\n");
		obj.name = in_info.nextLine();
		
		System.out.println("enter your pass\n");
		obj.password = in_info.nextLine();

		System.out.println("enter your email\n");
		obj.email = in_info.nextLine();

		System.out.println("enter your phone number\n");
		obj.phone_num = in_info.nextLine();

		int size0 = users.size();
		users.add(obj);
		int size1 = users.size();
		if(ob.respond_to_request() && size1 > size0)
		{
			System.out.println("Registration Complete Thanks :)");
		}
		else
			System.out.println("Registration not Complete Plz enter your data...");

	}

	public void Login() 
	  {
		  String phone_no = new String();
		  String password = new String();
		  userController Again = new userController();
		  
		  Scanner in_info = new Scanner(System.in);
		  System.out.println("Please enter your password :\n");
		  password = in_info.nextLine();
		  Scanner in_info1 = new Scanner(System.in);
		  System.out.println("Please enter your phone number :\n");
		  phone_no = in_info1.nextLine();
		  
		  for (int i=0 ; i<users.size() ; i++) 
		  {
			  String x = new String();
			  x = users.get(i).password;
			  String y = new String();
			  y = users.get(i).phone_num;
			  if (x.equals(password)  &&  y.equals(phone_no)) 
			  {
				  System.out.println("Login successfully");
				  return;
			  }
		  }
			  
			  
				  System.out.println("1- login again \n 2- register");
				  int choice0;
				  choice0 = in_info.nextInt();
				  
				  if (choice0==1) 
				  {
					  Login();
				  }
				  else if (choice0==2)
				  {
					  registerUser();
				  }
				  
				  else 
					  Again.receive_request();	  
	}

	  

	  public void uploadMissItem() 
	  {
		  itemController obj = new itemController();
		  obj.receive_request();
		  

	  }

	  public void Check_item() 
	  {
    	 itemController ob = new itemController();
    	 ob.receive_request();
	  }




}
