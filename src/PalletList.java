public class PalletList {

    PalletNode head = null;
    public void add(Pallet p){

        PalletNode pnode = new PalletNode();

        pnode.setContents(p);
        pnode.next = head;
        head = pnode;

    }

    public void removePalletAt(int element) {
        PalletNode temp = head;
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
