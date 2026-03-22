/* READ number
FUNCTION Q5(number)
   even cnt = 0, num_remainder = nummber
    while(num_remainder > 0)
        digit = num_remainder % 10
    if (digit != 0) and (number % digit == 0) then
        even cnt++

    end if
    num_remainder = num_remainder / 10
    end while
    return even cnt
END FUNCTION    
*/
public class FuncQ5 {
    public static int q5(int number) {
        int evenCnt = 0;
        int numRemainder = number;

        while (numRemainder > 0) {
            int digit = numRemainder % 10; // Get the last digit

            if (digit != 0 && number % digit == 0) { // Check if the digit is a non-zero divisor of the number
                evenCnt++; // Increment the count of even digits
            }

            numRemainder /= 10; // Remove the last digit from numRemainder
        }

        return evenCnt; // Return the count of even digits that are divisors of the number
    }

    public static void main(String[] args) {
        System.out.println(q5(2630)); // Example input, you can change it as needed
    }
}