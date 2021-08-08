package ex;

public class ex07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		System.out.println(array.length);

		//작성 위치
		/*
		for(int i=0; i<array.length-1; i++) {
			for(int k=i+1; k<array.length; k++) {
				if (array[i]>array[k] && array[i]>max) {
					max = array[i];
				}
			}
		}
		*/
		for (int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max : "+max);
	}
}
