package Stream;

import java.util.ArrayList;
import java.util.List;

public class Dimension {
	public static void main (String[]args) {
		List<List<Integer>> a = new ArrayList<>();
        a.add(List.of(1,2,3,4));
        a.add(List.of(5,6,7,8));
        a.add(List.of(1,2,3,4));
        a.add(List.of(5,6,7,8));
        for(List<Integer> b:a) {
        	for(Integer C: b) {
        		System.out.print(C);
        	}
        	System.out.println();
        }
        
	}

}
