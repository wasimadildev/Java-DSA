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
        //Spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        // Stars
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
       System.out.println(); 
    }
}

public static void inverted_half_pyramid_numbers(int n){
    for(int i = 1; i <=n; i++){
        for(int j = 1; j<=n-i+1; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

public static void floyds_triangle(int n){
    int count = 1;
    for(int i = 1; i<= n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
    }
}

public static void zero_one_trinagle(int n){
    for(int i = 1; i <=n; i++){
        for(int j = 1; j<=i; j++){
            if((i+j)%2==0){
                System.out.print(1 + " ");
            }else{
                System.out.print(0 + " ");
            }
        }
        System.out.println();
    }

}


public static void butterfly_pattern(int n){
    for(int i = 1; i<= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }
        for(int j = i*2; j <= n*2; j++ ){
            System.out.print("  ");

        }

        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }
         System.out.println();
    }

    for(int i = n; i>= 1; i--){
        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }
        for(int j = i*2; j <= n*2; j++ ){
            System.out.print("  ");

        }

        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }
         System.out.println();
    }

 
}


public static void solid_rhombus(int n){
    for(int i = 1; i <= n; i++){
        for(int j = n -i; j >= 1; j--){
            System.out.print("  ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }
        for(int j = n -i; j >= 1; j--){
            System.out.print("* ");
        }

System.out.println();
    }
}

public static void hollow_rhombus(int n){
    for(int i = 1; i<=n; i++){
        for(int j = n -i; j >=1; j--){
            System.out.print("  ");
        }
        for (int j = 1; j <= n; j++) {

            if (i == 1 || i == n || j == 1 || j == n) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    
}


    public static void main(String arg[]) {
        // hollow_rectangle(4, 5);  
        // pyramid_pattern(5);
        // inverted_rotated_half_pyramid(7);
        // inverted_half_pyramid_numbers(5);
        // floyds_triangle(5);
        // zero_one_trinagle(5);
        // butterfly_pattern(6);
        // solid_rhombus(5);
        hollow_rhombus(5);
    }
}
