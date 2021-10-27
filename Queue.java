public class Queue extends SinglyLinkedList{
    //methods: constructor, enqueue, dequeue, isEmpty, size, peekFront, peekRear
    public Queue(){
        super();
    }
    public void enqueue(Currency o){
        super.addFirst(o);
    }
    public Currency dequeue(){
        return super.removeLast();
    }
    public boolean isEmpty(){
        return super.isEmpty();
    }
    public int countCurrency(){
        return super.countCurrency();
    }
    public Currency peekFront(){
        return super.getLast();
    }
    public Currency peekRear(){
        return super.getLast();
    }
    public void printQueue(){
        super.printList();
    }
}
