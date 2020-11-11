public class Aisle {

    /**
     * Gets Aisle Id
     * @return
     */
    public String getAisleId()
    {
        return aisleId;
    }

    /**
     * Sets Aisle Id
     * @param aisleId
     */
    public void setAisleId(String aisleId)
    {
        this.aisleId = aisleId;
    }

    /**
     * Gets aisle width
     * @return
     */
    public int getAisleWidth()
    {
        return aisleWidth;
    }

    /**
     * Sets aisle width
     * @param aisleWidth
     */
    public void setAisleWidth(int aisleWidth)
    {
        this.aisleWidth = aisleWidth;
    }

    /**
     * Gets aisle depth
     * @return
     */
    public int getAisleDepth()
    {
        return aisleDepth;
    }

    /**
     * sets aisle depth
     * @param aisleDepth
     */
    public void setAisleDepth(int aisleDepth)
    {
        this.aisleDepth = aisleDepth;
    }


    /**
     * Fields used in Aisle class.
     */
    String aisleId;
    int aisleWidth;
    int aisleDepth;
    ShelfList  shelves;

    /**
     * Method to add a shelf.
     * @param s
     */
    public void addshelf(Shelf s)
    {
        shelves.add(s);
    }

    /**
     * Aisle constructor
     * @param aI
     * @param aisleD
     * @param aisleW
     */
    Aisle(String aI, int aisleD, int aisleW)
    {

        aisleId = aI;
        aisleDepth = aisleD;
        aisleWidth = aisleW;
        shelves = new ShelfList();
    }

    public String toString()
    {

        return "The Aisle details are: " + "Aisle ID: "+ aisleId  + "\n" + "Aisle Depth:" +  aisleDepth + " Aisle Width:" + aisleWidth +  "\n";
    }




}
