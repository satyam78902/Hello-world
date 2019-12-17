package ashi;

import java.util.HashSet;

public class RemoveDuplicacybyHashSet {

	public static void main(String[] args) {
		int [] a = {1,4,3,5,7,2,7,3,8,0,9,4,2,6,3,5,2,4,6,2,0};
		
		//create HashSet Class object
		HashSet<Integer> hs = new HashSet<Integer>();
		
      for (int i=0;i<a.length;i++)
      {
    	  hs.add(a[i]);
      }
      // use for each loop
      for (int num : hs) {
    	  System.out.print(num+" ");
      }
	}

}
