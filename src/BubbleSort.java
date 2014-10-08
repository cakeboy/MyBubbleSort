public class BubbleSort {
    
	
	public static void Swap(int[] array, int indexA, int indexB)
    {
        int tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }
	
	
	public static void Sort(int[] array)
    {
        for (int i = array.length - 1; i > 0; --i)
            for (int j = 0; j < i; ++j)
                if (array[j] > array[j + 1])
                    Swap(array, j, j + 1);
    }
 
    

	
	
	public static void main(String args[])
	{
		int[] arry1 = new int[5];
		arry1[0]=22;
		arry1[4]=33;
		arry1[1]=230;
		arry1[2]=23;
		arry1[3]=222;
		
		Sort(arry1);
		System.out.print("sort =");
		for(int i=0; i<arry1.length;i++)
		System.out.print(" "+arry1[i]);

		
	}
	
	
	
	
	 
}
