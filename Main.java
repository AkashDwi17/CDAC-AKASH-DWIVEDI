import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose option:");
        System.out.println("1. Calculate SI");
        System.out.println("2. Calculate Principal (P)");
        System.out.println("3. Calculate Rate (R)");
        System.out.println("4. Calculate Time (T)");

        int choice = sc.nextInt();

        double p, r, t, si;

        switch (choice) {
            case 1: // SI
                System.out.print("Enter Principal (P): ");
                p = sc.nextDouble();
                System.out.print("Enter Rate (R): ");
                r = sc.nextDouble();
                System.out.print("Enter Time (T): ");
                t = sc.nextDouble();

                si = (p * r * t) / 100;
                System.out.println("Simple Interest = " + si);
                break;

            case 2: // P
                System.out.print("Enter SI: ");
                si = sc.nextDouble();
                System.out.print("Enter Rate (R): ");
                r = sc.nextDouble();
                System.out.print("Enter Time (T): ");
                t = sc.nextDouble();

                p = (si * 100) / (r * t);
                System.out.println("Principal (P) = " + p);
                break;

            case 3: // R
                System.out.print("Enter SI: ");
                si = sc.nextDouble();
                System.out.print("Enter Principal (P): ");
                p = sc.nextDouble();
                System.out.print("Enter Time (T): ");
                t = sc.nextDouble();

                r = (si * 100) / (p * t);
                System.out.println("Rate (R) = " + r);
                break;

            case 4: // T
                System.out.print("Enter SI: ");
                si = sc.nextDouble();
                System.out.print("Enter Principal (P): ");
                p = sc.nextDouble();
                System.out.print("Enter Rate (R): ");
                r = sc.nextDouble();

                t = (si * 100) / (p * r);
                System.out.println("Time (T) = " + t);
                break;

            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
