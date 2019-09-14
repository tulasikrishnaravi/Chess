package lists;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class PropertiesReplica {

	  private HashMap<String,String> h=new HashMap<String,String>();
	
	public void set(String key,String value) {
		this.h.put(key, value);
		}
	
	public void get(String key) {
		
		System.out.println(h.get(key));
	}
	
	public void save(File file) {
		FileWriter f;
		try {
			f = new FileWriter(file);
		
		Set<Entry<String,String>> data=h.entrySet();
		Iterator it=data.iterator();
		while(it.hasNext()) {
			 System.out.println();
				f.write(it.next().toString()+" ");
				f.flush();
			}} catch (IOException e) {
				
				e.printStackTrace();
			}
			
	}
		public void loader(File file)
		{ 
			try {
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				String s=br.readLine();
				for(int i=0;i<s.split(" ").length;i++) {
					String text=s.split(" ")[i];
					String key=text.split("=")[0];
					String value=text.split("=")[1];
					h.put(key, value);
					}
					} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
				
			}
	
		public void list() {
			
			Set<Entry<String,String>> data=h.entrySet();
			Iterator it=data.iterator();
			while(it.hasNext()) {
				 System.out.println(it.next().toString());
					}
			
			
		}
	
	
}
