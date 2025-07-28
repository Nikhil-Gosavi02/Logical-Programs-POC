public class ReplaceCharExample {

    public static void main(String[] args) {
        String original = "Nimhil";

        // for index to replace
        int index = 1;

        // for add new charecter replace of "a"
        char newChar = 'k';

        StringBuilder obj = new StringBuilder(original);
        obj.setCharAt(index, newChar);

        String modi = obj.toString();

        System.out.println("Original :" + original);

        System.out.println("Modified :" + modi);

    }
}