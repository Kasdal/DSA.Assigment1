public class ShelfList {

    ShelfNode head;

    /**
     * Method to add shelf.
     * @param s
     */
    public void add(Shelf s){

        ShelfNode temp = new ShelfNode();

        temp.setContents(s);
        temp.next = head;
        head = temp;
    }

    /**
     * Method to return the list of all shelves
     * @return Full list
     */
    public String printList(){
        String FullList = "List of all the shelves \n";
        ShelfNode temp = head;
        while(temp !=null){
            FullList += temp.getContents();
            temp = temp.next;
        }
        return FullList;
    }

    /**
     * Method that returns the size of the shelf list.
     * @return counter
     */
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

    /**
     * Method to find a shelf by a given number passed as a parameter.
     * @param number
     * @return
     */
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
