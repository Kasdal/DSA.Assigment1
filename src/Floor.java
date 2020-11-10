public class Floor {

    /**
     * Fields used in Floor class
     */
    String floorLevel;
    String floorId;
    String floorSecurity;
    double floorTemperature;
    AisleList aisles;
// Need to add list of aisles.

    /**
     * Gets the floor level
     * @return
     */
    public String getFloorLevel() {
        return floorLevel;
    }

    /**
     * Sets the floor level
     * @param floorLevel
     */
    public void setFloorLevel(String floorLevel) {
        this.floorLevel = floorLevel;
    }

    /**
     * Gets floor security
     * @return floor security
     */
    public String getFloorSecurity() {
        return floorSecurity;
    }

    /**
     * Sets the floor security
     * @param floorSecurity
     */
//Add validation here to allow high, med and low.
    public void setFloorSecurity(String floorSecurity) {
        this.floorSecurity = floorSecurity;
    }

    /**
     * Gets floor temp
     * @return floor temp
     */
    public double getFloorTemperature() {
        return floorTemperature;
    }

    /**
     * Sets floor temp
     * @param floorTemperature
     */
    public void setFloorTemperature(double floorTemperature) {
        this.floorTemperature = floorTemperature;
    }

    /**
     * Method to add a aisle
     * @param a
     */
    public void addaisle(Aisle a){
        aisles.add(a);
    }

    /**
     * Floor constructor.
     * @param fLevel
     * @param fSec
     * @param fTemp
     */
    Floor (String fLevel,String floorId, String fSec, double fTemp){

        floorLevel = fLevel;
        this.floorId = floorId;
        floorSecurity = fSec;
        floorTemperature = fTemp;
        aisles = new AisleList();
    }



    public String toString(){

        return "The Floor details are : " + floorLevel + ",Floor length: " + floorSecurity + ",Floor Temperature:" + floorTemperature + "\n";
    }


}
