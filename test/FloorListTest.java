import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorListTest {

    FloorList listOfFloors = new FloorList();

    @BeforeEach
    void setUp() {
        Floor f = new Floor("2","B","High",24.2);
        Floor c = new Floor("4","C","Med",11.2);
        listOfFloors.add(f);
        listOfFloors.add(c);
    }

    @Test
    void add() {
        Floor f = new Floor("1","K","2",22.2);
        assertEquals("1", f.getFloorLevel());
        assertEquals(22.2, f.getFloorTemperature());
        assertEquals("2",f.getFloorSecurity());

    }

    @Test
    void printList() {
        assertTrue(listOfFloors.printList().contains("The Floor details are Floor level: 2"));
        assertTrue(listOfFloors.printList().contains("The Floor details are Floor level: 4"));
        Floor f = new Floor("1","K","2",22.2);
        listOfFloors.add(f);
        assertTrue(listOfFloors.printList().contains("Floor Security: 2"));
    }

    @Test
    void findFloorById() {

        Floor goodFind = listOfFloors.findFloorById("2");
        assertTrue(goodFind !=null);
        Floor noFind = listOfFloors.findFloorById("1");
        assertTrue(noFind ==null);

    }
}