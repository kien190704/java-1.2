public class bai26 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int max = (a + b + Math.abs(a - b)) / 2;
    }    
}
