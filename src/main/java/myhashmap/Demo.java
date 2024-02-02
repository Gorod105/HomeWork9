package myhashmap;


public class Demo {
    public static void main(String[] args) {

        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(11, "First");
        myHashMap.put("Mykola", "SecondFirst");
        myHashMap.put("Mykola", "SecondSecond");
        myHashMap.put(11, "Second");
        System.out.println("myHashMap.get(11) = " + myHashMap.get(11));
        myHashMap.put("K", "FirstK");
        myHashMap.put("K", "SecondK");
        System.out.println("myHashMap.get(\"K\") = " + myHashMap.get("K"));
        myHashMap.remove("K");
        System.out.println("myHashMap.get(\"K\") = " + myHashMap.get("K"));
        myHashMap.put("Mykola", "SecondThird");
        myHashMap.put("Roma", "FirstRoma");
        System.out.println("myHashMap.size() = " + myHashMap.size());

    }

}