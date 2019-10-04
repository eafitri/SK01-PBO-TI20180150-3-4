package fitri02;
public class Fitri02 {

    public static void main(String[] args) {
        int x = 9;
        System.out.print("Segitiga 2 dengan Bahasa Java (siku-Siku)" + "\n\n");
        for (int i=1; i<=x; i++){
            for (int j=x-1; j>=i; j--){
                System.out.print(" ");
            }
            for (int d=i; d>0; d--){
                System.out.print("2");
            }
            System.out.println();
        }
    }
    
}
