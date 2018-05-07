package sort;

public class InsertionSort {
//time -O(n^2) ;;; best O(n)
	public void sort(int array[])
	{
		int n = array.length;
        for (int i=1; i<n; ++i)
        {
            int key = array[i];
            int j = i-1;
            while (j>=0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
	}
	
	public void printSortedarrayay(int array[])
	{
		System.out.println("sorted arrayray");
		for(int x:array)
		{
			System.out.print(x+"-");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[]= {641,5,12,212,112,0,11,3134,11,43};
		
		InsertionSort obj=new InsertionSort();
		long start=System.nanoTime();//System.currentTimeMillis();
		obj.sort(array);
		long end=System.nanoTime();//System.currentTimeMillis();
		
		obj.printSortedarrayay(array);
		System.out.println();
		System.out.println("time="+(end-start));

	}
}
