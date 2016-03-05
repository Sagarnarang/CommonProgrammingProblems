//Insertion Sort

//Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.

//Created by Sagar Narang on 3/04/16.


public class selectionSort
{

	static void sort(int arr[])
	{
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			int key=arr[i];
			int j=i-1;
			//Move the elements arr[0...i-1] that are greater than the key, to one 
			//position ahead of their current position
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={1,2,56,9,-2,34,867,91,23};
		for(int x:arr)
		    System.out.print(x+" ");
		
        sort(arr);
  
        System.out.println("  ");
        for(int x1:arr)
    		System.out.print(x1+" ");	
	}

}
