
public class missItemEntity {

	  int id;
	  String category_name;
	  String color;
	  String Serial_no;
	  String name;
	  String descr;

	  public void set_id(Integer ID) 
	  {
		  id = ID;
	  }

	  public void set_cn(String cn) 
	  {
		  category_name = cn;
	  }

	  public Integer get_id() 
	  {
		  return id;
	  }

	  public String get_cn() {
	  return category_name;
	  }

	  public void set_color(String c) 
	  {
		  color = c;
	  }

	  public void set_sn(String sn) 
	  {
		  Serial_no = sn;
	  }

	  public String get_color() 
	  {
	  return color;
	  }

	  public String get_sn() 
	  {
	  return Serial_no;
	  }
	  public void set_name(String n) 
	  {
		  name = n;
	  }

	  public String get_name() 
	  {
	  return name;
	  }
	  public void set_descr(String d) 
	  {
		  descr = d;
	  }

	  public String get_descr() 
	  {
	  return descr;
	  }

	}

