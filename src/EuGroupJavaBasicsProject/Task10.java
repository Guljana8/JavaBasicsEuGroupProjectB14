package EuGroupJavaBasicsProject;

public class Task10 {

	public static void main(String[] args) {
		//No. 10 Create 2 variables to hold the largest and the second largest

		int [] arr={1,2,5,6,3,2};  
		
		int	size=arr.length;
		
		int num;
			
			for (int i=0; i<size; i++) {
				
				for (int j=i+1; j<size; j++) {
				
				if(arr[i]>arr[j]){
		               num = arr[i];
		               arr[i] = arr[j];
		               arr[j] = num;
		            }
		         }
		      }
		      System.out.println("Third second largest number is: "+arr[size-2]);
		   
					
	}

}
