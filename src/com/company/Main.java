package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
        list.removeLast();
        list.print();
    }
}
