public class CharCount {
	
	public static void main (String[] args) {
		String s="uhfHFFejFIJIFIHFoiOFHEIJIFFHF";
		String s1="";
		while (s.length()!=0)
		{
			s1=s.replace(""+s.charAt(0),"");
			System.out.println(s.charAt(0)+" "+(s.length()-s1.length()));
			s=s1;
		}
	}
}

