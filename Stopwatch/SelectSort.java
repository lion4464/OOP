package Stopwatch;

public class SelectSort {

    private SelectSort() {
    }

    public static int[] SelSort(int[] list) {
         for (int i = 0; i < list.length; i++) {
             int min = list[i];
             int minIndex = i;

             for (int j = i + 1; j < list.length; j++) {
                 if (min > list[j]) {
                     min = list[j];
                     minIndex = j;
                 }
             }

             if (minIndex != i) {

                 list[minIndex] = list[i];
                 list[i] = min;
             }
         }
    return list;
     }

}
