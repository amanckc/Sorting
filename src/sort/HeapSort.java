package sort;

public class HeapSort {

	public HeapSort() {

		// TODO Auto-generated constructor stub
	}
	
	
	
	public void sort(int arr[])
	{
		int mid=(arr.length/2)-1;
		for(int i=mid;i>0;i--)
		{
			heapify(arr,arr.length,i);
		}
		
		for(int i=arr.length-1;i>0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
		
	}
	
	public void heapify(int arr[],int index,int root )
	{
		int max= root;
		int left=(2*root)+1;
		int right=(2*root)+2;
		
		
				
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
		
		
		long start=System.nanoTime();//System.currentTimeMillis();
		
		int n = arr.length;
		 
       HeapSort ob = new HeapSort();
        ob.sort(arr);
		long end=System.nanoTime();//System.currentTimeMillis();
		
		ob.printSortedarray(arr);
		System.out.println();
		System.out.println("time="+(end-start));

	}
}
