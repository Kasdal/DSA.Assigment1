public class AisleList {

    AisleNode head = null;
    public void add(Aisle a){

        AisleNode anode = new AisleNode();

        anode.setContents(a);
        anode.next = head;
        head = anode;

    }


    public Aisle aisleID(String Id) {
        if (head == null) {
            return null;
        } else {
            AisleNode anode = head;
   //         while ((anode != null) && (!anode.getContents().getAisleId().equals(Id)))
            while(anode != null){
                if(anode.getContents().getAisleId().equals(Id))
                  return anode.getContents();
                anode = anode.next;
            }

            return null;
        }
    }

 /*   public Floor aisleId(String id){
        AisleNode anode = head;
        while(anode != null){
            if(anode.getContents().getAisleId().equalsIgnoreCase(id)){
                return anode.getContents();
            }
            anode = anode.next;
        }
        return null;
    }
*/




    public String printList(){
        String FullList = "List of all the aisles \n";
        AisleNode anode = head;
        while(anode !=null){
            FullList += anode.getContents();
            anode = anode.next;
        }
        return FullList;
    }

    public int size(){
        AisleNode anode = head;
        int counter = 0;
        while(anode !=null){
            counter ++;
            anode = anode.next;
        }
        return counter;

    }

    public void removeAisleAt(int element) {
        AisleNode temp = head;
        int i = 0;
        if(element == 0){
            head = temp.next;
        }
        else {
            while (i < element - 1 && temp != null) {
                temp = temp.next;
                i++;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
            }
        }
    }

}
