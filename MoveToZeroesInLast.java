public class MoveToZeroesInLast {
    
    public static void main(String[] args) {
        
        int[] arr= { 1, 2, 0, 7,8,0,0,9,3,5};

        //this for non-zeroes 
        int index= 0;

        // Non zeroes elements convert into starting of array

        for(int i =0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[index] = arr[i];
                index++;
            }
        }

        // insert zeroes in remaining space

        while(index < arr.length)
        {
            arr[index] = 0;
            index++;
        }

        System.out.println("Moved zeroes in last of array " + arr);

    }
}
