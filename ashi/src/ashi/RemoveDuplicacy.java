package ashi;

public class RemoveDuplicacy {

	public static void main(String[] args) {
	
	int []	a = {1,1,1,1,2,2,3,3,4,5,5,5,5,6,7,8,9,9,9};
	int j =0;
	//int [] temp = new int[a.length];
	
  for(int i=0; i<a.length-1;i++) {
	  if(a[i]!=a[i+1]) {
		 a[j]=a[i];
		  j++;
	  }
  }
	
  a[j]=a[a.length-1];
  
  for ( int i=0;i<j+1;i++) {
	  System.out.print(a[i]+" ");
  }

 /* for (  j=0;j<a.length-1;j++) {
	  System.out.print(a[j]+" ");
  }
*/
	}

}
