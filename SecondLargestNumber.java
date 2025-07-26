public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 10, 20, 38, 40, 39, 40, 13};

        int largest = 0;
        int secondLarg = 0;

        for (int num : arr) {
            if (num > largest) {
                // updated the second before largest
                secondLarg = largest;
                largest = num;
            } else if (num > secondLarg && num != largest) {
                secondLarg = num;
            }
        }

        if (secondLarg == 0) {
            System.out.println("No second largest element found.");
        }
         else
        {
            System.out.println("The Second largest number is " + secondLarg);
        }
    }
}
