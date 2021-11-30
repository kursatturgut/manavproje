package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
       
Scanner scan=new Scanner(System.in);
System.out.println("string griniz");
String metin=scan.nextLine();

ilkikisiz(metin);

   
    
    String a="ahmet";
    
    System.out.println(a.substring(2));
    
    
    
    
   }

	public static String ilkikisiz(String metin) {
		if (metin.startsWith("gh")) {
			System.out.println(metin);
		}else if (metin.startsWith("g")) {
			System.out.println(metin.charAt(0)+metin.substring(2));
		}else if (metin.charAt(1)=='h') {
			System.out.println(metin.substring(1));
		}else {
			System.out.println(metin.substring(2));
		}
		
		return null;
		
		
		
	}
}
