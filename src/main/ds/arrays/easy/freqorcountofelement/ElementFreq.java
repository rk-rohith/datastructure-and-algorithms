package ds.arrays.easy.freqorcountofelement;

public class ElementFreq {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 2, 8, 10};
        int element = 2;
        System.out.println(elementFreq(arr, element)); // Output: 2
    }

    private static int elementFreq(int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        return count;
    }
}
