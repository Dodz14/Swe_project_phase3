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

	
	

}
