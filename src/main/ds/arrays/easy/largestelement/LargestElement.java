package ds.arrays.easy.largestelement;

public class LargestElement {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 2, 8, 10};
        System.out.println(LargestElementArray(nums)); // Output: 10
    }
    public static int LargestElementArray(int[] num){
        int max = num[0];
        for(int i=1; i<num.length; i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }
}
