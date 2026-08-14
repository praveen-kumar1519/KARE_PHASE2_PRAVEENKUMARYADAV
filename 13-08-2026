//-------------------------------------------------------------------- Class Bike-------------------------------------------------------------
import java.util.*;
class Bike
{
    Bike(){
        System.out.print("Bike is started");
    }
    public static void main(String[] args){
        Bike sc=new Bike();
    }
}                                             //output : Bike is started


//-----------------------------------------------------------------Nested Collatz--------------------------------------------------------------


class Main {
    public static int s(int n) {
        if (n <= 1)
            return 1;

        if (n % 2 == 0)
            return s(s(n / 2));
        else
            return s(s(3 * n + 1));
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Nested Collatz result = " + s(n));
    }
}                                                             // output : 1


//--------------------------------------------------------------------LinearRecursion-------------------------------------------------------------
class LinearRecursion {

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Sum = " + sum(n));
    }
}

//---------------------------------------------------------------------Tail recursion------------------------------------------------------------------
class Main {
    static int fun(int n) {
        if (n > 100)
            return n - 10;
        return fun(fun(n + 11));
    }
    public static void main(String[] args) {
        int ans = fun(98);
        System.out.print(ans);
    }
}

//--------------------------------------------------------------------Fibonacci------------------------------------------------------------------------
import java.util.*;
class Main {
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fib(n);
        System.out.println(ans);
    }
}


//-------------------------------------------------------------------------copy constructor------------------------------------------------------------------------
class Student {
    int id;
    String name;
    Student(int i, String n) {
        id = i;
        name = n;
    }
    Student(Student s) {
        id = s.id;
        name = s.name;
    }
    void display() {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        Student s1 = new Student(40042, "Praveen");
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}

//---------------------------------------------------------------------------------recursive Fibonacci-----------------------------------------------------------
import java.util.*;
class Main
{
    static int fib(int n)
    {
        if(n<=1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int res = fib(n);
        System.out.println(res);
    }
}


//-----------------------------------------------------------------------Overloading-----------------------------------------------------------------------
import java.util.*;
class Main{
    void add(int a, int b){
        System.out.println("a+b");
    }
    void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Main m = new Main();
        m.add(a,b);
        m.add(a,b,c);
    }

//--------------------------------------------------------------------Type of parameters------------------------------------------------------------------
import java.util.*;
class Main{
    void print(int a, float b){
        System.out.println(a+" "+b);
    }
    void print(float b,char c){
        System.out.println(b+" "+c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        char c = sc.next().charAt(0);
        Main m = new Main();
        m.print(a,b);
        m.print(b,c);
    }
}



}
