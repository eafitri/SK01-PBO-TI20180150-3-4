package fitri04;
public class Fitri04 {

    public static void main(String[] args) {
        System.out.print("Segitiga 4 dengan Bahasa Java (sama Kaki)" + "\n\n");
        for (int a=1; a<=10; a++){
            for (int b=1; b<=10-a; b++){
                System.out.print(" ");
            }
            for (int c=1; c<=a; c++){
                System.out.print("4 ");
            }
            System.out.println();
        }
    }
}
