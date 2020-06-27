public class SLList {
    IntNode first;

    public SLList(int x){
        IntNode first = new IntNode(x, null);
    }

    public void addfirst(int x){
        this.first = new IntNode(x, this.first);
    }
    public int getfirst(){
        return this.first.item;
    }
    public static void main(String[] args){
        SLList L = new SLList(1);
        L.addfirst(2);
        L.addfirst(3);
        L.addfirst(4);
        L.addfirst(5);
        System.out.println(L.getfirst());
    }
    
}