public class Cekbilangan{
	public static void main(String[] args){
		for(int i = 1; i <= 100; i++){
			if(i %2 == 0 && i %3 == 0){
				System.out.println("INDONESIA");
			}
			else if (i %2 == 0){
				System.out.println(i);
			}
			else if(i %2 == 1){
				System.out.println("Ganjil");
			}
			
		}
	}
}