import java.io.PrintStream;

// отображение одиночных битов переменной с типом данных byte
public class ByteBits {

    private static PrintStream out = System.out;

    public static void main(String[] args) {
        int t;
        byte val;

        val = 123;
        for (t = 128; t > 0; t = t / 2) {
            if ((val & t) != 0) {
                out.print("1");
            } else {
                out.print("0");
            }
        } // for
    } // main(String[]) method

} // ByteBits class
