public class PalletList {

    PalletNode head = null;
    public void add(Pallet p)
    {

        PalletNode temp = new PalletNode();

        temp.setContents(p);
        temp.next = head;
        head = temp;

    }

    /**
     * Method to remove the pallet from the list
     * @param element
     */
    public void removePalletAt(int element)
    {
        PalletNode temp = head;
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
     * Method to calculate the size of the list
     * @return counter
     */
    public int size()
    {
        int counter = 0;
        PalletNode temp = head;
        while(temp !=null)
        {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    /**
     * Method to return the list of pallets
     * @return Full list
     */
    public String printList()
    {
        String FullList = "List of all the pallets \n";
        PalletNode temp = head;
        while(temp !=null){
            FullList += temp.getContents();
            temp = temp.next;
        }
        return FullList;
    }






}
