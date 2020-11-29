package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinkedList {
    private Node first;
    private Node last;

    //TODO(2) Tworzymy metodę dodajOstatni, która będzie miała jeden parametr - dodawany element
    public void addLast(int item) {
        Node node = new Node(item);

        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    //TODO(3) Tworzymy metodę wydrukuj, używając pętli while
    public void print(){
        Node current = first;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    //TODO(4) Tworzymy metodę dodajPierwszy, która będzie miała jeden parametr - dodawany element
    public void addFirst(int item){
        Node node = new Node(item);

        if(first == null){
            first = node;
            last = node;
        }else {
            node.next = first;
            first = node;
        }
    }

    //TODO(5) Tworzymy metodę jakiInde, która będzie miała jeden parametr - wawrtośc szukanego indexu
    public int indexOf(int item){
        int index = 0;
        Node current = first;
        while (current != null){
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    //TODO(6) Tworzymy metodę czyZawiera, która będzie miała jeden parametr - sprawdzany element
    public boolean contains(int item){
        Node current = first;
        while (current != null){
            if (current.value == item) return true;
            current = current.next;
        }
        return false;
        //return indexOf(item) != -1;
    }

    //TODO(7) Tworzymy metodę usuńPierwszy - metoda bezparametrowa
    public void removeFirst(){
        if(first == null){
            System.out.println("Lista jest pusta");
        }else if(first == last) {
            first = null;
            last = null;
        }
            else{
                Node second = first.next;
                first.next = null;
                first = second;
            }
        }

    //TODO(8) Tworzymy metodę usuńOstatni - metoda bezparametrowa
    public void removeLast() {
        Node current = first;

        if (first == null) {
            System.out.println("Lista jest pusta");
        } else if (first == last) {
            first = null;
            last = null;
        } else {
            while (current != null) {
                if (current.next == last) {
                    break;
                }
                current = current.next;
            }
            last = current;
            last.next = null;
        }
    }
}
