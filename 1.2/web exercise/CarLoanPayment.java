public class CarLoanPayment {
    public static void main(String[] args){
        double y = Double.parseDouble(args[0]);// years
        double p = Double.parseDouble(args[1]);// loan
        double R = Double.parseDouble(args[2]);// rate 
        double a = 12 * y;
        double r = (R/100)/12;
        double total = p*r /(1-Math.pow((1+r),-a));
        System.out.println("the payment is: " + total); 
    }    
}
