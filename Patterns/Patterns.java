public class Patterns {
    public static void hollow_rectangle(int totalRows, int totalColumns) {
        for (int i = 1; i <= totalRows; i++) {

            for (int j = 1; j <= totalColumns; j++) {

                if (i == 1 || i == totalRows || j == 1 || j == totalColumns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
public static void pyramid_pattern(int totalRows){
    for(int i = 1; i <= totalRows; i++){

        for(int j = 1; j < i; j ++){
            System.out.print("* ");
        }
        System.out.println("  ");
    }
}

public static void  inverted_rotated_half_pyramid(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
       System.out.println(); 
    }
    

}
    public static void main(String arg[]) {
        // hollow_rectangle(4, 5); 
        // pyramid_pattern(5);
        // inverted_rotated_half_pyramid(7);
    }
}
