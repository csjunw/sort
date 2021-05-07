package src;

public class BubbleSort<T extends Comparable<T>> extends MySort<T> {

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        boolean isSorted = false;
        for (int i = N - 1; i > 0 && !isSorted; i--) {
            isSorted = true;
            for (int j = 0; j < i; j++) {
                if (less(nums[j+1],nums[j])) {
                    isSorted = false;
                    swap(nums, j,j+1);
                }

            }
        }

    }
    public static void main(String[] args) {
        Double[] myList = { 2.9, 3.4, 3.5,1.9};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        System.out.println("排序后");
        new BubbleSort<Double>().sort(myList);
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

    }
}