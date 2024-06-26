package homework_3;

import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[] { 5, 1, 6, 2, 3, 4 };
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}

class MergeSort {
    public static int[] mergeSort(int[] a) {
        int[] tmp;
        int[] currentSrc = a;
        int[] currentDest = new int[a.length];

        int size = 1;
        while (size < a.length) {
            for (int i = 0; i < a.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;
        }
        return currentSrc;
    }

    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest,
            int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        if (src1Start + size > src1.length) {
            for (int i = src1Start; i < src1End; i++) {
                dest[i] = src1[i];
            }
            return;
        }

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }
}

// Эталонное решение:
// import java.util.Arrays;

// class MergeSort {
// public static int[] mergeSort(int[] a) {
// int n = a.length;
// if (n < 2) {
// return a;
// }
// int mid = n / 2;
// int[] l = new int[mid];
// int[] r = new int[n - mid];

// for (int i = 0; i < mid; i++) {
// l[i] = a[i];
// }
// for (int i = mid; i < n; i++) {
// r[i - mid] = a[i];
// }
// l = mergeSort(l);
// r = mergeSort(r);

// return merge(l, r);
// }

// public static int[] merge(int[] l, int[] r) {

// int left = l.length;
// int right = r.length;
// int[] a = new int[left + right];
// int i = 0, j = 0, k = 0;

// while (i < left && j < right) {
// if (l[i] <= r[j]) {
// a[k++] = l[i++];
// }
// else {
// a[k++] = r[j++];
// }
// }
// while (i < left) {
// a[k++] = l[i++];
// }
// while (j < right) {
// a[k++] = r[j++];
// }

// return a;
// }
// }

// public class Printer{
// public static void main(String[] args) {
// int[] a;

// if (args.length == 0) {
// a = new int[]{5, 1, 6, 2, 3, 4};
// } else {
// a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
// }

// MergeSort answer = new MergeSort();
// String itresume_res = Arrays.toString(answer.mergeSort(a));
// System.out.println(itresume_res);
// }
// }
