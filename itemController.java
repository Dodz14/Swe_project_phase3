import java.util.Scanner;

public class itemController {


	  itemService ServiceO = new itemService();

	  public void receive_request() 
	  {
		  System.out.println("1-post \n 2-search");
		  Scanner choice = new Scanner(System.in);
		  int choice0 = choice.nextInt();
		  if(choice0 == 1)
		  {
			  ServiceO.uploadItem();
		  }
		  else if(choice0 == 2)
		  {
			  ServiceO.Show_item();
		  }
	  }
	  public Boolean respond_to_request() 
	  {
		  return true;
	  }
	  

	

}
