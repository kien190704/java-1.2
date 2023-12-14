public class bai21 { 

    public static void main(String[] args){
        double a = Double.parseDouble(args[0]); //declination
        double b = Double.parseDouble(args[1]);// hour angle
        double c = Double.parseDouble(args[2]);//latitude
        double al = Math.asin(Math.sin(c) * Math.sin(a) + Math.cos(c) * Math.cos(a) * Math.cos(b));
        double azi =Math.acos(Math.cos(c) * Math.sin(a) - Math.sin(c) * Math.cos(a) * Math.cos(b))/Math.cos(al);
        System.out.println("the position is: " + azi);
    }    
}
