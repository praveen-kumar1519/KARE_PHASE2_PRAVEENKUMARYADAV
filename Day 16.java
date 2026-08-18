//--------------------------------------------------------- Topic: Sum of Elements in Doubly Linked List--------------------------------------------------------
import java.util.*;
class Main{
    static class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++){
            Node newNode=new Node(sc.nextInt());
            if(head==null){
                head=tail=newNode;
            }else{
                tail.next=newNode;
                newNode.prev=tail;                                        /----------------------------4       10 20 30 40   - Sum = 100     
                tail=newNode;
            }
        }
        int sum=0;
        Node temp=head;
        while(temp!=null){
            sum+=temp.data;
            temp=temp.next;
        }
        System.out.println("Sum = "+sum);
    }
}

//---------------------------------------------------------- Topic: Maximum Element in Doubly Linked List----------------------------------------------------
import java.util.*;
class Main{
    static class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++){
            Node newNode=new Node(sc.nextInt());               //  5      10 50 20 80 30     -     Maximum = 80
            if(head==null){
                head=tail=newNode;
            }else{
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }
        int max=head.data;
        Node temp=head;
        while(temp!=null){
            if(temp.data>max)
                max=temp.data;
            temp=temp.next;
        }
        System.out.println("Maximum = "+max);
    }
}


//---------------------------------------------------Topic: Print Doubly Linked List in Reverse Order----------------------------------------------------------
import java.util.*;
class Main{
    static class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++){
            Node newNode=new Node(sc.nextInt());                          // 4      10 20 30 40       /--40 30 20 10
            if(head==null){
                head=tail=newNode;
            }else{
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
}


//----------------------------------------------------------Topic: Sort Doubly Linked List---------------------------------------------------------------------
class Main{
    static class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++){
            Node newNode=new Node(sc.nextInt());
            if(head==null){
                head=tail=newNode;
            }else{                                                     //5     40 10 50 20 30--         / 10 20 30 40 50
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }
        for(Node i=head;i!=null;i=i.next){
            for(Node j=i.next;j!=null;j=j.next){
                if(i.data>j.data){
                    int temp=i.data;
                    i.data=j.data;
                    j.data=temp;
                }
            }
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }





  
//------------------------------------------------------------- Topic: Insert Element at End in Doubly Linked List------------------------------------------------------
import java.util.*;
class Main{
    static class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++){
            Node newNode=new Node(sc.nextInt());
            if(head==null){
                head=tail=newNode;
            }else{
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }
        int value=sc.nextInt();                                                         //3      10 20 30    & 40
        Node newNode=new Node(value);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
}






