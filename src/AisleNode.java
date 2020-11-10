public class AisleNode {

    public AisleNode next=null;
    private Aisle contents;

    /**
     * Gets the contents of the node.
     * @return
     */
    public Aisle getContents(){
        return contents;}

    /**
     * Sets the contents of the node.
     * @param a
     */
    public void setContents(Aisle a) {
        contents = a;

    }

}
