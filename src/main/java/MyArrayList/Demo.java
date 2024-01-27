package MyArrayList;


public class Demo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList<String>();
        myArrayList.add("Roma");
        myArrayList.add("Stepan");
        myArrayList.add("Ivan");
        myArrayList.add("Mykola");
        myArrayList.remove(1);
        System.out.println("myArrayList.get(1) = " + myArrayList.get(1));
        System.out.println("myArrayList.size() = " + myArrayList.size());
    }
}
