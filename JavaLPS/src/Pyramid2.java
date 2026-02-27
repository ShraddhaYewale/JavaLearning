public class Pyramid2 {
    public static void main(String[]args){
        for (int i = 1; i <= 5; i++) {           // Rows
            for (int j = 5; j > i; j--) {        // Spaces (decreases each row)
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {       // Stars (plus a space for shape)
                System.out.print("* ");
            }
            System.out.println();                // Next line
        }
    }
}

