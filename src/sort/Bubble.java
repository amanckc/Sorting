package sort;


public class Bubble{

	public int[] sort(int arr[])
	{    boolean isSwapped=false;
		for (int i=0;i<arr.length-1 ;i++ ) {
			

			for (int j=0; j<arr.length-1-i;j++ ) {
				if(arr[j+1]<arr[j])
				{	isSwapped=true;
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			
			if(isSwapped==false)
				break;
		}
		
		return arr;
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
		
		Bubble obj=new Bubble();
		long start=System.nanoTime();//System.currentTimeMillis();
		obj.sort(arr);
		long end=System.nanoTime();//System.currentTimeMillis();
		
		obj.printSortedarray(arr);
		System.out.println();
		System.out.println("time="+(end-start));

	}
}

