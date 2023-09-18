class pattern22{
	public static void main(String... S){
		int alpha=64;
		for(int i=0; i<=4; i++){
			for(int j=1; j<=5; j++){
				if(i%2==0)
						System.out.print(j);
			else
                        System.out.print((char)(alpha+j));}
			System.out.println();
			}}}