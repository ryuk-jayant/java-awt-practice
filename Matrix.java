import java.util.Scanner;

public class Matrix
{
	public static void main(String args[])
	{
	    
	    Scanner in = new Scanner(System.in);
		System.out.print("Enter N:");
		int N=in.nextInt();
		
		int a[][] = new int[N][N];
		int b[][] = new int[N][N];
		int c[][] = new int[N][N];
		int i,j;
	
		System.out.print("generating matrix A : \n");
		for(i=0;i<N;i++)
		{
			for(j=0;j<N;j++)
			{
				a[i][j] = i+j;
			}
		}
		
		System.out.print("generating matrix B : \n");
		for(i=0;i<N;i++)
		{
			for(j=0;j<N;j++)
			{
				b[i][j] = i+j;
			}
		}
		
		boolean flag=true;
		
		while(flag==true)
	{
		System.out.println("MENU");
		System.out.println("1 : Addition");
		System.out.println("2 : Multiplication");
		System.out.println("3 : Subtraction");
		System.out.println("4 : Exit");
		
		System.out.println("Enter your choice : ");
		int choice = in.nextInt();
		
		switch(choice)
		{
			case 1:
				for(i=0;i<N;i++)
				{
					for(j=0;j<N;j++)
					{
						c[i][j] = a[i][j] + b[i][j];
					}
				}
				
				System.out.println("Result : ");
				for(i=0;i<N;i++)
				{
					for(j=0;j<N;j++)
					{
						System.out.print(c[i][j]+"\t");
					}
					System.out.println();
				}
			break;
				
			case 2:
			   for (i = 0; i < N; i++) {
                    for (j = 0; j < N; j++) {
                        c[i][j] = 0;
                        for (int k = 0; k < N; k++) {
                        c[i][j] = c[i][j] + a[i][k] * b[k][j]; }
                        }
			   }
			   	System.out.println("Result : ");
				for(i=0;i<N;i++)
				{
					for(j=0;j<N;j++)
					{
						System.out.print(c[i][j]+"\t");
					}
					System.out.println();
				}
			break;
			case 3:
			    	for(i=0;i<N;i++)
				{
					for(j=0;j<N;j++)
					{
						c[i][j] = a[i][j] - b[i][j];
					}
				}
				
				System.out.println("Result : ");
				for(i=0;i<N;i++)
				{
					for(j=0;j<N;j++)
					{
						System.out.print(c[i][j]+"\t");
					}
					System.out.println();
				}
			break;
			case 4:
			    flag=false;
			break;
			default:
			System.out.println("INvalid");
			break;
		}
		
	}
		
	System.out.println("BYE!!");
		
}
}