
public class SumOfTwoDice {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if(  a <1 || a >6 || b<1|| b>6 ){
            System.out.println("this is wrong, pls try again");
        }
        else{
            int sum = a + b;
            System.out.println("the total of the dices is :" + sum);
        }
    }
}
