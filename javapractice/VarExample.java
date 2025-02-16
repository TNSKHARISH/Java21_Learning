package javapractice;

public class VarExample {
    public static void main(String[] args){
        /*
        * Var Key Word Example .
        * */
        // Using var to declare variables
        var name = "NSK Harish Tiwari"; // Inferred type: String
        var age = 25;          // Inferred type: int
        var isEmployed = true; // Inferred type: boolean

        // Using var with an array
        var salary = new int[]{100000, 200000, 30000, 40000, 500000}; // Inferred type: int[]

        // Printing the variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employed: " + isEmployed);

        System.out.print("Salary: ");
        for (var sal : salary) {
            System.out.print(sal + " ");
        }
    }
}
