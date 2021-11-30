package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
	/*
	 * Girilen bir stringdeki a harfi sayýsýný bulunuz. ama c harfine gelirse
	 * döngüden çýkýlsýn
	 * 
	 * Bugün hava oldukca güzel.-> 2
	 *  
	 */
   
   Scanner scan=new Scanner (System.in);
   System.out.println("lütfen bir string griniz");
   String cumle=scan.nextLine();
   int sayaç=0;
   char harf='a';
   for (int i = 0; i <cumle.length(); i++) {
	     if (cumle.toLowerCase().charAt(i)=='a') {
			sayaç++;
			
		} else if (cumle.toLowerCase().charAt(i)=='c') {
			break;
		}
	   
	   
	   
	   
}
   System.out.println(sayaç);
   
   
   
   
   
    
   
    
    
    
    
    
    
    
    }}
   
   
   
   
    
    
    
    
    
    
    
    
    
    
    
    
   


