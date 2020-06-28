public class SLList {
    public IntNode first; /** the first may be a pointer. */

    public class IntNode{
        public int item;
        public IntNode next;
        public IntNode(int x, IntNode y){
            this.item = x;
            this.next = y;
        }
    }
    public SLList(int x){
        this.first = new IntNode(x, null);
    /** Why IntNode first = new IntNode(x, null); is wrong? 
        We do not need a new declaration in the construction function.
        If a new first is declared, first in the object of SLList will be null*/
    }

    public void addLast(int x){
        IntNode p;
        p = this.first;
        while (p != null){
            p = p.next; /** very important */
        }
        p = new IntNode (x, null);
    }
    public int size(){
        IntNode p;
        int listSize = 1;
        p = this.first;
        while (p != null){
            listSize = listSize + 1;
            p = p.next;
            System.out.println("moving");
        }
        return listSize;
    }

    public void addFirst(int x){
        this.first = new IntNode(x, this.first);
    }
    public int getFirst(){
        return this.first.item;
    }
    public static void main(String[] args){
        SLList L = new SLList(1);
        L.addFirst(2);
        L.addFirst(3);
        L.addLast(1);
        System.out.println(L.size());
    }
    
}