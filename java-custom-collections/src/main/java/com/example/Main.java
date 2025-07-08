package com.example;

import com.example.collections.*;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("MyArrayList: " + list.get(0) + " " + list.get(1));

        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("MyStack pop: " + stack.pop());

        MyQueue<String> queue = new MyQueue<>();
        queue.add("A");
        queue.add("B");
        System.out.println("MyQueue poll: " + queue.poll());

        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Age", 30);
        System.out.println("MyHashMap get: " + map.get("Age"));
    }
}
