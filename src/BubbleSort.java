package src;
/**
 冒泡排序
 分类 -------------- 内部比较排序
 数据结构 ---------- 数组
 最差时间复杂度 ---- O(n^2)
 最优时间复杂度 ---- 如果能在内部循环第一次运行时,使用一个旗标来表示有无需要交换的可能,可以把最优时间复杂度降低到O(n)
 平均时间复杂度 ---- O(n^2)
 所需辅助空间 ------ O(1)
 稳定性 ------------ 稳定
 */
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
}