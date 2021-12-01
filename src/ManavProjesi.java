import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProjesi {
	static List<String>manav=new  ArrayList<>();
    static 	List<Double>fiyat=new ArrayList<>();
  static  double total=0;


	public static void main(String[] args) {
		 /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
		manav.add("elma");
	    manav.add("armut");
		manav.add("portakal");
		manav.add("mandalina");	
		manav.add("muz");
		manav.add("kavun");	

		fiyat.add(8.0);
		fiyat.add(7.0);
		fiyat.add(4.0);
		fiyat.add(1.0);
		fiyat.add(9.0);
		fiyat.add(3.0);


Scanner scan=new Scanner(System.in);

	ürünSeç();
	
	}

	private static void kasa() {
		System.out.println("ücret toplamý:"+total);		
	}

	private static void ürünSeç() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen almak istediðiniz ürünü yyazýnýz (oelma için 0) (armutiçin 1) portakal 2 mandalina 3 muz 4 kavun 5   ");
	
		int secim=scan.nextInt();
		if (secim<0 || secim>5) {
			System.out.println("lütfen geçerli bir seçim yapýnýz");
		ürünSeç();
		
		}
	    System.out.println("kaç kilo istediðinizi griniz");
	    int kilo=scan.nextInt();
       double  tutar=fiyat.get(secim);
	  double enToplam=tutar*kilo;
	 total+=enToplam;
	System.out.println("devam etmek için d  bitirmek için ç basýnýz ");
	String iþlem=scan.next();
	if (iþlem.equalsIgnoreCase("d")) {
		ürünSeç();
	}else {
		kasa();
	}
	
	
	}
	
	

}




