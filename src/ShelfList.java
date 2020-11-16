public class ShelfList {

    ShelfNode head;
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

/*    public ShelfList()
    {
        this.head = null;
    }*/


    public Shelf findShelf(int number){
        if (head == null)
        {
            return null;
        } else {
            ShelfNode temp = head;
            while(temp != null)
            {
                if(temp.getContents().shelfNumber == number)
                    return temp.getContents();
                temp = temp.next;
            }

            return null;
        }
    }

}
