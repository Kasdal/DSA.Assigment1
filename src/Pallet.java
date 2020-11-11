public class Pallet {
    /**
     * Description getter
     * @return description of the goods on pallet
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the description
     * @param description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * Gets the item quantity
     * @return item quantity on pallet
     */
    public int getItemQuantity()
    {
        return itemQuantity;
    }

    /**
     * Sets the item quantity
     * @param itemQuantity
     */
    public void setItemQuantity(int itemQuantity)
    {
        this.itemQuantity = itemQuantity;
    }

    /**
     * Gets the temp range
     * @return temp range
     */
    public double getTempRange()
    {
        return tempRange;
    }

    /**
     * Sets temp range
     * @param tempRange
     */
    public void setTempRange(double tempRange)
    {
        this.tempRange = tempRange;
    }


    /**
     * Fields used in this class
     */
    String description;
    int itemQuantity;
    double tempRange;
    int positionX;
    int positionY;
    ShelfList shelves;







    /**
     * Pallet constructor
     * @param desc
     * @param itemQ
     * @param tRange
     * @param posX
     */
    Pallet (String desc, int itemQ, double tRange, int posX, int posY)
    {

        description = desc;
        itemQuantity = itemQ;
        tempRange = tRange;
        positionX = posX;
        positionY = posY;
    }

    public String toString()
    {

        return "The Pallet details are Pallet: " + description + ",Quantity: " + itemQuantity + ",Temperature Range:" + tempRange + ",PositionX:" + positionX +  ",PositionY:" + positionY + "\n";
    }


}
