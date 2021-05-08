package src;
/**
 *
 *  分类 ------------- 内部比较排序
 *
 *  数据结构 ---------- 数组
 *
 *  最差时间复杂度 ---- 最坏情况为输入序列是降序排列的,此时时间复杂度O(n^2)
 *
 *  最优时间复杂度 ---- 最好情况为输入序列是升序排列的,此时时间复杂度O(n)
 *
 *  平均时间复杂度 ---- O(n^2)
 *
 *  所需辅助空间 ------ O(1)
 *
 *  稳定性 ------------ 稳定
 */



public class InsertionSort <T extends Comparable<T>>extends MySort<T>{

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(nums[j], nums[j - 1]); j--) {
                swap(nums, j, j - 1);
            }
        }
    }
}
