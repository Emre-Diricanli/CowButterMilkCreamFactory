public class Node {
    Milk data;
    Node next;

    public Node(Milk data) {
        this.data = data;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
