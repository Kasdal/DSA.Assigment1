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
     * Gets the pallet position
     * @return pallet position
     */
    public int getPosition()
    {
        return position;
    }

    /**
     * Sets the pallet position
     * @param position
     */
    public void setPosition(int position)
    {
        this.position = position;
    }

    /**
     * Fields used in this class
     */
    String description;
    int itemQuantity;
    double tempRange;
    int position;
    ShelfList shelves;







    /**
     * Pallet constructor
     * @param desc
     * @param itemQ
     * @param tRange
     * @param pos
     */
    Pallet (String desc, int itemQ, double tRange, int pos)
    {

        description = desc;
        itemQuantity = itemQ;
        tempRange = tRange;
        position = pos;
    }

    public String toString()
    {

        return "The Pallet details are Pallet: " + description + ",Quantity: " + itemQuantity + ",Temperature Range:" + tempRange + ",Position:" + position + "\n";
    }


}
