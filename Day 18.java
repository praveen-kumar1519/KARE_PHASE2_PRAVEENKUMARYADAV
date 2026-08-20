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
