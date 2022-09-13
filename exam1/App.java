import java.util.LinkedList;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        // ARRAYS
        // ======================================================
        // 1. Create an array of characters of your SURsurname.
        char[] surname = { 'B', 'A', 'N', 'T', 'O' };

        // 2. Print each character of your SURsurname on each line.
        for (int i = 0; i < surname.length; i++) {
            System.out.println(surname[i]);
        }

        // 3. Print the first character of your SURsurname.
        System.out.println(surname[0]);

        // 4. Print the last character of your SURsurname.
        System.out.println(surname[4]);

        // 5. Print the character of your SURsurname in reverse order.
        for (int i = surname.length - 1; i >= 0; i--) {
            System.out.println(surname[i]);
        }

        // Linked List
        // ======================================================
        // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
        LinkedList<String> studentNumber = new LinkedList<>();

        studentNumber.add("2");
        studentNumber.add("0");
        studentNumber.add("1");
        studentNumber.add("9");
        studentNumber.add("-");
        studentNumber.add("1");
        studentNumber.add("0");
        studentNumber.add("1");
        studentNumber.add("6");
        studentNumber.add("7");
        studentNumber.add("9");
    
        System.out.println(studentNumber);

        // // //2. Add an asterisk (*) to the head/front of the Linked list.
        studentNumber.addFirst("*");

        System.out.println(studentNumber);

        // 3. Add an asterisk (*) to the tail/end of the Linked list.
        studentNumber.addLast("*");
        
        System.out.println(studentNumber);

        // 4. Print the last character of the Linked list.
        System.out.println(studentNumber.get(12));

        // 5. Replace the last character of the Linked list with the exclamation symbol (!).
        studentNumber.set(12, "!");
        System.out.println(studentNumber);

        // 6. Remove the first character of the Linked list
        studentNumber.remove(0);

        // // 7. Print the LinkedList.
        System.out.println(studentNumber);

        // // Stack
        // // ======================================================
        // // 1. Create a Stack of characters of your surname.

        Stack<String> surname = new Stack<>();

        surname.push("B");
        surname.push("A");
        surname.push("N");
        surname.push("T");
        surname.push("O");

        // 2. Print the Stack
        System.out.println(surname);

        // // 3. Add a "INF214" to the stack.
        surname.push(" ");
        surname.push("I");
        surname.push("N");
        surname.push("F");
        surname.push("2");
        surname.push("1");
        surname.push("4");
        
        // 4. Print the Stack
        System.out.println(surname);

        // // 5. Remove "INF214"
        surname.pop();
        surname.pop();
        surname.pop();
        surname.pop();
        surname.pop();
        surname.pop();

        // 6. Add "CCDATRCL-INF214".

        surname.push("C");
        surname.push("C");
        surname.push("D");
        surname.push("A");
        surname.push("T");
        surname.push("R");
        surname.push("C");
        surname.push("L");
        surname.push("-");
        surname.push("I");
        surname.push("N");
        surname.push("F");
        surname.push("2");
        surname.push("1");
        surname.push("4");

        // 6. Print the Stack
        System.out.println(surname);
    }
}
