class Pattern19
{
	public static void main(String... S)
	{
		int alpha=65;
		int k=0;
		for(int i=0; i<=4; i++){
			for(int j=0; j<=4; j++){
				k=j+(i*5);
				System.out.print((char)(alpha+k));
			}
		System.out.println();		
		}
	}
}