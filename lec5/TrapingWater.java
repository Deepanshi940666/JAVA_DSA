
public class TrapingWater {

    public static int GreaterLeft(int a[], int max, int index) {
        for (int i = index; i >= 0; i--) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static int GreaterRight(int a[], int max, int index) {
        for (int i = index; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static int Min(int l, int r) {
        int min = Math.min(l, r);
        return min;
    }

    public static void TW(int a[]) {
        int left;
        int right;
        int WL;
        int tp;
        int str = 0;
        for (int i = 0; i < a.length; i++) {
            // int str=0;
            if (i == 0 || i == a.length - 1) {
                str += 0;
            }
            // else{
            left = GreaterLeft(a, a[i], i);
            right = GreaterRight(a, a[i], i);
            WL = Min(left, right);
            tp = WL - a[i];
            str += tp;
            // }

        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        TW(arr);
    }

}
