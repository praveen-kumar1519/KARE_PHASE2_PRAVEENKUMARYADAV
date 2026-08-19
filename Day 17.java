//---------------------------------------------------------Circular linked list--------------------------------------------------------------------
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

//---------------------------------------------------------------------Circulkar double linked list---------------------------------------------------------------
//Circular Doubly Linked List
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
