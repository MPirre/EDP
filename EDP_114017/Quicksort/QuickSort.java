package pt.ua.edp;
public class QuickSort {
    private int partition(int[] A, int p, int r) {
        int x = A[p];
        int i = p - 1;
        int j = r + 1;

        while (true) {
            do {
                j = j - 1;
            } while (A[j] > x);

            do {
                i = i + 1;
            } while (A[i] < x);

            if (i < j) {
                troca(A, i, j);
            } else {
                return j;
            }
        }
    }

    public void quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q);
            quickSort(A, q + 1, r);
        }
    }

    public void troca(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}