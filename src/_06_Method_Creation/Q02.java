package _06_Method_Creation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluÅŸturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
       
Scanner scan=new Scanner(System.in);
System.out.println("name1 griniz");
String name1=scan.nextLine();   
System.out.println("name2 griniz");
String name2=scan.nextLine() ;   
      
    
    ortasýnaEkle(name1,name2);
    
    
  }

	private static void  ortasýnaEkle(String n1, String n2) {
	if (n1.length()%2==0) {
		System.out.println(n1.substring(0, n1.length()/2)+n2+n1.substring(n1.length()/2));
	
	
	
	
	
	} else {

	}	
	
	
	
	
	
	
	
	}





}
