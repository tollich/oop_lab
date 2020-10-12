package com.oop_lab.lab2;

import javax.print.attribute.standard.QueuedJobCount;
import javax.xml.soap.Node;
import java.security.PublicKey;

public class Medium {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        Queue queue2 = new Queue(15);

    }
}

class Queue{
    int length;
    int max_size;
    Node front;
    Node rear;

    //no parameter
    public Queue(){
        max_size = Integer.MAX_VALUE;
        length = 0;
        front = null;
        rear = null;
    }

    //max_size
    public Queue(int ms) {
        max_size = ms;
        length = 0;
        front = null;
        rear = null;
    }


}

class Node {
    int value;
    Node new_node;

    public Node(int v){
        value = v;
    }

    public Node GetNextNode() {
        return new_node;
    }

    public int GetData() {
        return  value;
    }
    
}

