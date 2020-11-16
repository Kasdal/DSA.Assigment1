public class AisleList {

    AisleNode head = null;
    public void add(Aisle a)
    {

        AisleNode temp = new AisleNode();

        temp.setContents(a);
        temp.next = head;
        head = temp;

    }

    /**
     * Method to return Id of the aisle.
     * @param Id
     * @return null
     */
    public Aisle aisleID(String Id)
    {
        if (head == null)
        {
            return null;
        } else {
            AisleNode temp = head;
            while(temp != null)
            {
                if(temp.getContents().getAisleId().equals(Id))
                  return temp.getContents();
                temp = temp.next;
            }

            return null;
        }
    }


    /**
     * Method to return the list of the aisles
     * @return
     */
    public String printList()
    {
        String fullList = "List of all the aisles \n";
        AisleNode temp = head;
        while(temp !=null){
            fullList += temp.getContents();
            temp = temp.next;
        }
        return fullList;
    }

    /**
     * Method to calculate the size of the list
     * @return counter
     */
    public int size()
    {
        AisleNode temp = head;
        int counter = 0;
        while(temp !=null)
        {
            counter ++;
            temp = temp.next;
        }
        return counter;

    }

    /**
     * Method to remove the aisle from the list.
     * @param element
     */
    public void removeAisleAt(int element)
    {
        AisleNode temp = head;
        int i = 0;
        if(element == 0)
        {
            head = temp.next;
        }
        else {
            while (i < element - 1 && temp != null)
            {
                temp = temp.next;
                i++;
            }
            if (temp != null && temp.next != null)
            {
                temp.next = temp.next.next;
            }
        }
    }

    /**
     * Method to return the list of shelves.
     * @return
     */
    public String printShelfList()
    {
        String shelfList = "per aisle ";
        AisleNode temp = head;
        while(temp != null)
        {
            shelfList += "aisle" +temp.getContents().aisleId + "\n\t" + temp.getContents().shelves.printList();
            temp = temp.next;
        }
        return shelfList;
    }

}
