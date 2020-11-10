public class ShelfNode {

    public ShelfNode next=null;
    private Shelf contents;
    /**
     * Gets the contents of the node.
     * @return
     */
    public Shelf getContents(){
        return contents;}

    /**
     * Sets the contents of the node.
     * @param s
     */
    public void setContents(Shelf s) {
        contents=s;
    }

}
