package practice02;

public class Prob04 {
	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] arr1 = str.toCharArray();
		char[] arr2 = str.toCharArray();
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[arr1.length-1-i]; // 배열 길이 주의
		}
		return arr2;
	}

	public static void printCharArray(char[] array){
		System.out.println(array);
	}
}
