package lesson2;
import java.math.*;
import java.util.*;
import java.util.Scanner;

class example0 {
    public static void pt(String str) {
        System.out.println(str);
    }
    public static void pt(double str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        pt("This is message1.");
        pt(12+1.2);
        pt("This is message2.  "+3.5);
    }
}
public class example {
    public static void main(String[] args) {
        message1();
        message2();
        message3();
        //message4();
        example a = new example();
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
class example2 {
    public static void main(String[] args) {
        Math.abs(-4); // error! Returned value not stored nor used
        // (not a compiler/syntax error)
        // corrected
        int result = Math.abs(-4);
        System.out.println(result); // 4
        System.out.println("the square root of 4is" + Math.sqrt(4));
        // the square root of 4 is 2.0
    }
}
class example3{
    public static void main(String[] args){
        double a = add(1, 2) + add(1.8, 5.2) + add(1, 2, 3);
        System.out.println(a); // 16.0
    }
    public static int add(int x, int y){
        return x + y;
    }
    public static double add(double x, double y){
        return x + y;
    }
    public static int add(int x, int y, int z){
        return x + y + z;
    }
}
class example4 {
    public static void main(String[] args) {
        int x = 23;
        strange(x);
        System.out.println("2. x = " + x);
    }
    public static void strange(int x) {
        x ++;
        System.out.println("1. x = " + x);
    }
}
class example5{
    public static void main(String[] args){
        int x = 5;
        doubleMyNumber(x);
        System.out.println("My number is "+ x); //My number is 5
        //System.out.println("My number is "+ doubleMyNumber(x)); //error
        System.out.println("My number is "+ doubleMyNumber((double)x));
    }
    public static void doubleMyNumber(int x){
        x *= 2;
    }
    public static double doubleMyNumber(double x){
        return 2*x;
    }
}
class Student{
    int id;
    public Student(int new_id){
        id = new_id;
    }
    public void printMyID(){
        System.out.println("My ID is "+ id);
    }
    public static void printWelcomeMessage(){
        System.out.println("Welcome all students!");
    }
}
class example6{
    public static void main(String[] args){
        // create a Student object
        Student s1 = new Student(12343);
        s1.printMyID();        // call instance or non-static printMyID()
        Student.printWelcomeMessage();        // call static printWelcomeMessage()
        s1.printWelcomeMessage();        // this also works but not considered "best practice"
    }
}

class lab1{
    public static double average(int x, int y){
            return (double)(x+y)/2;
    }
    public static double slope(int x1,int y1,int x2,int y2){
        return (double)(y2-y1)/(x2-x1);
    }
    public static int difference(int x, int y){
        return x-y;
    }
    public static int square(int x){
        //return (int)Math.pow(x,2);
        return x*x;
    }
    public static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(square(difference(x1,x2))+square(difference(y1,y2)));
    }
    public static void main(String[] args) {
        System.out.println("The average of 8 and 9 is "+average(8,9));
        System.out.println("The slope of the line between (8,9) and (2,4) is "+slope(8,9,2,4));
        System.out.println("The distance between (8,9) and (2,4) is "+distance(8,9,2,4));
        //lab2
        Scanner console=new Scanner(System.in);
        System.out.println("Enter x1:");
        int x1 = console.nextInt();
        System.out.println("Enter y1:");
        int y1 = console.nextInt();
        System.out.println("Enter x2:");
        int x2 = console.nextInt();
        System.out.println("Enter y2:");
        int y2 = console.nextInt();
        System.out.println("The midpoint between ("+x1+","+y1+") and ("+x2+","+y2+") is ("+
                average(x1,x2)+","+average(y1,y2)+")");
        System.out.println("The distance between ("+x1+","+y1+") and ("+x2+","+y2+") is " +
                +distance(x1,y1,x2,y2));

    }
}
