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
    public double getTempRangeMin()
    {
        return tempRangeMin;
    }

    /**
     * Sets temp range
     * @param tempRangeMin
     */
    public void setTempRangeMin(double tempRangeMin)
    {
        this.tempRangeMin = tempRangeMin;
    }


    public double getTempRangeMax()
    {
        return tempRangeMax;
    }

    public void setTempRangeMax(double tempRangeMax)
    {
        this.tempRangeMax = tempRangeMax;
    }



    /**
     * Fields used in this class
     */
    String description;
    int itemQuantity;
    double tempRangeMin;
    double tempRangeMax;
    int positionX;
    int positionY;



    /**
     * Pallet constructor
     * @param desc
     * @param itemQ
     * @param tRangeMin
     * @param tRangeMax
     * @param posX
     * @param posY
     */
    Pallet (String desc, int itemQ, double tRangeMin, double tRangeMax, int posX, int posY)
    {

        description = desc;
        itemQuantity = itemQ;
        tempRangeMin = tRangeMin;
        tempRangeMax = tRangeMax;
        positionX = posX;
        positionY = posY;
    }

    public String toString()
    {

        return "The Pallet details are Pallet: " + description + ",Quantity: " + itemQuantity + ",Temperature Range:" + tempRangeMin + ",PositionX:" + positionX +  ",PositionY:" + positionY + "\n";
    }


}
