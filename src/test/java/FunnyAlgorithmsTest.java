import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FunnyAlgorithmsTest {


    private FunnyAlgorithms funnyAlgorithms;


    @Before
    public void init()
    {
        FunnyAlgorithms.printMessageWithDate("started FunnyAlgorithmsTest");
    }

    @After
    public void endTests()
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
        assertEquals("FAILED CHECK SIMPLE MIDDLE",2, this.funnyAlgorithms.binarySearch(new int[]{2,7,11,15}, 11));

        assertEquals("FAILED CHECK SIMPLE START",0, this.funnyAlgorithms.binarySearch(new int[]{2,7,11,15}, 2));
        assertEquals("FAILED CHECK SIMPLE END",3, this.funnyAlgorithms.binarySearch(new int[]{2,7,11,15}, 15));

        //check if it finds the middle one
        assertEquals("FAILED DUPLICATE MIDDLE FIND",2, this.funnyAlgorithms.binarySearch(new int[]{1,1,1,1,1}, 1));

    }


    @Test(expected = IllegalArgumentException.class)
    public void acceptOnly0And1()
    {
        this.funnyAlgorithms.selectionSort(new int[]{}, -5);
        this.funnyAlgorithms.selectionSort(new int[]{}, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkWithNullArray()
    {
        this.funnyAlgorithms.selectionSort(null, 0);
    }
    /**
     * Check If Array is sorted
     *
     * @param array Array to be check
     * @param order Direction to sort the array (0:Ascending, 1:Descending)
     */
    private boolean isArraySorted(int[] array, int order)
    {
        if(array.length == 0)
            return true;

        int last = array[0];

        for(int i = 1;i < array.length;i++)
        {
            if(order == 0 ? array[i] < last : array[i] > last)
                return false;
            last = array[i];
        }
        return true;
    }

    @Test
    public void checkMergeSort()
    {
        int[] arrayToSortAscending = new int[]{5,21,2,3,7,3,1,8,4,3,7};
        int[] arrayToSortDescending = new int[]{5,21,2,3,7,3,1,8,4,3,7};

        this.funnyAlgorithms.selectionSort(arrayToSortAscending,0);
        assertTrue(isArraySorted(arrayToSortAscending, 0));

        this.funnyAlgorithms.selectionSort(arrayToSortDescending,1);
        assertTrue(isArraySorted(arrayToSortDescending, 1));

    }



}
