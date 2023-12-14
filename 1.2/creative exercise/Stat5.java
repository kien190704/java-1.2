public class Stat5 {
    public static void main(String[] args){
        double a =Math.random();
        double a1 =Math.random();
        double a2 =Math.random();
        double a3 =Math.random();
        double a4 =Math.random();
        double Average_value =(a + a1 + a2 +a3+a4)/5;
        double min     = Math.min(a, Math.min(a1, Math.min(a2, Math.min(a3, a4))));
        double max     = Math.max(a, Math.max(a1, Math.max(a2, Math.max(a3, a4))));
        System.out.println("random number 1 : " +a );
        System.out.println("random number 2 : " +a1 );
        System.out.println("random number 3 :" +a2 );
        System.out.println("random number 4 : " +a3 );
        System.out.println("random number 5 : " +a4 );
        System.out.println("the average value is : " +Average_value );
        System.out.println("the max value is : " + max );
        System.out.println("the min value is : " +min );


    }    
}
