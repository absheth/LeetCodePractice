import packageClass.Stack;
class TryStack {
    public static void main (String[] args) {
        Stack stack = new Stack();
        System.out.println("Pushing 2");
        stack.push(2);
        System.out.println("Pushing 5");
        stack.push(5);
        System.out.println("Pushing 8");
        stack.push(8);
        System.out.println("Pushing 2");
        stack.push(2);
        System.out.println("Pushing 6");
        stack.push(6);
        System.out.println("Pushing 3");
        stack.push(3);
        System.out.println("Pushing 7");
        stack.push(7);
        stack.printStack();
        System.out.println("Top element: " + stack.peek() + " and totalElement: " + stack.size());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());
        stack.printStack();
        System.out.println("Top element: " + stack.peek() + " and totalElement: " + stack.size());

    }
}
