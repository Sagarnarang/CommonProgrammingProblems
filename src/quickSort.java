//Quick Sort

/* This function takes middle element as pivot, places the pivot element at its
   correct position in sorted array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right of pivot */

//Created by Sagar Narang on 3/06/16.
public class quickSort
{

	static int partition(int arr[],int l,int h)
	{
		int x=arr[(h+l)/2];
		int i=l-1;
		for(int j=l;j<=h-1;j++)
		{
			if(arr[j]<=x)
			{
				i++;
				//swap arr[i] and arr[j]
				int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
			}
		}
		
		//swap arr[i+1] and arr[h]
		int t=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=t;
	
		
		return (i+1);
		
	}
	
	static void quicksort(int arr[],int l,int h)
	{
		if(l<h)
		{
			int p=partition(arr, l, h);
			quicksort(arr, l, p-1);
			quicksort(arr, p+1, h);
		}
	}
	public static void main(String[] args)
	{
		int[] arr={1,2,56,9,-2,34,867,91,23};
		for(int x:arr)
		    System.out.print(x+" ");
		
        quicksort(arr,0,arr.length-1);
  
        System.out.println("  ");
        for(int x1:arr)
    		System.out.print(x1+" ");	
	}

}
