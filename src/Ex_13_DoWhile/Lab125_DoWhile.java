package Ex_13_DoWhile;

public class Lab125_DoWhile {
    public static void main(String[] args) {
        int a = 1;
        // executes body atleast 1 time
        do {
            System.out.println("This is a Body, Which will execute 1 time");
            System.out.println(a);
            a++;

        } while (a < 10);
    }
}
