public class RotateArray {

    public static void main(String[] args) 
    {
        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 2; // number of rotations
        int n = arr.length;

        // Handle if d > n
        d = d % n;

        // Step 1: Create temp array to store first d elements
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift the remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Step 3: Copy the d elements back to the end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }

        // Print result
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
