import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.print("Enter string: ");
        Scanner in=new Scanner(System.in);
        String inString = in.nextLine();
        Stack stack = new Stack();
        Queue queue = new LinkedList();

        for (int i = 0; i < inString.length(); i++) {
            stack.push(inString.charAt(i));
        }

        String reverseStringS = "";

        while (!stack.isEmpty()) {
            reverseStringS = reverseStringS+stack.pop();
        }

        for (int i = 0; i < inString.length(); i++) {
            queue.add(inString.charAt(i));
        }
        String reverseStringQ = "";

        while (!queue.isEmpty()) {
            reverseStringQ = reverseStringQ+queue.remove();
        }

        System.out.println("Stack: " + reverseStringS);
        System.out.println("Queue: " + reverseStringQ);

        if (inString.equals(reverseStringS) && inString.equals(reverseStringQ)) {
            System.out.println(inString + " is a palindrome.");
        }
        else {
            System.out.println(inString + " is not a palindrome.");
        }

    }
}