package lists;

import java.io.File;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String args[]) {
		PropertiesReplica t=new PropertiesReplica();
		File f=new File("D:\\MY-DOC\\Desktop\\tulasi");
		t.loader(f);
	   File f1=new File("D:\\MY-DOC\\Desktop\\gps");
	   t.save(f1);
	   t.list();
	   
	   
	   
	}
}
