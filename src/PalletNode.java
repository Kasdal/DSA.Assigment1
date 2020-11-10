public class PalletNode {

    public PalletNode next=null;
    private Pallet contents;

    /**
     * Gets the contents of the node.
     * @return
     */
    public Pallet getContents(){
        return contents; }

    /**
     * Sets the contents of the node.
     * @param p
     */
    public void setContents(Pallet p) {
        contents=p;
    }


}
