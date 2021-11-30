package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
		List<String>isimler=new ArrayList<>();
		
		isimler.add("kutlu");
		isimler.add("emrah");
		isimler.add("ferhat");
		System.out.println(isimler);
		Collections.sort(isimler);
		System.out.println(isimler);
		*/
		List<String>yazý=new ArrayList<>();
	yazý.add("ali");
	yazý.add("veli");
	yazý.add("halý");
	System.out.println(yazý);
	
	System.out.println(yazý.contains("ali"));
	System.out.println(yazý.get(0));
	System.out.println(yazý.indexOf("halý"));
	System.out.println(yazý.remove(0));
	System.out.println(yazý);
	System.out.println(yazý.set(0, "hay"));
	System.out.println(yazý);
	
	}

}
