package MyQueue;


public class Demo {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue<String>();
        myQueue.add("Roma");
        myQueue.add("Ivan");
        myQueue.add("Stepan");
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        myQueue.clear();
        System.out.println("myQueue.peek() = " + myQueue.peek());
    }

}
