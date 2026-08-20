//--------------------------------------------------------------------Balanced Expressions---------------------------------------------------------------
import java.util.*;
class Stack{
    char[] stack;
    int top;
    Stack(int size){
        stack=new char[size];
        top=-1;
    }
    void push(char ch){
        stack[++top]=ch;
    }
    char pop(){
        if(top==-1)
            return '#';
        return stack[top--];
    }
    boolean isEmpty(){
        return top==-1;
    }
}
public class Main{
    static boolean match(char open,char close){
        return (open=='('&&close==')')||(open=='{'&&close=='}')||(open=='['&&close==']');
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        Stack st=new Stack(exp.length());
        boolean balanced=true;
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
                st.push(ch);
            else if(ch==')'||ch=='}'||ch==']'){
                if(st.isEmpty()){
                    balanced=false;
                    break;
                }
                char open=st.pop();
                if(!match(open,ch)){
                    balanced=false;
                    break;
                }
            }
        }
        if(!st.isEmpty())
            balanced=false;
        if(balanced)
            System.out.println("Balanced Expression");
        else
            System.out.println("Unbalanced Expression");
    }
}


//--------------------------------------------------------------Linear Queue using Array with Enqueue, Dequeue, and Display operations---------------------------------------------------
import java.util.*;
class Queue{
    int front, rear;
    int n;
    int queue[];
    Queue(int n){
        this.n = n;
        queue = new int[n];
        front = 0;
        rear = -1;
    }
    void enqueue(int data){
        if (rear == n - 1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = data;
    }
    int dequeue() {
        if (front > rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front++];
    }
    void display(){
        if(front > rear){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i<=rear;i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue q = new Queue(n);
        while (true){
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice  = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the value to enqueue: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    int removed = q.dequeue();
                    if (removed != -1){
                        System.out.println(removed);
                    }
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}


//--------------------------------------------Stack Using Linked List----------------------------------------------------------------
import java.util.*;
class Stack{
    int top;
    Node arr[];
    Stack(int n){
        top=-1;
        arr=new Node[n];
    }
    void push(int d){
        Node n=new Node(d);
        if(top==arr.length-1){
            System.out.println("Overflow");
            return;
        }
        arr[++top]=n;
        System.out.println(arr[top].data);
    }
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        System.out.println(arr[top--].data);
    }
    void peek(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        System.out.println(arr[top].data);
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        Stack s=new Stack(n);
        int d;
        while(true){
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            int choice=obj.nextInt();
            switch(choice){
                case 1:
                    d=obj.nextInt();
                    s.push(d);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


//-----------------------------------------------------------Stack Using Array-----------------------------------------------------------------------
import java.util.*;
class Stack{
    int top;
    int arr[];
    int n;
    Stack(int n){
        this.n=n;
        this.top=-1;
        arr=new int[n];
    }
    void push(int d){
        if(top==n-1){
            System.out.println("Overflow");
            return;
        }
        arr[++top]=d;
        System.out.println(arr[top]);
    }
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        System.out.println(arr[top--]);
    }
    void peek(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        System.out.println(arr[top]);
    }
    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        Stack s=new Stack(n);
        while(true){
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. display");
            System.out.println("5. Exit");
            System.out.println("Enter choice");
            int choice=obj.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter value to push:");
                    int value=obj.nextInt();
                    s.push(value);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Exiting program");
                    obj.close();
                    return;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}



//---------------------------------------------------------------Queue Using Linked List----------------------------------------------------
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Queue{
    Node front, rear;
    Queue(){
        front = null;
        rear = null;
    }
    void enqueue(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    int dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return data;
    }
    void display(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        while(true){
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the value to enqueue: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    int removed = q.dequeue();
                    if(removed != -1){
                        System.out.println(removed);
                    }
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
