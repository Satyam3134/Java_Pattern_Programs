class Pattern41
{
	public static void main(String... S)
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if((i==1 || i==7)||(j==1 || j==5))
				{
				    System.out.print("*");
				}
				else if((((i+j)==7))||(((i+j)==5)&& i==3)||(((i+j)==9)&& i==5))
				{
					System.out.print("*");
				}
			    else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}