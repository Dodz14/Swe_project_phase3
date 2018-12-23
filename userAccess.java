import java.awt.List;
import java.util.ArrayList;

public class userAccess {

	userService userd = new userService();
	ArrayList<userEntity> usersdata = new ArrayList<userEntity>(userd.users);

}
