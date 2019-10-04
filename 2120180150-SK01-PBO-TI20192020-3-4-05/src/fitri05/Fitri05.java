package fitri05;
public class Fitri05 {

    public static void main(String[] args) {
        System.out.print("Segitiga 3 dengan Bahasa Java (siku-Siku)" + "\n\n");
        for (int a=10; a>=1; a--){
            for (int b=1; b>=a-10; b--){
                System.out.print(" ");
            }
            for (int c=1; c<=a; c++){
                System.out.print(" 5");
            }
            System.out.println();
        }
    }
}
