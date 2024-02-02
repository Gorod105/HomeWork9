package MyStack;

import MyQueue.QueueVariable;

import java.util.Arrays;

public class MyStack <T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] myStack;
    private int indexNow = 0;
    public MyStack() {
        this.myStack = new Object[DEFAULT_CAPACITY];
    }

    public void push(T value) {
        if (indexNow > myStack.length-2)
        {
            Object[] copy = Arrays.copyOf(myStack, myStack.length);
            this.myStack = new Object[myStack.length * 2];
            for (int j = 0; j < copy.length; j++) {
                myStack[j] = copy[j];
            }
        }
        myStack[indexNow] = new StackVariable<T>(value);
        indexNow++;
    }
    public void clear(){
        this.myStack = new Object[DEFAULT_CAPACITY];
        indexNow = 0;
    }
    public int size(){
        return indexNow;
    }
    public Object peek(){
        if (indexNow == 0){
            return myStack[0];
        }
        return myStack[indexNow-1];
    }
    public Object pop(){
        if (indexNow == 0){
            return myStack[0];
        }
        indexNow--;

        return myStack[indexNow];
    }
    public void remove(int index){
        while (myStack[index] != null){
            myStack[index] = myStack[index+1];
            index++;
        }
        indexNow--;
    }

}
