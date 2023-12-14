
public class SumOfSines {
    public static void main(String[] args){
        double T_in_degrees = Double.parseDouble(args[0]);
        double sum = Math.sin(2 * T_in_degrees) + Math.sin(3 * T_in_degrees);
        System.out.println(sum);
    }
}
