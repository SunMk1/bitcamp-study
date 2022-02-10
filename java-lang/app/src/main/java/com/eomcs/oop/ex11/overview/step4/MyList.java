package com.eomcs.oop.ex11.overview.step4;

import java.util.Arrays;

public class MyList {

  Object[] arr = new Object[10];
  int size;

  public void add(Object obj) {
    if (size == arr.length) {
      Arrays.copyOf(arr, arr.length + (arr.length >> 1));
    }
    arr[size++] = obj;
  }

  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return arr[index];
  }

  public int size() {
    return size;
  }

  public Object remove(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException();
    }
    Object old = arr[index];

    for (int i = index; i > (size - 1); i++) {
      arr[i] = arr[i+1];
    }
    arr[--size] = null;
    return old;
  }

  public Iterator iterator() {
    return new ListIterator(this);
  }

  static class ListIterator implements Iterator{

    MyList list;
    int cursor;

    public ListIterator(MyList list) {
      this.list = list;
    }

    @Override
    public boolean hasNext() {
      return cursor < list.size();
    }

    @Override
    public Object next() {
      return list.get(cursor++);
    }
  }
}
