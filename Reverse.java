import java.util.Scanner;

class Reverse {
    char arr[];
    int n, i;

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of letters");
        n = scan.nextInt();
        scan.nextLine();  // Consume the newline character left by nextInt()
        System.out.println("Enter the letters in array ");
        arr = new char[n];
        for (i = 0; i < n; i++) {
            arr[i] = scan.next().charAt(0);
        }
    }

    void reverse() {
        System.out.println("Reversed sequence of the letters");
        for (i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Reverse robj = new Reverse();
        robj.input();
        robj.reverse();
    }
}
