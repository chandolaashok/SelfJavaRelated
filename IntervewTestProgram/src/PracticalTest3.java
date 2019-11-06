
public class PracticalTest3 {

	public static void main(String[] args) {
		/*
		  2   4   5 
		  3   4   0
		  1   2   9    Find  maximum number in the matrix
		 */
	  
		 int arr[][]={{2,4,5},{3,4,0},{1,2,9}};
		int max=arr[0][0];
		 for(int i=0; i<3;i++)
		 {
			 for(int j=0; j<3; j++)
			 {
				 if(arr[i][j]<max)
				 {
					 max=arr[i][j];
				 }
			 }
		 }
		
		 
		}

	}

