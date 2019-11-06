
public class PracticalTest {

	public static void main(String[] args) {
		
	  int arr[][]={{9,9,5},{0,8,5},{9,2,4}};
	  int min=arr[0][0];
	  for(int i =0; i<3; i++)// for rows
	  {
		  
		  for(int j =0; j<3; j++)// for columns in each row
		  {
			  if(arr[i][j]<min)
			  {
				 min=arr[i][j];
			  }
			  
		  }
	  }
			System.out.println(min);
			
		}

	}

