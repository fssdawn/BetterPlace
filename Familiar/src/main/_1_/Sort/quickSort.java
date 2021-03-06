package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static Sort.bubbleSort.swap;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/23 17:57
 */


public class quickSort {
    public static void quickSort(int[] nums) {
        nums = shuffle(nums);
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int l, int h) {
        if (h <= l) {
            return;
        }
        int j = partition(nums, l, h);
        quickSort(nums, l, j - 1);
        quickSort(nums, j + 1, h);
    }

    private static int partition(int[] nums, int l, int h) {
        int i = l;
        int j = h + 1;
        int s = nums[l];
        while (true) {
            while (nums[++i] <= s && i < h);
            while (nums[--j] >= s && j > l);
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private static int[] shuffle(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        Collections.shuffle(list);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {6,7,9,3,2,4,5,1,8};
        quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
