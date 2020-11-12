public class AisleList {

    AisleNode head = null;
    public void add(Aisle a)
    {

        AisleNode temp = new AisleNode();

        temp.setContents(a);
        temp.next = head;
        head = temp;

    }


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



    public String printList()
    {
        String FullList = "List of all the aisles \n";
        AisleNode temp = head;
        while(temp !=null){
            FullList += temp.getContents();
            temp = temp.next;
        }
        return FullList;
    }

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

}
