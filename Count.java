package Stream;

import java.util.Arrays;
import java.util.List;

public class Count {
	public static void main (String[]args) {
		List<Integer> a=Arrays.asList(4,4,5,3);
		int sum =0;
		int count =0;
		for(int i=0;i<a.size();i++) {
			for(int j=i+1;j<a.size();j++) {
				if(a.get(i)==a.get(j))  {
					sum = a.get(i)+a.get(j);
					count++;
				}
			}
		}
		System.out.println("Sum "+sum);
		System.out.println("Count "+count);
	}

}
