package leetCode;

/**
 * 归并排序
 * @author 78289
 */
public class Test {

    public int[] sort(int[] nums) {
        mergerSort(nums, 0, nums.length - 1);
        System.out.print("[");
        for (int i : nums) {
            System.out.print(i + "  ");
        }
        System.out.print("]");
        return nums;
    }

    private void mergerSort(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        if (left < right) {
            mergerSort(nums, left, mid);
            mergerSort(nums, mid + 1, right);
            merger(nums, left, mid, right);
        }
    }

    private void merger(int[] nums, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int lIndex = left;
        int rIndex = mid + 1;
        int index = 0;
        while (lIndex <= mid && rIndex <= right) {
            while (lIndex <= mid && nums[lIndex] < nums[rIndex]) {
                tmp[index++] = nums[lIndex++];
            }
            while (rIndex <= right && nums[lIndex] >= nums[rIndex]) {
                tmp[index++] = nums[rIndex++];
            }
        }
        while (lIndex <= mid) {
            tmp[index++] = nums[lIndex++];
        }
        while (rIndex <= right) {
            tmp[index++] = nums[rIndex++];
        }
        for (int i : tmp) {
            nums[left++] = i;
        }
    }

    public static void main(String[] args) {
        new Test().sort(new int[]{5, 4, 7, 1, 5, 47, 7, 1, 3, 4, 4});
    }

}