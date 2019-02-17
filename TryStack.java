package code_practice;
import code_practice.Stack;

class TryStack {
    public static void main (String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(5);
        stack.push(8);
        stack.push(2);
        stack.push(6);
        stack.push(2);
        stack.push(7);
        stack.printStack();
        System.out.println("Top element: " + stack.peek() + " and totalElement: " + stack.size());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());

    }
}
