public class FloorNode {


    public FloorNode next=null;
    private Floor contents;

    /**
     * Gets the contents of the node.
     * @return
     */
    public Floor getContents(){
        return contents;}

    /**
     * Sets the contents of the node.
     * @param f
     */
    public void setContents(Floor f) {
        contents=f;
    }


}
