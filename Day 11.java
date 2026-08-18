//--------------------------------------------------------------------Binary search-------------------------------------------------------------
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();
        int low = 0, high = n - 1;
        int flag = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element is found");
                flag = 1;
                break;
            }

            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (flag == 0)
            System.out.println("Element is not found");
    }
}


//--------------------------------------------------------------------------------Insertion sort----------------------------------------------------
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
//////////////
