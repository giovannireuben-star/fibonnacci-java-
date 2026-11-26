public class First500Primes {
    public static void main(String[] args) {
        int count = 0;      // Tracks how many primes have been found
        int number = 2;     // The first prime number to check

        System.out.println("The first 500 prime numbers are:");

        while (count < 500) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;

                // Print a new line every 10 numbers for clean formatting
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Only check divisors up to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
