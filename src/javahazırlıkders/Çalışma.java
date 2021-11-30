package javahazýrlýkders;

import java.util.Scanner;

public class Çalýþma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

		e.g:

		char ch1= 'a' ;

		String name =“John came late"

		Expected Output: Number of a = 2
*/	
	Scanner scan =new Scanner(System.in);
	System.out.println("lütfenbir isim ve entere basýp bir carakter griniz");
	String isim=scan.nextLine();
	String karakter=scan.nextLine();
	int sayaç=0;
	
	char ch1='a';
	
	
	for (int i = 0; i < isim.length(); i++) {
	if ((isim.toLowerCase().charAt(i)=='a')) {
		sayaç++;
	}
		
	}
	System.out.println(sayaç);
	
	
	
	 int say=0;
	int j =0;
	while (j<isim.length()) {
		
		if (isim.toLowerCase().charAt(j)=='a') {
			say++;
			
		}
		j++;
	}
	
	System.out.println(say);
	
	
	
	
	
	}

}
