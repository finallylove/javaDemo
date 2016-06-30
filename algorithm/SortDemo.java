import java.util.Arrays;
import java.util.Random;

/**
 * 排序算法
 */
public class SortDemo {
    private static int[] ARR = new int[20];

    private static int[] randomArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }


    public static void main(String[] args) {
        randomArr(ARR);

        printArr();

        //冒泡排序
//        System.out.println(bubble(ARR));
        //选择排序
//        System.out.println(selection(ARR));
        //插入排序
//        System.out.println(insertion(ARR));
        //快速排序
        quick_sort(ARR, 0, ARR.length - 1);
        Arrays.sort(ARR);

        printArr();
    }

    private static void printArr() {
        for (int i : ARR)
            System.out.print(i + ",");
        System.out.println();
    }

    private static int bubble(int[] arr) {
        int num = 0;
        int tmp;
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    tmp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = tmp;
                    swapped = true;
                }
                num++;
            }
            n--;
            System.out.print("n=" + n + ",");
        } while (swapped);
        System.out.println();
        return num;
    }

    private static int selection(int[] arr) {
        int num = 0;
        int tag;
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            tag = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[tag] > arr[j]) {
                    tag = j;
                }
                num++;
            }
            if (tag != i) {
                tmp = arr[i];
                arr[i] = arr[tag];
                arr[tag] = tmp;
            }
        }
        return num;
    }

    private static int insertion(int[] arr) {
        int num = 0;
        int tag;
        for (int i = 1; i < arr.length; i++) {
            tag = arr[i];
            for (int j = i; j > 0; j--) {
                if (tag < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                } else {
                    arr[j] = tag;
                    break;
                }
                num++;
            }


        }
        return num;
    }

    private static void quick_sort(int s[], int l, int r) {
        int i, j, x;
        if (l < r) {
            i = l;
            j = r;
            x = s[l];

            while (i < j) {
                while (j > i && x <= s[j])
                    j--;

                if (j > i)
                    s[i++] = s[j];

                while (j > i && x > s[i])
                    i++;

                if (j > i)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1);
            quick_sort(s, i + 1, r);
        }
    }

}
