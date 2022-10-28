import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FunnyAlgorithmsTest {


    private FunnyAlgorithms funnyAlgorithms;


    @BeforeClass
    public static void init()
    {
        FunnyAlgorithms.printMessageWithDate("started FunnyAlgorithmsTest");
    }

    @AfterClass
    public static void endTests()
    {
        FunnyAlgorithms.printMessageWithDate("ended FunnyAlgorithmsTest");
    }

    @Before
    public void startTests()
    {
        this.funnyAlgorithms = new FunnyAlgorithms();
    }

    @Test
    public void checkIfSwapWorks()
    {
        int[] dummyArray = new int[]{10,2};
        int[] beforeState = Arrays.copyOf(dummyArray, dummyArray.length);
        FunnyAlgorithms.swap(dummyArray, 0,1);

        assertEquals(dummyArray[0], beforeState[1]);
        assertEquals(dummyArray[1], beforeState[0]);
    }


    /**
     * Given an empty array to binarySearch it should return -1
     */
    @Test
    public void emptyArrayBinarySearch()
    {
        int[] emptyArray = new int[]{};

        int result = this.funnyAlgorithms.binarySearch(emptyArray, 1);

        assertEquals(-1, result);


    }

    @Test
    public void isBinarySearchWorking()
    {
        assertEquals(0, this.funnyAlgorithms.binarySearch(new int[]{3,8,1,2,3,5,7}, 3));

        //check if it finds the middle one
        assertEquals(2, this.funnyAlgorithms.binarySearch(new int[]{1,1,1,1,1}, 1));

    }



}
