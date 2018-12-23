
public class userEntity {

	String name;
	String password;
	String email;
	String phone_num;
	
	public void set_name(String x)
	{
		name = x;
	}
	public void set_pass(String y)
	{
		password = y;
	}
	public void set_email(String z)
	{
		email = z;
	}
	public void set_phone(String v)
	{
		phone_num = v;
	}
	public String get_name()
	{
		return name;
	}
	public String get_pass()
	{
		return password;
	}
	public String get_email()
	{
		return email;
	}
	public String get_phone()
	{
		return phone_num;
	}
}
