public class Floor {

    /**
     * Fields used in Floor class
     */
    String floorLevel;
    String floorId;
    String floorSecurity;
    double floorTemperature;
    AisleList aisles;


    /**
     * Gets the floor level
     * @return
     */
    public String getFloorLevel()
    {
        return floorLevel;
    }

    /**
     * Sets the floor level
     * @param floorLevel
     */
    public void setFloorLevel(String floorLevel)
    {
        this.floorLevel = floorLevel;
    }

    /**
     * Gets floor security
     * @return floor security
     */
    public String getFloorSecurity()
    {
        return floorSecurity;
    }

    /**
     * Sets the floor security
     * @param floorSecurity
     */
//Add validation here to allow high, med and low.
    public void setFloorSecurity(String floorSecurity)
    {
        this.floorSecurity = floorSecurity;
    }

    /**
     * Gets floor temp
     * @return floor temp
     */
    public double getFloorTemperature()
    {
        return floorTemperature;
    }

    /**
     * Sets floor temp
     * @param floorTemperature
     */
    public void setFloorTemperature(double floorTemperature)
    {
        this.floorTemperature = floorTemperature;
    }

    /**
     * Method to add a aisle
     * @param a
     */
    public void addAisle(Aisle a)
    {
        aisles.add(a);
    }

    /**
     * Floor constructor
     * @param fLevel
     * @param floorId
     * @param fSec
     * @param fTemp
     */
    Floor (String fLevel,String floorId, String fSec, double fTemp)
    {
        floorLevel = fLevel;
        this.floorId = floorId;
        floorSecurity = fSec;
        floorTemperature = fTemp;
        aisles = new AisleList();
    }


    /**
     * @return Floor details as a string.
     */
    public String toString()
    {
        return "The Floor details are Floor level: " + floorLevel + ", Floor Security: " + floorSecurity + ", Floor Temperature:" + floorTemperature + "\n";
    }


}
