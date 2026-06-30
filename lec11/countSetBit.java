public class countSetBit {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        while (n > 0) {
            int LSB = n & 1;

            if (LSB != 0) {
                count++;
            }

            n = n >> 1;   //  Shift every time
        }

        System.out.println(count);
    }
}