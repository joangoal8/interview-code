import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoveElementToEndTest {

    private MoveElementToEnd moveElementToEnd;

    @BeforeEach
    void setUp() {
        moveElementToEnd = new MoveElementToEnd();
    }

    @Test
    void test1() {
        List<Integer> arrayToTest = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
        int toMove = 2;
        assertEquals(Arrays.asList(1, 3, 4, 2, 2, 2, 2, 2), moveElementToEnd.moveElementToEnd(arrayToTest, toMove));
    }

    @Test
    void test2() {
        List<Integer> arrayToTest = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 6));
        int toMove = 3;
        assertEquals(Arrays.asList(1, 2, 4, 5, 6), moveElementToEnd.moveElementToEnd(arrayToTest, toMove));
    }

}