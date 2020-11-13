import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.awt.*;
import java.util.Scanner;
import java.util.logging.Level;

public class Main {


    /**
     * Initialising variables in this class.
     */
    private Scanner input;
    static AisleList aisles = new AisleList();
    static PalletList pallets = new PalletList();
    static ShelfList shelves = new ShelfList();
    static FloorList floors = new FloorList();

    /**
     * Menu Controller Constructor
     */
    private Main()
    {
        input = new Scanner(System.in);
    }


    /**
     * Starts the Application
     * @param args Starts the Main Class with menu options.
     */

    public static void main(String[]args)
    {
        Main app = new Main();
        app.runMenu();
    }

    void runMenu(){
        int option = startMenu();
        while (option != 0) {
         switch (option){
             case 1:
                 addFloor();
                 break;
             case 2:
                 addAisle();
                 break;
             case 3:
                 addShelf();
                 break;
             case 4:
                 addPallet();
                 break;
             case 5:
                 listFloors();
                 break;
             case 6:
                 listAisles();
                 break;
             case 7:
               listShelves();
                break;
             case 8:
                 int option8 = deletionMenu();
                 switch (option8) {
                     case 1:
                         input.nextLine();
                         removeFloor();
                         break;
                 }
                 break;
//             case 9:
//                 //();
//                 break;
//             case 10:
//                 //();
//                 break;
//             case 11:
//                 //();
//                 break;
//             case 12:
//                 //();
//                 break;

             default:
                 System.out.println("Invalid number entered");
                 break;
         }
            option = startMenu();
        }
    }

    /**
     * Prints the Main Menu.
     * @return The selected menu
     */
    private int startMenu() {
        System.out.println("		    WELCOME				  ");
        System.out.println("                                  ");
        System.out.println("----------------------------------");
        System.out.println("Please chose appropriate option");
        System.out.println("----------------------------------");
        System.out.println("1) Add a new Floor");
        System.out.println("2) Add a new Aisle to Floor");
        System.out.println("3) Add a Shelf to a Aisle");
        System.out.println("4) Add a Pallet to a Shelf");
        System.out.println("----------------------------------");
        System.out.println("5) List all Floors");
        System.out.println("6) List all Aisles");
        System.out.println("7) List all Shelves");
        System.out.println("8) Open Delete menu");
        System.out.println("----------------------------------");
        System.out.println("9) Search for goods ");
        System.out.println("11) ");
        System.out.println("10) ");
        System.out.println("----------------------------------");
        System.out.println("12) Save the file.");
        System.out.println("13) Load the file.");
        System.out.println("----------------------------------");
        System.out.println("0) Exit");
        System.out.print("==>> ");
        int option = 0;
        try {
            option = input.nextInt();
        } catch (InputMismatchException e)
        {
            System.out.println("Input was not a number please try again");
            input.next();
            startMenu();
        }
        if ((option >= 0) && (option <= 13))
        {
            return option;
        } else {
            System.out.println("Invalid Index selected. Please Try again");
            return startMenu();
        }
    }

    /**
     * Prints the Deletion Menu
     * @return - Selected Option
     */
    private int deletionMenu() {
        System.out.println("		    WELCOME TO THE DELETION MENU				  ");
        System.out.println("                                  ");
        System.out.println("----------------------------------");
        System.out.println("What would you like to do?");
        System.out.println("----------------------------------");
        System.out.println("1) Remove Floor");
        System.out.println("2) Remove Aisle");
        System.out.println("3) Remove Shelf");
        System.out.println("4) Remove Pallet");
        System.out.println("----------------------------------");
        System.out.println("5) Return to Start Menu");
        System.out.println("0) Exit");
        System.out.print("==>> ");
        int option = 0;
        try {
            option = input.nextInt();
        } catch (InputMismatchException e)
        {
            System.out.println("Input was not a number please try again");
            input.next();
            startMenu();
        }
        if ((option >= 0) && (option <= 5))
        {
            return option;
        } else {
            System.out.println("Invalid Index selected. Please Try again");
            return deletionMenu();
        }
    }

    /**
     * Method to add a floor
     *requires input from user and preforms actions based on the input
     */
    public void addFloor()
    {
        System.out.println("Please enter the floor level");
        String level = input.next();
        System.out.println("Please enter the floor Id");
        String floorID = Character.toString(input.next().charAt(0));
        // Should check to make sure the floor name is unique.
        System.out.println("Please enter the floor security");
        String security = input.next();
        System.out.println("Enter the temperature range");
        double temp = input.nextDouble();
        Floor f = new Floor(level, floorID, security, temp);
        floors.add(f);
        System.out.println("Current list of floors are: \n" + floors.printList());
    }

    public void addAisle(){
        Floor floorFound = findFloor();
        if(floorFound !=null)
        {
            System.out.println("Enter the length of the aisle by the number of pallets it can store.");
            int aisleD = input.nextInt();
            System.out.println("Enter the width of the aisle by the number of pallets it can store.");
            int aisleW = input.nextInt();
            String aisleID = floorFound.floorId + floorFound.aisles.size();
            Aisle newAisle = new Aisle(aisleID, aisleD,aisleW);
            floorFound.addaisle(newAisle);
            System.out.println(floorFound.aisles.printList());
        }

    }

    public void addShelf()
    {
        Floor floorFound = findFloor();
        if(floorFound != null)
        {
            System.out.println(floorFound.aisles.printList());
            System.out.println("Chose the Aisle Id");
            String Id = input.next();
            Aisle aisleFound = floorFound.aisles.aisleID(Id);
            if (aisleFound !=null)
            {
                System.out.println("Enter the Shelf number: ");
                int shelfNum = input.nextInt();
                Shelf s = new Shelf(shelfNum);
                aisleFound.addshelf(s);
                System.out.println(aisleFound.shelves.printList());

            }

        }

    }


    public void addPallet(){
        Shelf shelfFound = findShelf();
        if(shelfFound !=null)
        {
            System.out.println("Enter pallet description: ");
            String description = input.next();
            System.out.println("Enter the quantity of goods on pallet: ");
            int quantity = input.nextInt();
            System.out.println("Enter minimum temperature storage: ");
            double minTempR = input.nextDouble();
            System.out.println("Enter maximum temperature storage: ");
            double maxTempR = input.nextDouble();
            System.out.println("Enter the pallet row position on a shelf");
            int posX = input.nextInt();
            System.out.println("Enter the pallet column position on a shelf: ");
            int posY = input.nextInt();
            Pallet p = new Pallet(description, quantity, minTempR, maxTempR,posX, posY);
            shelfFound.addpallete(p);
            System.out.println(shelfFound.pallets.printList());
        }
    }


    /**
     * Method to find the floor
     * @return floor
     */
    public Floor findFloor()
    {
    System.out.println("Chose the floor by Id: ");
    System.out.println(floors.printList());
    String Id = input.next();
    Floor floorFound = floors.findFloorById(Id);

    return floorFound;
}

    /**
     * Method to find an aisle
     * @return aisle
     */
    public Aisle findAisle()
    {
        Floor floorFound = findFloor();
    System.out.println(floorFound.aisles.printList());
    System.out.println("Chose the Aisle Id");
    String Id = input.next();
    Aisle aisleFound = floorFound.aisles.aisleID(Id);
    return aisleFound;
    }

public Shelf findShelf(){
    Aisle aisleFound = findAisle();
    if(aisleFound != null) {
        System.out.println(aisleFound.shelves.printList());
        System.out.println("Enter the Shelf number: ");
        int shelfNum = input.nextInt();
        Shelf shelfFound = aisleFound.shelves.findShelf(shelfNum);
        return shelfFound;
    }
 return null;
}

    /**
     * Prints the current list of floors
     */
    public void listFloors()
    {
        System.out.println("Current list of floors are: \n" + floors.printList());
    }

    /**
     * Prints the list of aisles on the current floor.
     */

    public void listAisles()
    {
        System.out.println("Current list of aisles are: " + floors.printAisleList());
    }

    public void listShelves()
    {
        System.out.println("Current list of shelves are: \n" + floors + aisles + shelves.printList());
    }

    /**
     * Meothod to remove the floor
     * lists the floors, waits for user input
     * prints the list of floors after the process
     */
    public void removeFloor()
    {
        if (floors.size() > 0) {
            listFloors();
            System.out.println("Enter the floor index: ");
            int index = input.nextInt();
            floors.removeFloorAt(index);
            System.out.println("Current list of floors are: \n" + floors.printList());
        }
        else System.out.println("No Floors to delete");
        System.out.println("\n\n");
    }
}


