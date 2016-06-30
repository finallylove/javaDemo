package com.example;


import java.util.*;

/**
 * Created by lbw on 2015/3/9.
 */
public class Stack {
    private java.util.Queue<Integer> queue1 = new LinkedList<>();
    private java.util.Queue<Integer> queue2 = new LinkedList<>();

    public void push(Integer integer) {
        if (queue2.size() == 0) {
            queue1.offer(integer);
        } else {
            queue2.offer(integer);
        }


    }

    public Integer pop() {
        if (queue1.size() == 0 && queue2.size() == 0)
            return null;

        if (queue1.size() == 0) {
            while (queue2.size() > 1)
                queue1.offer(queue2.poll());
            return queue2.poll();
        } else {
            while (queue1.size()>1)
                queue2.offer(queue1.poll());
            return queue1.poll();
        }
    }

}
