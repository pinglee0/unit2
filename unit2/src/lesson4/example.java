package lesson4;
import java.math.*;
public class example {
    public static void main(String[] args) {
        double answer = Math.sqrt(9.2);
        long b = Math.round(9.2);
        int b1 = (int) Math.round(9.2);
        System.out.println(Math.PI+" "+Math.E);
        System.out.println(Math.abs(-3.5)+"   "+Math.pow(10, -2)+"   "+Math.sqrt(0.16)+"   "+Math.random());

        System.out.println(withinHalf(4,5.1)+"    "+withinHalf(3.83,3.4));
        System.out.println(1.0/3+"  "+(0.1 + 0.2));
    }
    public static boolean withinHalf(double x, double y) {
        return Math.abs(x - y) <= .5;
    }
}
class example2 {
    public static void main(String[] args) {
        double x = 8 * Math.random() + 7;//[7.0,15.0)
        int y = (int)(100 * Math.random()) + 4;//[4,103]
        int z = (int)(2 * Math.random());//0 or 1
    }
}
class example4 {
    public static void main(String[] args) {
        Integer a = new Integer(5);
        int x =a.intValue(); // unboxing x = 5
        int y = a; // auto-unboxing, easier.

        Integer b = new Integer(7); // boxing
        Integer c = 7; // auto-boxing
        int z = a + x; // auto-unboxing

        Double d = new Double(7.5); // boxing
        //Double d2 =2;
        Double d2 =2.0;// auto-boxing
        double e = d.doubleValue(); // unboxing
        double f = d + 2.0; // auto-unboxing
        Double  d3=d;
        System.out.println(d3.hashCode()+" "+d3);
        d=2.0;
        System.out.println(d3.hashCode()+" "+d3);
    }
}
class lab1 {
    public static void main(String[] args) {
    double b=Math.random()*10;
    System.out.println(b);
    System.out.println(5+Math.random()*12);
    int min=Integer.MIN_VALUE;
    int max=Integer.MAX_VALUE;
    System.out.println(min+"   "+(min-1)+"   "+max+"   "+(max+1));
    }
}
