

// public class ReverseString
// {
//     public static void main(String[] args) {
        
//         String str = "nikhil";
//         String reverse = " ";


//         for(int i = str.length() - 1; i >=0; i--)
//         {
//             reverse += str.charAt(i);
//         }

//         System.out.println(reverse);
//     }
// }

// // another

public class ReverseString
{
    public static void main(String[] args) {
        
        String str = "Manas";

        StringBuffer sb = new StringBuffer(str);

        String reverse = sb.reverse().toString();

        System.out.println(reverse);
        
    }
}