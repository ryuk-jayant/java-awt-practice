class Myexecption extends Exception{
    public Myexecption(){
        System.out.println("i am exep");
    }
}

public class MainExecption{
    public static void main(String args[]){
        int l=10;
        if(l<20){
            try{
                throw new Myexecption();
            }catch(Myexecption me){
             System.out.println("i am catch block");
                //   System.out.println(me.getMessage());
            }
        }
        else{
              System.out.println("i am fxn");
        }
          System.out.println("rest of code");
    }
}