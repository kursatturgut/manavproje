package _04_switchCase1haluk;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasýna göre , ayýn kaç gün  oldugunu sayý ile yazdýrýnz
Scanner scan=new Scanner(System.in);
System.out.print("lütfen ay numarasýný giriniz");
int ayno=scan.nextInt();

switch (ayno) {
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 112:
	System.out.println("31 gün");
	break;
case 4:
case 6:
case 9:
case 11:
	System.out.println("30 gün");
	break;
case 2:
	
	System.out.print("yýlý giriniz");
	int yýl=scan.nextInt();
	if (yýl%4==0) {
		System.out.println("29 gün");
	}else {
		System.out.println("28 gün");
	}
	
	break;

default:
	System.out.println("geçerli bir ay griniz");
	break;
}    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}

