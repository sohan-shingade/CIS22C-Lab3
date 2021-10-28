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
    public Currency peekFront(){
        return super.getLast();
    }
    public Currency peekRear(){
        return super.getLast();
    }
    public String printQueue(){
        return super.printList();
    }

    @Override 
    public int countCurrency() {
        throw new UnsupportedOperationException();
    }
    @Override
    public void addFirst(Currency c) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void addLast(Currency c) {
        throw new UnsupportedOperationException();
    }
    @Override
    public Currency removeFirst() {
        throw new UnsupportedOperationException();
    }
    @Override
    public Currency removeLast() {
        throw new UnsupportedOperationException();
    }
    @Override
    public Currency getFirst() {
        throw new UnsupportedOperationException();
    }
    @Override
    public Currency getLast() {
        throw new UnsupportedOperationException();
    }
    @Override
    public void addCurrency(int index, Currency c) {
        throw new UnsupportedOperationException();
    }
    @Override
    public Currency remove(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public Currency remove(Currency c) {
        throw new UnsupportedOperationException();
    }
    @Override
    public Currency getCurrency(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean isListEmpty() {
        throw new UnsupportedOperationException();
    }
    @Override
    public int findCurrency(Currency c) {
        throw new UnsupportedOperationException();
    }
    @Override
    public LinkNode getNode(int index) {
        throw new UnsupportedOperationException();
    }
}
