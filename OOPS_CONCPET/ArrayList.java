import java.util.Scanner;

public class ArrayList {
    public static void even(ArrayList<Integer> n) {
        System.out.println("List of Even Numbers:");
        System.out.println(n);
    }

    public static void mul(ArrayList<Integer> n) {
        System.out.println("List of Even Numbers multiplied by 2:");
        for (int i = 0; i < n.size(); i++) {
            n.set(i, n.get(i) * 2);
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>(N);
        for (int i = 2; i <= N; i += 2) {
            al.add(i);
        }
        even(al);
        mul(al);
    }
}