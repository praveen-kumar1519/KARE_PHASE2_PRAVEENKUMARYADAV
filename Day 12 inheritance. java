//-----------------------------------------------Hybird inheritance----------------------------------------------------
class Grandfather
{
    void gen1(){
        System.out.println("Money");
    }
}
class Father extends Grandfather{
    void gen21(){
        System.out.println("Gold");
    }
}
class Mother extends Father{
    void gen22(){
        System.out.println("Silver");
    }
}
class Son extends Father{
    void gen3(){
        System.out.println("Diamond");
    }
}
class Main{
    public static void main(String[] args){
        Son S = new Son();
        S.gen3();
        S.gen21();
        S.gen1();
        Mother m = new Mother();
        m.gen22();
        m.gen21();
    }
}


//-----------------------------------------------------------------------multi level inheritance--------------------------------------------------------
class Grandfather
{
    void gen1(){
        System.out.println("Money");
    }
}
class Father extends Grandfather{
    void gen21(){
        System.out.println("Gold");
    }
}
class Son extends Father{
    void gen3(){
        System.out.println("Diamond");
    }
}
class Main{
    public static void main(String[] args){
        Son S = new Son();
        S.gen3();
        S.gen21();
        S.gen1();
        Father f = new Father();
        f.gen21();
        f.gen1();
        Grandfather g = new Grandfather();
        g.gen1();
    }
}


//----------------------------------------------------------Hierarchical Inheritance--------------------------------------------------------

class Father{
    void gen2(){
        System.out.println("Gold");
    }
}
class Son extends Father{
    void gen31(){
        System.out.println("Diamond");
    }
}
class Daughter extends Father{
    void gen32(){
        System.out.println("Platinum");
    }
}
class Main{
    public static void main(String[] args){
        Son S = new Son();
        S.gen31();
        S.gen2();
        Daughter d = new Daughter();
        d.gen32();
        d.gen2();
        Father f = new Father();
        f.gen2();
    }
}


//--------------------------------------------------------------------Single Inheritance----------------------------------------------------------------
class Grandfather
{
    void gen1(){
        System.out.println("Money");
    }
}
class Father extends Grandfather{
    void gen21(){
        System.out.println("Gold");
    }
}
class Main{
    public static void main(String[] args){
        Father f = new Father();
        f.gen21();
        f.gen1();
        Grandfather g = new Grandfather();
        g.gen1();
    }
}


//---------------------------------------------------------------Factorial---------------------------------------------------------------------------
import java.util.*;
class Main {
    static int fact(int n) {
        if(n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}                                                                   //output : will be n factorial


//------------------------------------------------------------Tail recursion--------------------------------------------------------
import java.util.*;

class Main {
    static void fun(int n) {
        if (n != 0) {
            System.out.print(n + " ");
            fun(n - 1);
            fun(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        fun(n);
    }
}      

//------------------------------------------------------------------Perfect cube ------------------------------------------
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int sum = 0, c = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 3 == 0 && arr[i] % 2 == 0) {
                sum = sum + arr[i];
                c++;
            }
        }

        float avg = (float) sum / c;
        System.out.printf("%.2f", avg);
    }
}
