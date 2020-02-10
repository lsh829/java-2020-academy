package d200210;

public class ArrayCopyEx2 {
	public static void main(String[] args) {
		String[] s1 = { "Java", "Oracle", "web" };
		String[] s2 = new String[s1.length + 3];
		//배열에서 객체는 null로 초기화가 된다.
		
		System.arraycopy(s1, 0, s2, 1, s1.length-1);
		
		System.out.println("s1 배열...");
		for(String s:s1) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println("s2 배열...");
		for(String s:s2) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
