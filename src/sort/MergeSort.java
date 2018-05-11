package sort;

public class MergeSort {

	
	public void sort(int arr[],int left,int right)
	{
		if (left < right)
        {
            
            int middle = (left+right)/2;
            sort(arr, left, middle);
            sort(arr , middle+1, right);
            merge(arr, left, middle, right);
        }
	}
	public void merge(int arr[],int l,int m,int r)
	{
		int num_left=(m-l)+1;int i;

		int num_right=r-m;
		int left_part[]=new int[num_left];
		int right_part[]=new int[num_right];

		for(i=0;i<num_left;i++)
			left_part[i]=arr[l+i];
		for (i=0;i<num_right;i++) 
			right_part[i]=arr[m+i+1];


		i = 0; int j = 0; int k = l;
        while (i <  num_left && j <  num_right)
        {
            if (left_part[i] <= right_part[j])
            {
                arr[k] = left_part[i];
                i++;
            }
            else
            {
                arr[k] = right_part[j];
                j++;
            }
            k++;
        }
        while (i <  num_left)
        {
            arr[k] = left_part[i];
            i++;
            k++;
        }
        while (j <  num_right)
        {
            arr[k] = right_part[j];
            j++;
            k++;
        }
			
		
	}
	
	public void printSortedArray(int arr[])
	{
		System.out.println("sorted arrray");
		for(int x:arr)
		{
			System.out.print(x+"-");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {641,5,12,212,112,1,22,43,442,430,0,8,80,7};
		
		MergeSort obj=new MergeSort();
		long start=System.nanoTime();//System.currentTimeMillis();
		obj.sort(arr,0,arr.length-1);
		long end=System.nanoTime();//System.currentTimeMillis();
		
		obj.printSortedArray(arr);
		System.out.println();
		System.out.println("time="+(end-start));

	}
	
}
