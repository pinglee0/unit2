package lesson3;

public class example {
    public static void main(String[] args) {
        String a=new String("abc");String a2="abc";
        System.out.println(a+"  "+a2);
        System.out.println("hello" +42);
        System.out.println(1 + "abc" + 2);
        System.out.println("abc" + 1 + 2);
        System.out.println(1.0 + 2 + "abc");
        System.out.println("abc" + 9 * 3);
        System.out.println("1" + 1);
        System.out.println(4 - 1 + "abc");
        System.out.println("abc " + (95.1 + 71.9) / 2+"   "+Math.sqrt(9));
        System.out.println("\\hello\nhow are \"you\"?\\\\");
        System.out.println("\\\\");
        System.out.println("'");
        System.out.println("\"\"\"");
    }
}
class example2 {
    public static void main(String[] args) {
        String s1 = "programming in java";
        System.out.println(s1.length());        // 19
        System.out.println(s1.indexOf("i")); // 8
        System.out.println(s1.indexOf("gram")); // 3
        System.out.println(s1.indexOf("hi")); // -1
        System.out.println(s1.substring(7, 10)); // ”min"
        System.out.println(s1.substring(12)); // ”in java”
        System.out.println(s1.substring(2,3));// ”o”
        System.out.println(s1.substring(2,2)); // ””, empty string
        String s2 = s1.substring(10, 17); // ”g in ja”
    }
}
class example3 {
    public static void main(String[] args) {
        String a = new String("hi");
        String b = new String("hi");
        System.out.println(a == b); //false, not same objects
        System.out.println(a.equals(b));
        String c=a;
        System.out.println(a == c);
        a="32";
        System.out.println(a == c);
        String s1 = "HOT", s2 = "HOTEL", s3 = "dog";
        String s4 = "hot";
        String s5 = new String("hot");
        System.out.println(s1.compareTo(s4)+"   "+s1.compareTo(s2)+"   "+s4.compareTo(s3)+"   "+s4.compareTo(s5));
        System.out.println("s".compareTo("S")+"  "+"F".compareTo("f"));
    }
}