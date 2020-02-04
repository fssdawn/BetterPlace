package leetcode31_40;

/**
 * <p>题目名字：35. 搜索插入位置</p>
 * <p>题目描述：
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * </p>
 *
 * <p>题目示例：
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 * </p>
 *
 * @author Hobert-Li
 * @create 2020/2/4 15:49
 */

public class _35_searchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        _35_searchInsertPosition soultion = new _35_searchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(soultion.searchInsert(nums, target));
    }

}
