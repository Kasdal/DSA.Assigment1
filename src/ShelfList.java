public class ShelfList {

    ShelfNode head = null;
    public void add(Shelf s){

        ShelfNode temp = new ShelfNode();

        temp.setContents(s);
        temp.next = head;
        head = temp;

    }
    public String printList(){
        String FullList = "List of all the shelves \n";
        ShelfNode temp = head;
        while(temp !=null){
            FullList += temp.getContents();
            temp = temp.next;
        }
        return FullList;
    }

    public int size()
    {
        int counter = 0;
        ShelfNode temp = head;
        while(temp !=null)
        {
            counter++;
            temp = temp.next;
        }
        return counter;
    }




}
