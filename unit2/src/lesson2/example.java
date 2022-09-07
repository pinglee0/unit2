package lesson2;

public class example {
    public static void main(String[] args) {
        message1();
        message2();
        message3();
        //message4();
        example a=new example();
        a.message4();
    }
    public static void message1() {
        System.out.println("This is message1.");
    }
    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message2.");
    }
    static void message3() {
        System.out.println("This is message3.");
    }
    void message4() {
        System.out.println("This is message4.");
    }
}
