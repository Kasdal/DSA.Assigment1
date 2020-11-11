public class FloorList {

    FloorNode head = null;
    public void add(Floor f){

        FloorNode fnode = new FloorNode();

        fnode.setContents(f);
        fnode.next = head;
        head = fnode;

    }
    public String printList(){
        String FullList = "List of all the floors \n";
        FloorNode fnode = head;
        int counter = 0;
        while(fnode !=null){
            FullList += counter + ": " + fnode.getContents();
            counter++;
            fnode = fnode.next;
        }
        return FullList;
    }

    public Floor findFloorById(String id){
        FloorNode fnode = head;
        while(fnode != null){
            if(fnode.getContents().floorLevel.equalsIgnoreCase(id)){
                return fnode.getContents();
            }
            fnode = fnode.next;
        }
        return null;
    }

    /**
     * Prints the aisle list by traversing through the list of floors and getting the contents
     * @return
     */
    public String printAisleList(){
        String aisleList = "per floor ";
        FloorNode fnode = head;
        while(fnode != null){
            aisleList += "floor" +fnode.getContents().floorId + "\n\t" + fnode.getContents().aisles.printList();
            fnode = fnode.next;
        }
        return aisleList;
    }

    public void removeFloor(Floor floorToDel){
        boolean done = false;
        FloorNode fnode = head;
        if (floorToDel.equals(fnode)){
            head = fnode.next;
            done = true;

        }
        while(fnode.next != null && done == false)
        {
            if(floorToDel.equals(fnode.next)){
                fnode.next = fnode.next.next;
               done = true;
            }
        fnode = fnode.next;

        }

        //If the node we want to del is not the head
        //need to write a loop while the next node is not equal to null
        //check the nodes next if it equals what we want to del
        //then make this nodes next equal to the next nodes next.

    }

    public void removeFloorAt(int element) {
        FloorNode temp = head;
        int i = 0;
        if(element == 0){
            head = temp.next;
        }
        else {
            while (i < element - 1 && temp != null) { //Get to the 4th Node
                temp = temp.next;
                i++;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
            }
        }
    }

    public int size(){
        int counter = 0;
        FloorNode fnode = head;
        while(fnode !=null){
            counter++;
            fnode = fnode.next;
        }
        return counter;
    }

}
