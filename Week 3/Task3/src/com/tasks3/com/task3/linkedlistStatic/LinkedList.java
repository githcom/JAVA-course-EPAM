package com.tasks3.com.task3.linkedlistStatic;

/**
 * Created by AVK on 19.03.2017.
 */
public class LinkedList {
    private int size=0;
    public Node header;
    private Node tail;



    public static class Node{
        private Node next;
        private Integer data;

        public Node() {
        }

        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public Integer getData() {
            return data;
        }
        public void setData(Integer data) {
            this.data = data;
        }

    }



//    public static void main(String[] args) {
//        LinkedList li = new LinkedList();
//        System.out.println("size is " + li.size());
//        li.add(1);
//        System.out.println("size is " + li.size());
//        li.add(3);
//        li.add(5);
//        System.out.println("size is " + li.size());
//
//        Node n = li.header;
//        System.out.println("The elements are: ");
//        for (int i = 0; i < li.size(); i++) {
//            System.out.print(n.getData() + ", ");
//            n = n.getNext();
//        }
//        System.out.println();
//        System.out.println("the element of index 1 is: " + li.get(2));
//        System.out.println("delete: " + li.delete(1));
//        System.out.println("size is: " + li.size());
//
//        System.out.println();
//
//        Node m = li.header;
//
//        for (int j = 0; j < li.size(); j++) {
//            System.out.print(m.getData() + ", ");
//            m = m.getNext();
//        }
//        System.out.println();
//        System.out.println("the element of index 1 is: " + li.get(1));
//    }



    public LinkedList() {
    }

    public void add(Integer data) {

        Node node = new Node();
        node.setData(data);
        if (tail == null){
            header = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
            size++;
        }

    }

    public Integer get(int index) {
        if (index < 0 || index > size()-1){
            return null;
        }
        Node t = header;
        int i = 0;
        while (i < index){
            t = t.getNext();
            i++;
        }
        return t.getData();

        //PUT YOUR CODE HERE
    }

    public boolean delete(int index) {
        //PUT YOUR CODE HERE
        if (index < 0 || index > size()-1){
            return false;
        }
        if (index == 0) {
            header = header.getNext();
            size--;
            return true;
        }

        Node t = header;
        int i = 0;
        while (i < index-1){
            t = t.getNext();
            i++;
        }
        if (t.getNext() == tail) {
            t = tail;
            size--;
            return true;
        }
        t.setNext(t.getNext().getNext());
        size--;
        return true;
        //PUT YOUR CODE HERE
    }


    public int size() {
        if (header == null){
            return 0;
        } else {
            return size + 1;
        }

    }

}



//class Node{
//    private Node next;
//    private Integer data;
//
//    public Node() {
//    }
//
//    public Node getNext() {
//        return next;
//    }
//    public void setNext(Node next) {
//        this.next = next;
//    }
//    public Integer getData() {
//        return data;
//    }
//    public void setData(Integer data) {
//        this.data = data;
//    }
//}

