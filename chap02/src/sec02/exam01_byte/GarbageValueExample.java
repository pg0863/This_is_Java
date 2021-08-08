package sec02.exam01_byte;

public class GarbageValueExample {
	public static void main(String[] args) {
		
		byte var1 = 125;
		
		for(int i=0;i<5;i++){
			var1 += 5;
			System.out.println(var1);
		}
	}
}
