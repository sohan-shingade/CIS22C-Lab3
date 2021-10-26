/**
 * SinglyLinkedList<E>
 */
public class SinglyLinkedList {
    private LinkNode head;
    private LinkNode tail;
    private int count;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void addFirst(Currency e) {
        LinkNode newLinkNode = new LinkNode(e);
        newLinkNode.setNext(head);
        head = newLinkNode;
        if (tail == null) {
            tail = head;
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

    public void print() {
        LinkNode cur = head;
        while (cur != null) {
            System.out.print(cur.getData() + " ");
            cur = cur.getNext();
        }
        System.out.println();
    }
}
    
