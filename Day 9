//-------------------------------------------------------------------SIngle Number-------------------------------------------------------------------
import java.util.*;
public class Missing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i,m=0;
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
            m=m^arr[i];
        }
        System.out.print("Single Number: "+m);
    }
}

//-------------------------------------------------------------------missing nuumbers---------------------------------------------------------------------
import java.util.*;
public class Missing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1]; // Since one number is missing, array size should be n-1
        int sum = 0;
        
        for(int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        int sumN = n * (n + 1) / 2;
        System.out.print("Missing number: " + (sumN - sum));
        sc.close();
    }
}

//--------------------------------------------------------------------------------Arrange 0s and 1s---------------------------------------------------------------
import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        int zc = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0)
                zc++;
        }

        for (int i = 0; i < zc; i++)
            arr[i] = 0;

        for (int i = zc; i < n; i++)
            arr[i] = 1;

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

//-------------------------------------------------------------------------------Prefix sum array-------------------------------------------------------------------------
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

//----------------------------------------------------------------------------------Maximum element-------------------------------------------------------------------------
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum number: " + max);
    }
}

//---------------------------------------------------------------------------------Minimum element------------------------------------------------------------------------------
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}

//----------------------------------------------------------------------------Conescutive 1s------------------------------------------------------------------------------------
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int count = 0, max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > max)
                    max = count;
            } else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}
