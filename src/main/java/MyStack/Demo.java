package MyStack;

public class Demo {

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>();
        myStack.push("Roma");
        myStack.push("Ivan");
        myStack.push("Stepan");
        myStack.push("Mykola");
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.peek() = " + myStack.peek());
        myStack.remove(2);
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        myStack.push("Roma");
        myStack.push("Ivan");
        myStack.push("Stepan");
        myStack.push("Mykola");
        myStack.clear();
        System.out.println("myStack.peek() = " + myStack.peek());


    }
}
