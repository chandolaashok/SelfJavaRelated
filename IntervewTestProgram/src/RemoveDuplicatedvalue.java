import java.util.ArrayList;

public class RemoveDuplicatedvalue {

	public static void main(String[] args) {
		
		int arr[]= {4,4,8,5,4,0,9,9,7,7,7,2};

		ArrayList<Integer> al =new ArrayList<Integer>();
		for(int i =0; i<=arr.length; i++)
		{ int k =0;
			if(!al.contains(arr[i]))
			{
				al.add(arr[i]);// to add the values into the array list, now  we need to check or scan remaining things.... 
				k++;
				
				for(int j=i+1; j<arr.length; j++)// if i get 4 again in the traverse   j loop is for scanning purpose...
				{
					if(arr[i]==arr[j])
					{
						k++;
					}
				}
				System.out.println(arr[i]);
				System.out.println(k);
				 
			}

			
		}
	}

}
