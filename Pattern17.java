class Pattern17
{
	public static void main(String... S)
	{
		int alpha=65;   //A
		for(int i=4; i>=0; i--) //decrement
		{
			for(int j=0; j<=4; j++) // increment
				System.out.print((char)(alpha+i));
			System.out.println();
		}
	}
}