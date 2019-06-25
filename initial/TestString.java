import java.util.Arrays;
public class TestString {
	
	public static void main (String[] args) {
		String s="this is my class";
		String arr[]=s.split("i");
		s=Arrays.toString(arr);
		System.out.println(s);
	}
}

