import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class itemService {
public static ArrayList<missItemEntity> items = new ArrayList<missItemEntity>();

	public void Show_item() 
	  {
		 		System.out.println("\n enter your search method \n by \n 1-name \n 2-category \n 3-color \n 4-serial no.\n");
		 		Scanner choice = new Scanner(System.in);
		 		int choice0 = choice.nextInt();
     if(choice0 == 1)
     {
	 		Scanner choice11 = new Scanner(System.in);
    	 	String name = new String();
     		System.out.println("enter item name");
     		name = choice11.nextLine();
     		for(int i=0 ; i<items.size() ; i++)
      	{
      			if(name.equals(items.get(i).name)) {
        			System.out.println(items.get(i).id);
        			System.out.println(items.get(i).name);
        			System.out.println(items.get(i).color);
        			System.out.println(items.get(i).category_name);
        			System.out.println(items.get(i).descr);
        			System.out.println("\n");
      			}
     	  }	
     }
     else if(choice0 == 2)
     {
	 		Scanner choice11 = new Scanner(System.in);
    	 	String category = new String();
	 		System.out.println("enter item category\n");
	 		 category = choice11.nextLine();
     		for(int i=0 ; i<items.size() ; i++)
     	{
      			if(category.equals(items.get(i).category_name)) {
            			System.out.println(items.get(i).id);
            			System.out.println(items.get(i).name);
            			System.out.println(items.get(i).color);
            			System.out.println(items.get(i).category_name);
            			System.out.println(items.get(i).descr);
            			System.out.println("\n");
                  }
     	  }		
     }
     else if(choice0 == 3)
     {
	 		Scanner choice11 = new Scanner(System.in);
		 	String color = new String();

     System.out.println("enter item color\n");

         color = choice11.nextLine();
     		for(int i=0 ; i<items.size() ; i++)
      	{
      			if(color.equals(items.get(i).color)) {
        			System.out.println(items.get(i).id);
        			System.out.println(items.get(i).name);
        			System.out.println(items.get(i).color);
        			System.out.println(items.get(i).category_name);
        			System.out.println(items.get(i).descr);
        			System.out.println("\n");
                  }
      	
     	  }		
     }
     else if(choice0 == 4)
     {
	 		Scanner choice11 = new Scanner(System.in);
		 	String serial_no = new String();

     System.out.println("enter item serial no.\n");

        serial_no = choice11.nextLine();
     		for(int i=0 ; i<items.size() ; i++)
      	{
      			if(serial_no.equals(items.get(i).Serial_no)) {
        			System.out.println(items.get(i).id);
        			System.out.println(items.get(i).name);
        			System.out.println(items.get(i).color);
        			System.out.println(items.get(i).category_name);
        			System.out.println(items.get(i).descr);
        			System.out.println("\n");
                  }
     	  }		
     }
	  }

 public void uploadItem() 
	  {
		  missItemEntity obj = new missItemEntity();
		  itemController ob = new itemController();
		  System.out.println("Plz fill the following item description form \n");
			Scanner in_info = new Scanner(System.in);
			System.out.println("enter item name\n");
			obj.name = in_info.nextLine();
			
			System.out.println("choose item category\n 1-electronics\n 2-wallets\n 3-animals\n 4-Bags\n 5-Glasses\n 6-Study tools\n 7-Books\n 8-Other\n");
			int choice = in_info.nextInt();
			if(choice == 1)
				obj.category_name = "electronics";
			else if(choice == 2)
				obj.category_name = "wallets";
			else if(choice == 3)
				obj.category_name = "animals";
			else if(choice == 4)
				obj.category_name = "Bags";
			else if(choice == 5)
				obj.category_name = "Glasses";
			else if(choice == 6)
				obj.category_name = "Study tools";
			else if(choice == 7)
				obj.category_name = "Books";
			else 
				obj.category_name = "Other";
			System.out.println("\n");
			Scanner in_info11 = new Scanner(System.in);

			System.out.println("enter short description about item\n");
			obj.descr = in_info11.nextLine();
			
			System.out.println("enter item color\n");
			obj.color = in_info11.nextLine();

			System.out.println("enter item serial.no\n");
			obj.Serial_no = in_info11.nextLine();
			
			Random rand = new Random();
			obj.id = rand.nextInt(50) + 1;
			int size0 = items.size();
			items.add(obj);
			int size1 = items.size();
			if(ob.respond_to_request() && size1 > size0)
			{
				System.out.println(size1);
				System.out.println("post Complete Thanks :)");
			}
			else
				System.out.println("post not Complete Plz enter your data...");
			
		  
	  }

	
	

}
