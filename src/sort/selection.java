package sort;

public class selection {
	//time - O(n^2)
		//space -O(n)
		public void sort(int array[]) {
			for(int i=0;i<array.length;i++)
			{
				int index_min=i;
				for(int j=i+1;j<array.length;j++)
				{
					if(array[j]<array[index_min])//find min element in array
						index_min=j;
				}
				int temp=array[index_min];
				array[index_min]=array[i];
				array[i]=temp;
			}
			
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
			// TODO Auto-generated method stub
			
			
			int arr[]= {641,5,12,212,112,1,22,43,442,430,0,8,8,7};
			
			selection obj=new selection();
			long start=System.nanoTime();//System.currentTimeMillis();
			obj.sort(arr);
			long end=System.nanoTime();//System.currentTimeMillis();
			
			obj.printSortedarray(arr);
			System.out.println();
			System.out.println("time="+(end-start));

		}

	}
