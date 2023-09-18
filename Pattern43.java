class Pattern43
{
	public static void main(String... S)
	{    
       for (int i=1; i<=5; i++)  
          {  
             for (int j=5; j>=1;j--)  
                {  
			        if((i+j)<=6){
			        System.out.print(j+i-1);} 
                }    
             System.out.println("");  
           }  
	}
}
