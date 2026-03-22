/* FUNCTION Q6(int n)
    int cnt = 0
    while n > 0 do
        cnt = cnt + (n % 2)
        n = n / 2
    end while
    return cnt
END FUNCTION
 */
public class FuncQ6 {
    public static int q6(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt = cnt + (n % 2);
            n = n / 2;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(q6(42)); // Output: 2
    }
}