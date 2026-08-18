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

//------------------------------------------------------------------------------without parameters no return  type---------------------------------------------------------
class Main {
    static void add() {
        int a = 10, b = 20;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        add();
    }
}

//----------------------------------------------------------------------with parameters without  return type----------------------------------------------------------------
class Main {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        add(10, 20);
    }
}

//----------------------------------------------------------------------without parameters with  return type----------------------------------------------------------------
class Main {
    static int add() {
        int a = 10, b = 20;
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add());
    }
}


//----------------------------------------------------------------------with parameters with  return type----------------------------------------------------------------
class Main {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
    }
}
