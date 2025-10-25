package h2;

public class H2_main {
    public static void main(String[] args) {
       int i = 5;
       int j = 10;
       int k = 20;
       int min = 0;
       int max = 0;
       if (i < k) {
        if (i < j) {
            min = i;
        } else { 
            min = j;
        }
       }
       else if (j < k) {
        min = j;
       } else {
        min = k;
       }


       if (i > k) {
        if (i > j) {
            max = i;
        } else {
            max = j;
        }
       } if (k > j) {
        max = k;
        } else {
            max = j; 
       }

    System.out.println("min "+ min);
    System.out.println("max: " + max);
    }

    
}

