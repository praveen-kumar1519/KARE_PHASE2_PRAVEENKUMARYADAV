//--------------------------------------------------------------------Sum of all Matrix-----------------------------------------------------------
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }

        System.out.println("Sum of elements: " + sum);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}

//-------------------------------------------------------------------------First diagonal element---------------------------------------------
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }

        System.out.println("Sum of elements: " + sum);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}

//-------------------------------------------------------------Second diagonal--------------------------------------------------------------------------
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }

        System.out.println("Sum of elements: " + sum);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}

//--------------------------------------------------------------------------------Transpose matrix ----------------------------------------------------------------
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        int[][] trans = new int[c][r];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                trans[j][i] = arr[i][j];

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(trans[i][j] + " ");
            System.out.println();
        }
    }
}

//------------------------------------------------------------------------------Reverse a string------------------------------------------------------------------
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        int start = 0, end = ch.length - 1;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        System.out.println(new String(ch));
    }
}

//-------------------------------------------------------------------------------Duplicate characters----------------------------------------------------------

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] arr = new int[256];

        for (char ch : s.toCharArray())
            arr[ch]++;

        System.out.println("Duplicate characters:");

        for (int i = 0; i < 256; i++)
            if (arr[i] > 1)
                System.out.print((char)i + " ");
    }
}
