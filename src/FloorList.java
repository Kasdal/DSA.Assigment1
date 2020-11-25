public class FloorList {

    FloorNode head = null;


    /**
     * Method to add a floor.
     * @param f
     */
    public void add(Floor f)
    {
        FloorNode temp = new FloorNode();

        temp.setContents(f);
        temp.next = head;
        head = temp;
    }

    /**
     * Method to return the list of all the floors
     * @return Full list
     */
    public String printList()
    {
        String FullList = "List of all the floors \n";
        FloorNode temp = head;
        int counter = 0;
        while(temp !=null){
            FullList += counter + ": " + temp.getContents();
            counter++;
            temp = temp.next;
        }
        return FullList;
    }

    /**
     * Method to find a floor by taking in passed input id of the floor.
     * @param id
     * @return
     */
    public Floor findFloorById(String id)
    {
        FloorNode temp = head;
        while(temp != null)
        {
            if(temp.getContents().floorLevel.equalsIgnoreCase(id))
            {
                return temp.getContents();
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * Prints the aisle list by traversing through the list of floors and getting the contents
     * @return
     */
    public String printAisleList()
    {
        String aisleList = "per floor ";
        FloorNode temp = head;
        while(temp != null)
        {
            aisleList += "floor" +temp.getContents().floorId + "\n\t" + temp.getContents().aisles.printList();
            temp = temp.next;
        }
        return aisleList;
    }


    //Not used.
/*    public void removeFloor(Floor floorToDel)
    {
        boolean done = false;
        FloorNode temp = head;
        if (floorToDel.equals(temp))
        {
            head = temp.next;
            done = true;

        }
        while(temp.next != null && done == false)
        {
            if(floorToDel.equals(temp.next))
            {
                temp.next = temp.next.next;
               done = true;
            }
        temp = temp.next;

        }


    }*/

    /**
     * Removing the floor
     * @param element
     */
    public void removeFloorAt(int element)
    {
        FloorNode temp = head;
        int i = 0;
        if(element == 0)
        {
            head = temp.next;
        } else {
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
     * Method to calculate the size of the list
     * @return counter
     */
    public int size()
    {
        int counter = 0;
        FloorNode temp = head;
        while(temp !=null)
        {
            counter++;
            temp = temp.next;
        }
        return counter;
    }


    /**
     * Method to reset the warehouse contents by pointing the FloorNode to null.
     */
    public void clearWarehouse()
    {
        FloorNode temp = head;
        head = null;
    }

}
