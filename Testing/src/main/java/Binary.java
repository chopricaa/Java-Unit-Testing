public class Binary {
	
		  int bins(int arr[], int start, int end, int target) {
			while(start <= end) {
				int mid = (start+end)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid] < target){
				start = mid+1;
				
			}
			else {
				end = mid-1;
			}
			
		  }
		 return -1;
			
		}
		  public static void main(String[] args) {
			  int arr[] = {1,4,6,8,9,34,56};
			  int target =9;
			  int n = arr.length;
			  Binary bs = new Binary();
			  int result = bs.bins(arr, 0, n-1, target);
			  System.out.println(result);
			  
		  }

	

	

}
