class Pattern15
{
	public static void main(String... S)
	{
	int alpha=65;
	for(int i=0; i<=4; i++)
	{
		for(int j=0; j<=4; j++)
		{
			System.out.print((char)(alpha+j+i));
		}
		System.out.println();
    }
}
}