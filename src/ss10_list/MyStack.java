package ss10_list;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
//        Stack<Integer> integerStack = new Stack<>();
//        integerStack.push(10);
//        integerStack.push(20);
//        integerStack.push(30);
//        integerStack.push(40);
//        integerStack.push(50);
//        int s = integerStack.size();
//        while (!integerStack.isEmpty()) {
//            System.out.println(integerStack.pop());
//        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
//        System.out.println(queue.peek());
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println(queue.size());

        System.out.println(queue.poll());


    }
}
