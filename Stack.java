public class Stack extends SinglyLinkedList{
    public Stack(){
        super();
    }
    public void push(Currency c){
        super.addFirst(c);
    }
    public Currency pop(){
        return super.removeFirst();
    }
    public Currency peek(){
        return super.getFirst();
    }
    public boolean isEmpty(){
        return super.countCurrency() == 0;
    }
    public String printStack(){
        return super.printList();
    }
    //override all methods from other methods from singly linked list and raise exceptions
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
