import org.junit.AfterClass;
import org.junit.BeforeClass;

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



}
