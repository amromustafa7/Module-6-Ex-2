public class App {
    // Method to compute the sum
    public static int sumDigits(long n) {
        int sum = 0;
        
        // Make the number positive
        n = Math.abs(n);
        
        // Loop 
        while (n > 0) {
            sum += n % 10;  
            n /= 10;         
        }
        
        return sum;  
    }

    // Test the sumDigits
    public static void main(String[] args) {
        // Test cases to check the sum of digits
        System.out.println("Sum of digits in 234: " + sumDigits(234));  
        System.out.println("Sum of digits in 567: " + sumDigits(567));  
        System.out.println("Sum of digits in 890: " + sumDigits(890));    
    }
}
