class Pattern34
{
	public static void main(String... S)
	{
		int alpha=64;
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print((char)(alpha+j+i+1));
			}
		System.out.println();			
		}
	}
}


