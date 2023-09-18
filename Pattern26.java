class Pattern26
{
	public static void main(String... S)
	{
		for(int i=0; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(j+i+1);
			}
		System.out.println();		
		}
	}
}