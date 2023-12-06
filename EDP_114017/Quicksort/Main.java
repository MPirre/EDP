package pt.ua.edp;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        int[] numeros = {9, 4, 1, 1, 6, 2, 3};
        System.out.println(String.format("Array inicial: %s", Arrays.toString(numeros)));

        QuickSort qs = new QuickSort();
        qs.quickSort(numeros, 0, numeros.length - 1);
        System.out.println(String.format("Array final: %s", Arrays.toString(numeros)));
    }
}