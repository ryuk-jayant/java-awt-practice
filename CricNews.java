import java.util.Scanner;
class Cricketer{
	String name;
	int nofFifty,nofHundred,total,highest;
	float avrage;
	Cricketer(){}
	Cricketer(String name){
		this.name=name;
		nofFifty=0;nofHundred=0;total=0;avrage=0;highest=0;
	}
	void getData(int ...score){
	int count=0;
		for (int run:score ) {
			total +=run;//for total
			if(run>=highest)//for max
				highest=run;
			if(run>=50)
				nofFifty++;
			if(run>=100)
				nofHundred++;
			count++;
		}
		avrage=(float)total/count;
	}
	public String toString(){
		return(name+"\ntotal= "+total+"\thighest= "+highest+"\tAvrage= "+avrage
			+"\tno of fifty= "+nofFifty+"\tno of Centuries= "+nofHundred);

	}
};
class CricNews{
	public static void main(String[] args) {
		// Cricketer c=new Cricketer("B. LARA");
		// try{c.getData(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		// }catch(Exception et){
		// 	System.out.println("I am hear");
		// }
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of innings: ");
		int N=sc.nextInt();
		int []arr=new int [N];
		for(int i=0;i<N;i++){
			System.out.print("Enter no of Runs: ");
			arr[i]=sc.nextInt();
		}	
		Cricketer c2=new Cricketer("MS Dhoni");
		c2.getData(arr);
				// System.out.println(c);
				System.out.println(c2);
	}
	
}