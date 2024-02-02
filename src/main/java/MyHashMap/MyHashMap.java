package MyHashMap;

import java.util.Objects;

public class MyHashMap <K,V> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private Node<K,V>[] table;
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
           for (int i = 0; i < size; i++) {
               if (curentNode.getKey().equals(key)){
                       curentNode.setValue(value);
                       break;
                   }
               if(curentNode.getNext() == null){
                   break;
               }
                   curentNode = curentNode.getNext();
               }
               if (curentNode.getNext() == null && !curentNode.getKey().equals(key)) {
                   curentNode.setNext(newNode);
                   size++;
               }
       }else {
            table[hash] = newNode;
            size++;

       }
    }
    public V get(K key){
        int hash = Math.abs(key.hashCode()%table.length);
        if (table[hash] == null){
            return null;
        }
        if (table[hash].getNext() == null){

            return table[hash].getValue();

        }else {

            Node<K, V> var = table[hash];
            while (var.getNext() != null){
                if (var.getKey().equals(key)) {
                    break;
                }
                var = var.getNext();
            }
            if (var.getKey().equals(key)) {
                return var.getValue();
            }
            return null;

        }
    }
    public void clear(){
        table = new Node[DEFAULT_INITIAL_CAPACITY];
        size = 0;
    }
    public void remove(K key){
        int hash = key.hashCode()%table.length;
        Node<K, V> var = table[hash];
        int indexElWithKey = 0;
        Node<K,V> nextEl;
        while (!(var.getKey().equals(key))){
            var = var.getNext();
            indexElWithKey++;
        }
        nextEl = var.next;
        var = table[hash];
        for (int i = 0; i < indexElWithKey-1; i++) {
            var = var.getNext();
        }
        var.setNext(nextEl);
        size--;
    }
    private class Node<K,V> {
        private final int hash;
        private final K key;
        private V value;
        private Node<K,V> next;

        public int getHash() {
            return hash;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }

        Node(int hash, K key, V value, Node<K, V> next) {
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
