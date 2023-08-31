package Stream;

public class StringReverse {
	public static void main (String[]args) {
		String a= "abc123def";
		String temp =" ";
		char[]b = a.toCharArray();
		for(int i=b.length-1;i>=0;i--) {
			if(b[i]=='1') {
			continue;
		}else {
			temp = temp+b[i];
		}
	}
		System.out.println(temp);
	}
}
