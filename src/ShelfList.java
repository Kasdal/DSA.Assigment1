public class ShelfList {

    ShelfNode head = null;
    public void add(Shelf s){

        ShelfNode snode = new ShelfNode();

        snode.setContents(s);
        snode.next = head;
        head = snode;

    }
    public String printList(){
        String FullList = "List of all the shelves \n";
        ShelfNode snode = head;
        while(snode !=null){
            FullList += snode.getContents();
            snode = snode.next;
        }
        return FullList;
    }




}
