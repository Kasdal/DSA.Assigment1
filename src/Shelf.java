public class Shelf {

    int shelfNumber;
    PalletList  palletes;


    Shelf(int shelfN){

        shelfNumber = shelfN;

    }

    /**
     * Method to add a pallet
     * @param p
     */
    public void addpallete(Pallet p){
        palletes.add(p);
    }


    public String toString(){

        return "The Shelf details are Shelf: " + shelfNumber;
    }

}
