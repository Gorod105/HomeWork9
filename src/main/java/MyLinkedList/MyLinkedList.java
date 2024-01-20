package MyLinkedList;

import java.util.LinkedList;

public class MylinkedList {
    LinkedList linkedList = new LinkedList();

}
private static class Node<E> {
    E item;
    LinkedList.Node<E> next;
    LinkedList.Node<E> prev;

    Node(LinkedList.Node<E> prev, E element, LinkedList.Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}