public class BMI {
    public static void main(String[] args){
        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double result = weight /Math.pow(height,2);
        System.out.println("The result is : " + result);
    
    }    
}
    