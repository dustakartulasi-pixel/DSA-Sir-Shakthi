import java.util.Scanner;

public class Daily_Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yesturday sales: ");
        int yesterday = sc.nextInt();
        System.out.print("Enter today sales: ");
        int today = sc.nextInt();
        int diff = yesterday - today;
        System.out.println("Difference: " + diff);
        if (today > yesterday) {
            System.out.println("status: Incresed");
        } else if (yesterday == today) {
            System.out.println("status: Unchanged");
        } else {
            System.out.println("status: Decreased");
        }
        // Write your code here

        sc.close();
    }
}