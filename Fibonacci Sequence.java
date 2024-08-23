import java.util.Scanner;

class one{
    public static void main(String[] args) {
        Scanner Scr = new Scanner(System.in);
        System.out.println("How many iteration?");
        int x = Scr.nextInt();
        if (x == 69) {
            System.out.println("Ohhh Yess");
        }
        long Num0 = 0;
        long Num1 = 1;
        long Num2 = 0;
        System.out.println("");
        for (int i=1; i!=x; i++) {
            try {
                Thread.sleep((69+69+69+69-(6*9*4)));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            if (Num2 < 0) {
                System.out.println(-1 * Num2);
            }
            else {
                System.out.println(Num2);
            }
            Num0 = Num1;
            Num1 = Num2;
            Num2 = Num0 + Num1;
        }
    }
}