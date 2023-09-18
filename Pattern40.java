class pattern40
{
	public static void main(String... S)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if((i==1 || i==5)||(j==1 || j==5))
				{
					if(j==5)
					{
						System.out.print(j-i+1);
					}
					else if(i==5)
					{
						System.out.print(i-(j-1));
					}
					else
					{
				     System.out.print(j+i-1);
					}
				}
			    else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}