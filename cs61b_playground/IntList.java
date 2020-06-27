public class IntList{
    public int first;
    public IntList rest;
    public IntList(int x, IntList y){
        this.first = x;
        this.rest = y;
    }
    public int size(){
        if (this.rest == null){
            return 1;
        }
        return this.rest.size();
    }

    public int stupidGet(int index){
        int i = index;
        IntList p = this;
        while(i > 0){
            p = p.rest;
            i = i - 1;
        }
        return p.first;
    }
    public int get(int index){
        if (index == 0){
            return this.first;
        }
        index -= 1;
        return this.rest.get(index);
        /** return this.rest.get(index - 1) */
    }


    public static void main(String[] args){
         /**IntList test1; Declaration a varible "L" which is a IntList "pointer". */ 
        /** test1 = new IntList();  keyword "new" will return the address of a new object. */ 

        IntList test2 = new IntList(10, null);
        test2 = new IntList(8, test2);
        test2 = new IntList(5, test2);
        test2 = new IntList(1, test2);
        System.out.println(test2.stupidGet(0));
        System.out.println(test2.stupidGet(1));
        System.out.println(test2.stupidGet(2));
        System.out.println(test2.stupidGet(3));
        System.out.println(test2.get(0));
        System.out.println(test2.get(1));
        System.out.println(test2.get(2));
        System.out.println(test2.get(3));
    }
}