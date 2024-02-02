package myarraylist;

import java.util.Arrays;

public class MyArrayList <A>{
     private static final int DEFAULT_CAPACITY = 10;
     private Object[] myArrayList;
     private int indexNow = 0;

    public MyArrayList() {
        this.myArrayList = new Object[DEFAULT_CAPACITY];
    }
    public void add(A variable){
        if (indexNow > myArrayList.length-2)
        {
            Object[] copy = Arrays.copyOf(myArrayList, myArrayList.length);
            this.myArrayList = new Object[myArrayList.length * 2];
            for (int j = 0; j < copy.length; j++) {
                myArrayList[j] = copy[j];
            }
        }
        myArrayList[indexNow] = new Variable<A>(variable);
        indexNow++;
    }
    public Object get(int index){
        if (index >= indexNow){
            throw new IndexOutOfBoundsException("Try get index out of bounds");
        }else {
            return myArrayList[index];
        }
    }
    public void clear(){
         this.myArrayList = new Object[DEFAULT_CAPACITY];
        indexNow = 0;
    }
    public int size(){
        return indexNow;
    }
    public void remove(int index){
        if (index >= indexNow){
            throw new IndexOutOfBoundsException("Try remove index out of bounds");
        }else {

            while (myArrayList[index] != null) {
                myArrayList[index] = myArrayList[index + 1];
                index++;
            }
            indexNow--;
        }
    }
}
