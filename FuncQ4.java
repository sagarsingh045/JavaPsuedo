/*FUNCTION Q4(int n)
  READ n
  i = 0 , s = 0
   while(n>0)
      r = n%10
      p = 8^i
      s = s + r*p
      i++
      n = n/10
    END WHILE
    return s
END FUNCTION
 */ 
public class FuncQ4 {
    public static int q4(int n) {
        int i = 0, s = 0;
        while (n > 0) {
            int r = n % 10; // Get the last digit
            int p = (int) Math.pow(8, i); // Calculate 8^i
            s += r * p; // Add r*p to s
            i++; // Increment i
            n /= 10; // Remove the last digit from n
        }
        return s; // Return the final result
    }

    public static void main(String[] args) {
        System.out.println(q4(127)); // Example input, you can change it as needed
    }
}