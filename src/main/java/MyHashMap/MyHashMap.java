package MyHashMap;

import java.util.Objects;

public class MyHashMap <K,V> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private MyHashMap.Node<K,V>[] table;
    private int size;
    private int backets;
    public MyHashMap(){
        this.table = new MyHashMap.Node[DEFAULT_INITIAL_CAPACITY];
    }
    public int size() {
        return size;
    }
    public void put(K key, V value){
        Node<K, V> next = null;
        int hash = Math.abs(key.hashCode()%table.length);
        Node<K, V> curentNode = table[hash];
        Node<K, V> newNode = new Node<>(hash, key, value, next);
        if (size != 0 && size == backets ){
            MyHashMap.Node[] tab = this.table;
            table = new MyHashMap.Node[table.length*2];

        }

       if (table[hash] != null){

               while (curentNode.next != null) {
                   if (curentNode.key.equals(key)){
                       System.out.println("Keys Equals");
                       curentNode.value = value;
                       break;
                   }
                   curentNode = curentNode.next;
               }
               if (curentNode.next == null) {
                   curentNode.next = newNode;
               }
       }else {
            table[hash] = newNode;
       }
    }
    public V get(K key){
        int hash = key.hashCode()%table.length;
        if (hash<0){
            hash = -hash;
        }
        if (table[hash] == null){
            return null;
        }
        if (table[hash].next == null){
//            System.out.println("if");
            return table[hash].value;

        }else {
//            System.out.println("else");
            Node<K, V> var = table[hash];
            while (!(var.key.equals(key))){
                var = var.next;
            }
            return var.value;
        }
    }
    private static class Node<K,V> {
        final int hash;
        final K key;
        V value;
        MyHashMap.Node<K,V> next;

        Node(int hash, K key, V value, MyHashMap.Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return hash == node.hash && Objects.equals(key, node.key) && Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }

    }
}
