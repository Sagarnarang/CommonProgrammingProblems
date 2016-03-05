//Merge Sort

/*MergeSort is a Divide and Conquer algorithm. 
 * It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves. 
 * The merg() function is used for merging two halves. 
 * The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are sorted 
 * and merges the two sorted sub-arrays into one. S
 * 
 * */
public class mergeSort
{
	//merges two sub-arrays of arr[]
	 // First sub-array is arr[l..m]
    // Second sub-array is arr[m+1..r]
	static void merge(int arr[],int l ,int m,int r)
	{
		int sizeOfArray1=m-l+1;
		int sizeOfArray2=r-m;
		
		//create two new arrays
		int left[]=new int[sizeOfArray1];
		int right[]=new int[sizeOfArray2];
		
		//copy two new arrays 
		for(int i=0;i<sizeOfArray1;++i)
			left[i]=arr[l+i];
		for(int j=0;j<sizeOfArray2;++j)
		     right[j]=arr[m+1+j];
		
		//now merge the two temp arrays
		
		int i=0,j=0,k=l;
		while(i<sizeOfArray1 && j<sizeOfArray2)
		{
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else{
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		
		//copying the remaining elements of left array
		while(i<sizeOfArray1)
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		
		//copying the remaining elements of right array
		while(j<sizeOfArray2)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
		
	}
	
	static void sort(int arr[],int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			 // Sort first and second halves
			sort(arr,l,m);
			sort(arr,m+1,r);
			//merge the two sort values
			merge(arr, l, m, r);
		}
	}

	
	public static void main(String[] args)
	{
		int[] arr={1,2,56,9,-2,34,867,91,23};
		for(int x:arr)
		System.out.print(x+" ");
        sort(arr, 0, arr.length-1);
        System.out.println("  ");
        for(int x1:arr)
    		System.out.print(x1+" ");

        
		
	}

	
	


}

