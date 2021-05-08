package src;

/**
 选择排序
 分类 -------------- 内部比较排序
 数据结构 ---------- 数组
 最差时间复杂度 ---- O(n^2)
 最优时间复杂度 ---- 如果序列在一开始已经大部分排序过的话,会接近O(n)
 平均时间复杂度 ---- O(n^2)
 所需辅助空间 ------ O(1)
 稳定性 ------------ 稳定
*/

public class SelectionSort<T extends Comparable<T>> extends MySort<T> {
    //    1. 初始状态：无序区为R[1..n]，有序区为空；
//    2. 第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1..i-1]和R(i..n）。该趟排序从当前无序区中-选出关键字最小的记录 R[k]，将它与无序区的第1个记录R交换，使R[1..i]和R[i+1..n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；
//    3. n-1趟结束，数组有序了。
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {             //N-1次
            int min = i;
            for (int j = i + 1; j < N; j++) {  //每次遍历到最后一个
                if (less(nums[j], nums[min])) {
                    min = j;
                }
            }
            swap(nums, i, min);
        }
    }
}
