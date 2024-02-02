package MyHashMap;


public class Demo {
    public static void main(String[] args) {

        MyHashMap myHashMap = new MyHashMap();
//        myHashMap.put(11, "First");
//        System.out.println("myHashMap.get(11) = " + myHashMap.get(11));


        myHashMap.put("Mykola", "SecondFirst");
        System.out.println("myHashMap.get(\"Mykola\") = " + myHashMap.get("Mykola"));

        myHashMap.put("Mykola", "SecondSecond");
        System.out.println("myHashMap.get(\"Mykola\") = " + myHashMap.get("Mykola"));

//        System.out.println("myHashMap.get(11) = " + myHashMap.get(11));
        System.out.println("myHashMap.get(\"Mykola\") = " + myHashMap.get("Mykola"));
//        myHashMap.put(11, "Second");
//        System.out.println("myHashMap.get(11) = " + myHashMap.get(11));
        myHashMap.put("K", "FirstK");
        System.out.println("myHashMap.get(\"K\") = " + myHashMap.get("K"));
        myHashMap.put("K", "SecondK");
        System.out.println("myHashMap.get(\"K\") = " + myHashMap.get("K"));
//        System.out.println("myHashMap.get(11) = " + myHashMap.get(11));
        System.out.println("myHashMap.get(\"Mykola\") = " + myHashMap.get("Mykola"));

    }

}