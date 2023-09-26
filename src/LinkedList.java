public class LinkedList {
    Node head;
    public LinkedList() {
    }

    public void add(Milk data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }else {
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public Milk getNext(){
        if(this.head == null){
            return null;
        }else{
            Node current = this.head;
            this.head = this.head.getNext();
            return current.data;
        }
    }

    public int countItems(){
        int count = 0;
        if(this.head == null){
            return 0;
        }else{
            Node current = this.head;
            while(current != null){
                current = current.getNext();
                count++;
            }
        }
        return count;
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }else{
            return false;
        }
    }

}
