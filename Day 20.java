///----------------------------------------------------------------Break 1-----------------------------------------------------------------------
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    LinkedList obj = new LinkedList();
	    obj.add(10);
	    obj.add(20);
	    obj.add(30);
		System.out.println(obj);
	}
}


///----------------------------------------------------------------Break 2-----------------------------------------------------------------------


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    LinkedList sc = new LinkedList();
	    int i;
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    for(i=0;i<n;i++)
	    sc.add(s.nextInt());
		System.out.print("LinkedList Element");
		System.out.println(sc);
		int ind = s.nextInt();
		int val = s.nextInt();
		sc.add(ind,val);
		System.out.println(sc);
		System.out.println("Insert first position");
		System.out.println("enter first element to be add");
		int d = s.nextInt();
		sc.addFirst(d);
		System.out.print(sc);
	}
}


