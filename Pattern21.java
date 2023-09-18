class pattern21
{
	public static void main(String... S)
	{
		
		int alpha=65;
		for(int i=0; i<=4; i++){
			for(int j=0; j<=4; j++){
				if(i%2==0)
						System.out.print((char)(alpha+j));
			else
                        System.out.print((char)(alpha+j+32));}
			System.out.println();}
	}
}