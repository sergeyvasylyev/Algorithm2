import java.util.Stack;

public class StackArray{
    private int size;
    private int[] array;
    private int top;

    public StackArray(int stackSize){
        size = stackSize;
        array = new int[size];
        top = -1;
    }

    public boolean empty(){
        return (top == -1);
    }

    public void push(int element){
        if (top + 2 > size){
            System.out.println("Error. Can't push value "+element+". Stack is full!");
        } else {
            int i = ++top;
            array[i] = element;
        }
    }

    public int pop(){
        if (empty()){
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[top--];
        }
    }

    public int peek(){
        if (empty()){
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[top];
        }
    }

    public int search(int searchValue){
        if (empty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            int returnValue = -1;
            for (int i = top; i >0 ; i--) {
                if (array[i] == searchValue){
                    returnValue = top - i + 1 ;
                    break;
                }
            }
            return returnValue;
        }
    }

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);
        stack.push(1);
        stack.push(7);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(10);
        int searchValue = 7;
        System.out.println("Value: "+searchValue+". Index: "+stack.search(searchValue));

        Stack stackS = new Stack();
        stackS.push(1);
        stackS.push(7);
        stackS.push(3);
        stackS.push(5);
        stackS.push(2);
        System.out.println("Value: "+searchValue+". Index: "+stackS.search(searchValue));

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

    }
}
