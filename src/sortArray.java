import java.util.Arrays;

public class sortArray {
    //冒泡排序,比较数组前后的大小，大的往后排，重复过程。时间复杂度O(n^2) n为nums.length
    public int[] maoPao(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            boolean flag = false;
            for(int j = 0; j < nums. length - i - 1;j++){
                if(nums[j] > nums[j + 1]){
                    swap(nums , j + 1 ,j);
                    flag = true;
                }
            }
            if(!flag){
                return nums;
            }
        }
        return nums;
    }


    //选择排序，每一轮选择最小的元素交换到未排定部分的开头。时间复杂度O(n^2)
    public int[] xuanZe(int[] nums){
        for(int i = 0;i < nums.length - 1;i++){
            int min = i;
            for(int j = i + 1;j < nums.length;j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            swap(nums,i,min);
        }
        return nums;
    }


    //插入排序，每次在一个数字插入一个有序的数组里，成为一个长度更长的有序数组。时间复杂度O(n^2)
    public int[] chaRu(int [] nums){
        for(int i = 1;i < nums.length;i++){
            int temp = nums[i]; //选择一个变量暂存该值。
            int j = i;
            while(j > 0 && temp < nums[j-1]){
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = temp;
        }
        return nums;
    }


    public int[]  guiBing(int[] nums){
        
        return nums;
    }
    //数组交换函数
    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args){
        int[] nums = {5, 2, 3, 1};
        sortArray solution = new sortArray();
        int[] res = solution.chaRu(nums);
        System.out.println(Arrays.toString(res));

    }
}
