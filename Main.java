
public class Main{
	public static void main(String[] args){
	      System.out.println();
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==1 || i==4 || j==4){
					System.out.print("* ");
				} else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//A
		  System.out.println();
		  for (int i = 0; i <=4; i++) {
            for (int j = 0; j <=4; j++) {
                if (i == 0 || i == 2 || j == 0 || j == 4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
          System.out.println();
        //Y
          for (int i = 0; i <=4; i++) {
            for (int j = 0; j <=4; j++) {
                if ((j== 4 || j == 0)&&i<2) {
                    System.out.print("* ");
                } else if (j == 2 && i>=2) {
                    System.out.print("* ");
                }
                 else if(i==2){
                     System.out.print("* ");
                 }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
          System.out.println();
        //A
         for (int i = 0; i <=4; i++) {
            for (int j = 0; j <=4; j++) {
                if (i == 0 || i == 2 || j == 0 || j == 4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
         System.out.println();
        //N
           for (int i = 0; i <=4; i++) {
            for (int j = 0; j <=4; j++) {
                if (i==j || j == 0 || j == 4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        //T
        System.out.println();
        for (int i = 0; i <=4; i++) {
            for (int j = 0; j <=4; j++) {
                if (i==0 || j == 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
	}
}