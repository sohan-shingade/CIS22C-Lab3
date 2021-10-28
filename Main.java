public class Main {
    public static void main(String[] args) {
        Currency[] dollarsArr = {new Dollar(57.12), new Dollar(23.44), new Dollar(87.43), 
            new Dollar(68.99), new Dollar(111.22), new Dollar(44.55), 
            new Dollar(77.77), new Dollar(18.36), new Dollar(543.21), 
            new Dollar(20.21), new Dollar(345.67), new Dollar(36.18), 
            new Dollar(48.48), new Dollar(101.00), new Dollar(11.00), 
            new Dollar(21.00), new Dollar(51.00), new Dollar(1.00), 
            new Dollar(251.00), new Dollar(151.00)};

            SinglyLinkedList list = new SinglyLinkedList();
            Stack stack = new Stack();
            Queue queue = new Queue();
            for (int i = 0; i < 7; i++) {
                list.addLast(dollarsArr[i]);
            }
            System.out.println("Index of $87.43: " + list.findCurrency(new Dollar(87.43)));
            System.out.println("Index of $44.56: " + list.findCurrency(new Dollar(44.56)));  
            list.remove(new Dollar(111.22));
            list.remove(2);
            System.out.println("List: ");
            System.out.println(list.printList() + "\n");
            for (int i = 7; i < 11; i++) {
                list.addCurrency(i % 5, dollarsArr[i]);
            }
            list.remove(list.countCurrency() % 6);
            list.remove(list.countCurrency() / 7);
            System.out.println("List: ");
            System.out.println(list.printList() + "\n");


            for (int i = 13; i < 20; i++) {
                stack.push(dollarsArr[i]);
            }
            stack.peek().print();
            stack.pop();
            stack.pop();
            stack.pop();
            System.out.println("Stack: ");
            System.out.println(stack.printStack() + "\n");
            for (int i = 0; i < 5; i++) {
                stack.push(dollarsArr[i]);
            }
            System.out.println("Stack: ");
            System.out.println(stack.printStack() + "\n");
            stack.pop();
            stack.pop();
            System.out.println("Stack: ");
            System.out.println(stack.printStack() + "\n");

            for (int i = 0; i < 7; i++) {
                int idx = 2*i + 5;
                queue.enqueue(dollarsArr[idx]);
            }
            System.out.println("Front of queue: " + queue.peekFront().print());
            System.out.println("Back of queue: " + queue.peekRear().print() + "\n");
            queue.dequeue();
            queue.dequeue();
            for (int i = 10; i < 15; i++) {
                queue.enqueue(dollarsArr[i]);
            }
            for (int i = 0; i < 3; i++) {
                queue.dequeue();
            }
            System.out.println("Queue: ");
            System.out.println(queue.printQueue() + "\n");
    }
}
