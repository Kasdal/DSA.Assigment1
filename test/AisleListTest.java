import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AisleListTest {

    AisleList aisleList = new AisleList();

    @BeforeEach
    void setUp() {
        Aisle a = new Aisle("D1", 2,2);
        Aisle b = new Aisle("D0", 4,4);
        aisleList.add(a);
        aisleList.add(b);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void printList() {
        assertTrue(aisleList.printList().contains(" D1"));
    }

    @Test
    void add() {
        Aisle a = new Aisle("D1", 2, 2);
        Aisle b = new Aisle("D0", 4, 4);
        assertEquals("D1", a.getAisleId());
        assertEquals(2, a.getAisleDepth());
        assertEquals(2,a.getAisleWidth());
    }

    @Test
    void size() {


    }

    @Test
    void aisleID() {
        Aisle goodFind = aisleList.aisleID("D1");
        assertTrue(goodFind !=null);
        Aisle noFind = aisleList.aisleID("D0");
        assertTrue(noFind ==null);
    }

    @Test
    void removeAisleAt() {
    }
}