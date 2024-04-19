package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> myList = new LinkedList<>();
        for (Integer x:
             sourceList) {
          if (x % 2 !=0) {
              myList.addFirst(x);
          } else {
              myList.add(x);
          }
        }
        return myList;
    }
}
