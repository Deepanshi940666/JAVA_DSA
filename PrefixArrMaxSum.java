
public class PrefixArrMaxSum {

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        int[] pre = new int[arr.length];
        int sum = 0;
        int max = 0;
        int ans;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum += arr[j];

                pre[i] = sum;
            }
            System.out.println(pre[i]);
            sum = 0;

            // System.out.println(pre[i]);
        }
        int len = pre.length;

        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= i; j--) {

                if (i == 0) {
                    ans = pre[j];
                } else {
                    ans = pre[j] - pre[i - 1];
                }

                if (ans > max) {
                    max = ans;
                }
            }

        }
        System.out.println(max);
    }
}
