public static void main(String[] args){

     int arr[] = {12,30,45,89,10};

	int max = arr[0];
	int min = arr[0];

         for(int i =0; i <arr.length; i++)
	{
		if(arr[i] < min)
		{
			min = arr[i];
		}

		if(arr[i] > max)
		{
			max = arr[i];
		}
	}
	
	system.out.println("The min number is" + min);
        system.out.println("The max number is" + max);

}
