package MyArrayList;


public class Demo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList<String>();
        myArrayList.add("Stepan");
        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        myArrayList.remove(0);
        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        myArrayList.add("Stepan");
        myArrayList.add("Stepan");
        myArrayList.add("Stepan");
    }
}
