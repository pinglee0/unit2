package lesson1a;
import java.util.*;
public class example {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String a_String_line2=console.nextLine();
        System.out.println("int ");
        int a_int = console.nextInt();
        System.out.println("double ");
        double a_double=console.nextDouble();
        System.out.println("String_oneWord ");
        String a_String_oneWord=console.next();
        System.out.println("String_line ");
        String a_String_line0=console.nextLine();//卸除enter
        String a_String_line=console.nextLine();
        System.out.println("\n"+a_String_line+"\n"+a_String_oneWord+"\n"+a_double+"\n"+a_int);

    }
}
