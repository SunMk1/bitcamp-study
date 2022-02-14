package com.eomcs.oop.ex11.h.test;

public class LinkedList {
  Node head;
  Node tail;
  int size;

  public void add(Object value) {
    Node node = new Node(value);

    if (head == null) {
      tail = head = node;
    } else {
      node.prev = tail;
      tail.next = node;
      tail = node;
    }
    size++;
  }

  public void add(int index, Object value) {
    Node node = getNode(index);
    Node newNode = new Node(value);
    if (node.prev != null) {
      node.prev.next = newNode;
    }
    if (node == head) {
      newNode = head;
    }
    newNode.prev = node.prev;
    newNode.next = node;
    node.prev = newNode;


    size++;
  }

  public Object get(int index) {
    Node node = getNode(index);

    return node.value;
  }

  public Object remove(int index) {
    Node node = getNode(index);
    if (size == 1) {
      head = tail = null;
    } else if (node == head) {
      head = node.next;
    } else if (node == tail) {
      tail = node.prev;
    } else {
      node.prev.next = node.next;
      node.next.prev = node.prev;
    }
    node.prev = null;
    node.next = null;
    Object deleted = node.value;
    node.value = null;

    size--;
    return deleted;
  }

  public Object set(int index, Object value) {
    Node node = getNode(index);
    Object old = node.value;
    node.value = value;
    return old;
  }

  private Node getNode(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    Node node = head;
    int count = 0;
    while (count < index){
      node = node.next;
      count++;
    }
    return node;
  }

  public int size() {
    return size;
  }
}
