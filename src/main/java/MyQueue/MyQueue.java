package MyQueue;

import java.util.Arrays;

public class MyQueue <T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] myQueue;
    private int indexNow = 0;
    public MyQueue() {
        this.myQueue = new Object[DEFAULT_CAPACITY];
    }
    public void add(T variable){
        if (indexNow > myQueue.length-2)
        {
            Object[] copy = Arrays.copyOf(myQueue, myQueue.length);
            this.myQueue = new Object[myQueue.length * 2];
            for (int j = 0; j < copy.length; j++) {
                myQueue[j] = copy[j];
            }
        }
        myQueue[indexNow] = new QueueVariable<T>(variable);
        indexNow++;
    }
    public void clear(){
        this.myQueue = new Object[DEFAULT_CAPACITY];
    }

    public int size(){
        return indexNow;
    }
    public Object peek(){
        return myQueue[0];
    }
    public Object poll(){
        Object result = myQueue[0];
        int index = 0;
            while (myQueue[index] != null){
                myQueue[index] = myQueue[index+1];
                index++;
            }
            indexNow--;

        return result;
    }

}
