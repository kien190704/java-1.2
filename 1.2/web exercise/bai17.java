public class bai17 {
    public static void main(String[] args){
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double a = Math.pow((x1-x2),2);
        double b = Math.pow((y1-y2),2);
        double dis = Math.sqrt(a +b);
        System.out.println(" the Euclidean distance between point "+x1 +" "+ y1 +" and the point " + x2 +" "+ y2 +" is " + dis);
    }    
}
