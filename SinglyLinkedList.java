/**
 * SinglyLinkedList.java
 * 
 * Represents a SinglyLinkedList with type currency
 */
public class SinglyLinkedList {
    /** Head/first node of list */
    private LinkNode head;
    /** Tail/last node of list */
    private LinkNode tail;
    /** Number of nodes in list */
    private int count;

    /**
     * Constructor
     */
    public SinglyLinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Destructor
     */
    public void destructor() {
        head = null;
        tail = null;
        count = 0;
    }
    /**
     * Returns the number of nodes in the list
     * @return number of nodes/currency objects in the list
     */
    public int countCurrency() {
        return count;
    }

    /**
     * Checks if list is empty
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Adds a currency object to specific of the list
     * @param index - index to insert at
     * @param c - currency object to insert
     */
    public void addCurrency(int index, Currency c) {
        LinkNode e = new LinkNode(c);
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        if (index == 0) {
            addFirst(c);
        } else if (index == count) {
            addLast(c);
        } else {
            LinkNode prev = getNode(index - 1);
            e.setNext(prev.getNext());
            prev.setNext(e);
            count++;
        }
    }
    /**
     * Removes a currency object from the list
     * @param c - currency object to remove
     * @return
     */
    public Currency remove(Currency c) {
        int idx = findCurrency(c);
        if (idx == -1) {
            return null;
        }
        if (idx == 0) {
            return removeFirst();
        }
        if (idx == count - 1) {
            return removeLast();
            
        }
        return remove(idx);
    }
   
    /**
     * Removes a currency object from the list at index
     * @param index - index to remove at
     * @return the removed currency object
     */
    public Currency remove(int index) {
        
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        LinkNode prev = getNode(index - 1);
        LinkNode removed = prev.getNext();
        prev.setNext(removed.getNext());
        count--;
        return removed.getData();
    }

    /**
     * checks if list if empty
     * @return if list is empty
     */
    public boolean isListEmpty() {
        return head == null;
    }
    /**
     * Gets currency object at index
     * @param index - index to get currency object at
     * @return currency object at index
     */
    public Currency getCurrency(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        return getNode(index).getData();
    }
    /**
     * Finds the index of a currency object
     * @param c - currency object to find
     * @return index of currency object
     */
    public int findCurrency(Currency c) {
        LinkNode current = head;
        for (int i = 0; i < count; i++) {
            if (current.getData().isEqual(c)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    public void addFirst(Currency c) {
        LinkNode e = new LinkNode(c);
        if (head == null) {
            head = e;
            tail = e;
        } else {
            e.setNext(head);
            head = e;
        }
        count++;
    }
    public void addLast(Currency e) {
        LinkNode newLinkNode = new LinkNode(e);
        if (tail == null) {
            head = tail = newLinkNode;
        } else {
            tail.setNext(newLinkNode);
            tail = newLinkNode;
        }
        count++;
    }

    public Currency removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Currency ret = head.getData();
        head = head.getNext();
        count--;
        if (count == 0) {
            tail = null;
        }
        return ret;
    }

    public Currency removeLast() {
        if (isEmpty()) {
            return null;
        }
        Currency ret = tail.getData();
        if (count == 1) {
            head = tail = null;
        } else {
            LinkNode cur = head;
            while (cur.getNext() != tail) {
                cur = cur.getNext();
            }
            tail = cur;
            tail.setNext(null);
        }
        count--;
        return ret;
    }

    public Currency getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.getData();
    }

    public Currency getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getData();
    }

    public LinkNode getNode(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        LinkNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.getNext();
        }
        return cur;
    }

    public String printList() {
        LinkNode cur = head;
        String list = "";
        while (cur.getNext() != null) {
            list += cur.getData().print() + ", ";
            cur = cur.getNext();
        }
        list += "and " + cur.getData().print();
        return list;
        
    }
}
    
