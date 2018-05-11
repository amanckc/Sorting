package sort;

public class QuickSort {

	
	public void qsort(int arr[],int left,int right)
	{
		if(left<right)
		{
			int part_index=partition(arr,left,right);
			qsort(arr,left,part_index-1);
			qsort(arr,part_index+1,right);
		}
	}
	
	
	public int partition(int arr[], int left, int right)
	    {
		int i = left-1; 
	        int pivot = arr[right]; 
	        
	        for (int j=left; j<right; j++)
	        {
	            if (arr[j] <= pivot)
	            {
	                i++;
	 
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	 
	        int temp = arr[i+1];
	        arr[i+1] = arr[right];
	        arr[right] = temp;
	 
	        return i+1;
	    }
	 
	
	
	
	public void printSortedarray(int arr[])
	{
		System.out.println("sorted arrray");
		for(int x:arr)
		{
			System.out.print(x+"-");
		}
	}
	
	
	public static void main(String[] args) {
		
		
		
		int arr[]= {641,5,12,212,112,1,22,43,442,430,0,8,80,7};
		
		//QuickSort obj=new QuickSort();
		long start=System.nanoTime();//System.currentTimeMillis();
		//obj.sort(arr,0,arr.length-1);
		int n = arr.length;
		 
        QuickSort ob = new QuickSort();
        ob.qsort(arr, 0, n-1);
		long end=System.nanoTime();//System.currentTimeMillis();
		
		ob.printSortedarray(arr);
		System.out.println();
		System.out.println("time="+(end-start));

	}
}
