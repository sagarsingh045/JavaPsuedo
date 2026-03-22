/*FUNCTION VALUEUPDATE(x: INTEGER , y: INTEGER , z: INTEGER)
for (each c from 4 to 8)
    x = x + c
    y = y * 2
    z = z - 1
END FOR
y = y + 10
x = x * 2
z = z * 3
PRINT x, y, z
END FUNCTION
VALUEUPDATE(1, 2, 3)
*/  
// code in java
public class FunctionValueupdate {            
    public static void valueUpdate(int x, int y, int z) {
        for (int c = 4; c <= 8; c++) {
            x = x + c;
            y = y * 2;
            z = z - 1;
        }
        y = y + 10;
        x = x * 2;
        z = z * 3;
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

    public static void main(String[] args) {
        valueUpdate(1, 2, 3); // Output: x: 90, y: 34, z: -6
    }
}