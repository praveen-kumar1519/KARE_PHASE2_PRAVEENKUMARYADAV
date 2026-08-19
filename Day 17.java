//---------------------------------------------------------Circular linked list--------------------------------------------------------------------

1 2 3 4 -1
1 2 3 4
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m=new Main();
		int d =  sc.nextInt();
		while(d!=-1){
		    m.insert(d);
		    d=sc.nextInt();
		}
		m.display();
	}
Node first;
	void insert(int d){
	      Node n =new Node(d);
	      if(first==null){
	      first=n;
	      n.next=first;
	      return;
	      }else{
	          Node temp = first;
	          while(temp.next !=null){
	              temp=temp.next;  
	          }
	          temp.next=n;
	          n.next=first;
	      }
	}
	void display(){
	    if(first==null){
	        System.out.println("List is empty");
	    }
	    Node temp=first;
	    do{
	        System.out.print(temp.data +" ");
	        temp =temp.next;
	    }while(temp !=first);
	}
}

//------------------------------------------------------------------------------------------Circulkar double linked list----------------------------------------------------------------------------------------
//Circular Doubly Linked List

1 2 3 4 -1
1 2 3 4
	
import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        this.data=d;
        this.next=null;
        this.prev=null;
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Main m=new Main();
		int d =  obj.nextInt();
		while(d!=-1){
		    m.insert(d);
		    d=obj.nextInt();
		}
		m.display();
	}
    Node first = null;
	void insert(int d){
	      Node n =new Node(d);
	      if(first==null){
	      first=n;
	      first.next=first;
	      first.prev=first;
	      }else{
	          Node last = first.prev;
	          last.next=n;
	          n.prev=last;
	          n.next=first;
	          first.prev=n;
	      }
	}
	void display(){
	    if(first==null){
	        System.out.println("List is empty");
	    }
	    Node temp=first;
	    do{
	        System.out.print(temp.data +" ");
	        temp =temp.next;
	    }while(temp !=first);
	}
}


//----------------------------------------------------------------------------Sum of Elements in  Circular Doubly Linked List------------------------------------------------------------------------
1 2 3 4 5 -1
Sum of the elements: 15

import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        this.data=d;
        this.next=null;
        this.prev=null;
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Main m=new Main();
		int d =  obj.nextInt();
		while(d!=-1){
		    m.insert(d);
		    d=obj.nextInt();
		}
		m.sum();
	}
    Node first = null;
	void insert(int d){
	      Node n =new Node(d);
	      if(first==null){
	      first=n;
	      first.next=first;
	      first.prev=first;
	      }else{
	          Node last = first.prev;
	          last.next=n;
	          n.prev=last;
	          n.next=first;
	          first.prev=n;
	      }
	}
	void sum(){
	    if(first==null){
	        System.out.println("List is empty");
	    }
	    int sum=0;
	    Node temp=first;
	    do{
	        sum=sum + temp.data;
	        temp =temp.next;
	    }while(temp !=first);
	    System.out.println("Sum of the elements: "+sum);
	}
}


//------------------------------------------------------------------Sum of Elements in  Circular Singly Linked List---------------------------------------------------------------------------------
1 2 3 4 6 -1
Sum of the elements: 16
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Main m=new Main();
		int d =  obj.nextInt();
		while(d!=-1){
		    m.insert(d);
		    d=obj.nextInt();
		}
		m.sum();
	}
    Node first = null;
	void insert(int d){
	      Node n =new Node(d);
	      if(first==null){
	      first=n;
	      n.next=first;
	      }else{
	          Node temp = first;
	          while(temp.next !=first){
	              temp=temp.next;
	          }
	          temp.next = n;
              n.next = first;
	      }
	}
	void sum(){
	    if(first==null){
	        System.out.println("List is empty");
	    }
	    int sum=0;
	    Node temp=first;
	    do{
	        sum=sum + temp.data;
	        temp =temp.next;
	    }while(temp !=first);
	    System.out.println("Sum of the elements: "+sum);
	}
}

//------------------------------------------------------------------------------------Sort circular singular linked list--------------------------------------------------------------------

Input: 4 2 5 1 3 -1
Output: 1 2 3 4 5
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Main m=new Main();
        int d=obj.nextInt();
        while(d!=-1){
            m.insert(d);
            d=obj.nextInt();
        }
        m.sort();
        m.display();
    }
    Node first=null;
    void insert(int d){
        Node n=new Node(d);
        if(first==null){
            first=n;
            n.next=first;
        }else{
            Node temp=first;
            while(temp.next!=first){
                temp=temp.next;
            }
            temp.next=n;
            n.next=first;
        }
    }
    void sort(){
        Node i=first;
        do{
            Node j=i.next;
            while(j!=first){
                if(i.data>j.data){
                    int temp=i.data;
                    i.data=j.data;
                    j.data=temp;
                }
                j=j.next;
            }
            i=i.next;
        }while(i!=first);
    }
    void display(){
        Node temp=first;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=first);
    }
}


//------------------------------------------------------------------------------------Sort circular doubly linked list--------------------------------------------------------------------
Input: 4 2 5 1 3 -1
Output: 1 2 3 4 5
import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        this.data=d;
        this.next=null;
        this.prev=null;
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Main m=new Main();
        int d=obj.nextInt();
        while(d!=-1){
            m.insert(d);
            d=obj.nextInt();
        }
        m.sort();
        m.display();
    }
    Node first=null;
    void insert(int d){
        Node n=new Node(d);
        if(first==null){
            first=n;
            first.next=first;
            first.prev=first;
        }else{
            Node last=first.prev;
            last.next=n;
            n.prev=last;
            n.next=first;
            first.prev=n;
        }
    }
    void sort(){
        Node i=first;
        do{
            Node j=i.next;
            while(j!=first){
                if(i.data>j.data){
                    int temp=i.data;
                    i.data=j.data;
                    j.data=temp;
                }
                j=j.next;
            }
            i=i.next;
        }while(i!=first);
    }
    void display(){
        Node temp=first;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=first);
    }
}


//------------------------------------------------------------------------------------Maximum circular singular linked list--------------------------------------------------------------------
Input: 10 25 7 40 15 -1
Output: Maximum element: 40
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Main m=new Main();
        int d=obj.nextInt();
        while(d!=-1){
            m.insert(d);
            d=obj.nextInt();
        }
        m.maximum();
    }
    Node first=null;
    void insert(int d){
        Node n=new Node(d);
        if(first==null){
            first=n;
            n.next=first;
        }else{
            Node temp=first;
            while(temp.next!=first){
                temp=temp.next;
            }
            temp.next=n;
            n.next=first;
        }
    }
    void maximum(){
        int max=first.data;
        Node temp=first.next;
        while(temp!=first){
            if(temp.data>max){
                max=temp.data;
            }
            temp=temp.next;
        }
        System.out.println("Maximum element: "+max);
    }
}

//------------------------------------------------------------------------------------Maximum circular doubly linked list--------------------------------------------------------------------

Input: 10 25 7 40 15 -1
Output: Maximum element: 40
import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        this.data=d;
        this.next=null;
        this.prev=null;
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Main m=new Main();
        int d=obj.nextInt();
        while(d!=-1){
            m.insert(d);
            d=obj.nextInt();
        }
        m.maximum();
    }
    Node first=null;
    void insert(int d){
        Node n=new Node(d);
        if(first==null){
            first=n;
            first.next=first;
            first.prev=first;
        }else{
            Node last=first.prev;
            last.next=n;
            n.prev=last;
            n.next=first;
            first.prev=n;
        }
    }
    void maximum(){
        int max=first.data;
        Node temp=first.next;
        while(temp!=first){
            if(temp.data>max){
                max=temp.data;
            }
            temp=temp.next;
        }
        System.out.println("Maximum element: "+max);
    }
}

////------------------------------------------------------------------------------------Insertion circular singular linked list--------------------------------------------------------------------

Input:
1 2 3 4 -1
5
Output: 1 2 3 4 5
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Main m=new Main();
        int d=obj.nextInt();
        while(d!=-1){
            m.insert(d);
            d=obj.nextInt();
        }
        int value=obj.nextInt();
        m.insert(value);
        m.display();
    }
    Node first=null;
    void insert(int d){
        Node n=new Node(d);
        if(first==null){
            first=n;
            n.next=first;
        }else{
            Node temp=first;
            while(temp.next!=first){
                temp=temp.next;
            }
            temp.next=n;
            n.next=first;
        }
    }
    void display(){
        Node temp=first;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=first);
    }
}

//------------------------------------------------------------------------------------Insertion circular double linked list--------------------------------------------------------------------

Input:
1 2 3 4 -1
5
Output: 1 2 3 4 5
import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        this.data=d;
        this.next=null;
        this.prev=null;
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Main m=new Main();
        int d=obj.nextInt();
        while(d!=-1){
            m.insert(d);
            d=obj.nextInt();
        }
        int value=obj.nextInt();
        m.insert(value);
        m.display();
    }
    Node first=null;
    void insert(int d){
        Node n=new Node(d);
        if(first==null){
            first=n;
            first.next=first;
            first.prev=first;
        }else{
            Node last=first.prev;
            last.next=n;
            n.prev=last;
            n.next=first;
            first.prev=n;
        }
    }
    void display(){
        Node temp=first;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=first);
    }
}


//------------------------------------------------------------------------------------Reverse circular singular linked list--------------------------------------------------------------------

Input: 1 2 3 4 5 -1
Output: 5 4 3 2 1
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Main m=new Main();
        int d=obj.nextInt();
        while(d!=-1){
            m.insert(d);
            d=obj.nextInt();
        }
        m.reverse();
        m.display();
    }
    Node first=null;
    void insert(int d){
        Node n=new Node(d);
        if(first==null){
            first=n;
            n.next=first;
        }else{
            Node temp=first;
            while(temp.next!=first){
                temp=temp.next;
            }
            temp.next=n;
            n.next=first;
        }
    }
    void reverse(){
        Node prev=null;
        Node current=first;
        Node next;
        do{
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }while(current!=first);
        first.next=prev;
        first=prev;
    }
    void display(){
        Node temp=first;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=first);
    }
}


//------------------------------------------------------------------------------------Reverse circular Doubly linked list--------------------------------------------------------------------

Input: 1 2 3 4 5 -1
Output: 5 4 3 2 1
import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        this.data=d;
        this.next=null;
        this.prev=null;
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Main m=new Main();
        int d=obj.nextInt();
        while(d!=-1){
            m.insert(d);
            d=obj.nextInt();
        }
        m.reverse();
        m.display();
    }
    Node first=null;
    void insert(int d){
        Node n=new Node(d);
        if(first==null){
            first=n;
            first.next=first;
            first.prev=first;
        }else{
            Node last=first.prev;
            last.next=n;
            n.prev=last;
            n.next=first;
            first.prev=n;
        }
    }
    void reverse(){
        Node temp=first;
        do{
            Node t=temp.next;
            temp.next=temp.prev;
            temp.prev=t;
            temp=t;
        }while(temp!=first);
        first=first.next;
    }
    void display(){
        Node temp=first;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=first);
    }
}
