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

	




}
