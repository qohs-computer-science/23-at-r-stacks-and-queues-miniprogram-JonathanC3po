//Jonathan Conte, Adams, pd 3

import java.util.Stack;
import java.util.Queue;  
import java.util.LinkedList;
import java.util.Scanner; 
public class StacksQueuesMiniProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("Enter 5 whole numbers to add to the stack.");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter whole number " + i + ": ");
            int num = input.nextInt();
            stack.push(num);
        }

        duplicateStackVals(stack);

        System.out.println("Stack after duplicating each value:");
        System.out.println("bottom " + stack + " top");


        Queue<Integer> q = new LinkedList<Integer>();

        System.out.println("Enter 10 whole numbers to add to the queue.");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter whole number " + i + ": ");
            int num = input.nextInt();
            q.add(num);
        }

        evenBeforeOdd(q);

        System.out.println("Queue with evens first, then odds:");
        System.out.println("front " + q + " back");

        input.close();
    }

    public static void duplicateStackVals(Stack<Integer> s) {


        Queue<Integer> aux = new LinkedList<Integer>();

        while (!s.isEmpty()) {
            aux.add(s.pop());
        }

        while (!aux.isEmpty()) {
            s.push(aux.remove());
        }

        while (!s.isEmpty()) {

            int val = s.pop();
            aux.add(val);
            aux.add(val);
        }

        while (!aux.isEmpty()) {

            s.push(aux.remove());
        }

        while (!s.isEmpty()) {

            aux.add(s.pop());
        }
        while (!aux.isEmpty()) {

            s.push(aux.remove());
        }
    }


    public static void evenBeforeOdd(Queue<Integer> q) {
        Queue<Integer> aux = new LinkedList<Integer>();

        int size = q.size();

        for (int i = 0; i < size; i++) {
            int val = q.remove();
            if (val % 2 == 0) {

                aux.add(val);

            } else {

                q.add(val);

            }
        }


        while (!q.isEmpty()) {
            aux.add(q.remove());


        }
        while (!aux.isEmpty()) {
            q.add(aux.remove());
        }
    }//end
}//main
