import java.io.*;
import java.util.Scanner;

class customer{
    String name;
    int age;
    String hometown;
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter name:");
        name = sc.nextLine();
        System.out.println("enter city:");
        hometown = sc.nextLine();
        System.out.println("enter age:");
        age = sc.nextInt();
    }

    public void display(){
        System.out.println("Your name is:"+name);
        System.out.println("Your age is:"+age);
        System.out.println("Your city is:"+hometown);
    }
}
public class assignment1 {
    public static void main(String ar[]){
                customer c1 =new customer();
        customer c2 = new customer();
        c1.input();
        c2.input();
        c1.display();
        c2.display();
    }
}
