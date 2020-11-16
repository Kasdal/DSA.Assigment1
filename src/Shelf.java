public class Shelf {

    int shelfNumber;
    PalletList  pallets;


    Shelf(int shelfN){

        shelfNumber = shelfN;
        pallets = new PalletList();

    }

    /**
     * Method to add a pallet
     * @param p
     */
    public void addpallete(Pallet p){
        pallets.add(p);
    }


    public String toString(){

        return "The Shelf details are Shelf: " + shelfNumber;
    }

}
