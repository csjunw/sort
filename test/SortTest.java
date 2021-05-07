package test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import src.BubbleSort;
import src.SelectionSort;

public class SortTest {
    Double[] myList = { 2.9, 3.4, 3.5,1.9};
    @Before
    public void initialize() {
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
    }

    @Test
    public void testBubble(){
        new BubbleSort<Double>().sort(myList);
    }

    @Test
    public void testSelection(){
        new SelectionSort<Double>().sort(myList);
    }

    @After
    public void afterSort()
    {
        System.out.println("排序后");

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
    }
}
