package Day06.sec01;

import java.util.Properties;
import java.util.Set;

public class GetProEx {

	public static void main(String[] args) {
		 String osName = System.getProperty("os.name");
		 String userName = System.getProperty("user.name");
		 String userHome = System.getProperty("user.home");
		 System.out.println(osName);
		 System.out.println(userName);
		 System.out.println(userHome);
		 
		 Properties p = System.getProperties();
		 Set keys = p.keySet();
		 for(Object objKey : keys) {
			 String key = (String) objKey;
			 String value = System.clearProperty(key);
			 System.out.printf("%s: %s \n",key, value);
			 
		 }

	}

}
