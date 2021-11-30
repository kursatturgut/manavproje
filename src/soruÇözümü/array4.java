package soruÇözümü;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */
	
		int[] arr= {5,7,-6,4,2,15,3,8,1};
		int istenenToplam=9;
	istenenDeger( arr,istenenToplam);
	
	
	
	}

	private static void istenenDeger(int[] arr, int istenenToplam) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]+arr[j]==istenenToplam) {
					System.out.println(arr[i]+","+arr[j]+" "+"istetn toplamdýr");
			
			}
		
		
		}
	
	
	
	
	}
	}
}
