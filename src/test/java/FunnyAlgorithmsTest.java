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

}
