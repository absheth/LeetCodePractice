package packageClass;
public class Stack {
    class Node {
        int data;
        Node next;
        Node(int data, Node node) {
            this.data = data;
            this.next = node;
        }

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node top;
    int totalElement;

    public Stack() {
        totalElement = 0;
        top = null;
    }

    public void push (int data) {
        if (top == null) {
            top = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }
        totalElement++;
    }

    public int size() {
        return totalElement;
    }

    public int pop() {
        int returnValue = -1;
        if(totalElement == 0) {
            System.out.println("Pop Error: Size of the stack is "
                    + totalElement);
        } else {
            returnValue = top.data;
            top = top.next;
            totalElement--;
        }
        return returnValue;
    }

    public int peek () {
        int returnValue = -1;
        if(totalElement == 0) {
            System.out.println("Peek Error: Size of the stack is "
                    + totalElement);
        } else {
            returnValue = top.data;
        }
        return returnValue;
    }

    public void printStack() {
        Node temp = top;
        System.out.println("Printing stack..");
        System.out.println("----------------");
        while(temp != null) {
            System.out.print(temp.data + (temp.next!=null?"-->":""));
            temp = temp.next;
        }

        System.out.println("\n----------------");

    }
}
