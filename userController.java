
import java.util.Scanner;

public class userController {

	  userService ServiceO = new userService();

	  public void receive_request() 
	  {
		  int choice0 = 0, choice1 = 0;
		  while(true)
		  {
			  System.out.println("\n What to do? ;) \n 1-Register \n 2-Login \n 3-exit");
			  Scanner choice = new Scanner(System.in);
			  choice0 = choice.nextInt();
			  if(choice0 == 1)
			  {
				  ServiceO.registerUser();
			  }
			  else if(choice0 == 2)
			  {
				  ServiceO.Login();
				  System.out.println("1-post \n 2-search");
				  choice1 = choice.nextInt();
				  if(choice1 == 1)
				  {
					  ServiceO.uploadMissItem();
				  }
				  else if (choice1 == 2)
				  {
					  ServiceO.Check_item();
				  }
			  }
			  else if(choice0 == 3)
				  break;

		  }
	  }

	  public Boolean respond_to_request() 
	  {
		  return true;
	  }

}

