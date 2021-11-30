package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 adet say� isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        Scanner scan=new Scanner (System.in);
    int toplam=0;   
    
    for (int i = 1; i <= 5; i++) {
		
	System.out.println("say�"+i+"giriniz");
    int say�=scan.nextInt();
    if (say�>5 && say�<10) {
		continue;
	}
     toplam+= say�;
    
    
    }
    System.out.println(toplam);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }

}
