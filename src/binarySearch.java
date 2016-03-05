//Binary Search

/*
 * 
Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].
 */

//Created by Sagar Narang on 3/04/16.
public class binarySearch
{
	
	static int binarySearchFunction(int arr[],int low,int high,int x)
	{
		if(low<=high)
		{
			int middleElement=(low+high)/2;
			if(arr[middleElement]==x)
				return middleElement;
			else if(arr[middleElement]<x)
				return binarySearchFunction(arr, middleElement+1, high, x);
			else
				return binarySearchFunction(arr, low, middleElement-1, x);
			
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int arr[]={1,2,5,10,123,134,198,1230};
		int elementToBeFound=1230;
		System.out.println("Element to be found= "+elementToBeFound);
		int searchResult=binarySearchFunction(arr, 0, arr.length-1, elementToBeFound);
		if(searchResult==-1)
			System.out.println("Element Not Found");
		else
		System.out.println("Element found at position= "+(searchResult+1));

	}

}
