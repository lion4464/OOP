package Stopwatch;
import java.util.Random;

public class Hissobla {
    
    public static void main(String[] args) {
//======start to time===================
        Stopwatch qara=new Stopwatch();
//        create random numbers
        Random generate=new Random();

        //       create array 100'000 items
        int[] arr=new int[100000];

        //filled random values

        for (int i=0;i<arr.length;i++){
                arr[i]=generate.nextInt(100000);
            }
        SelectSort.SelSort(arr);
        ToPrint(arr);
        qara.stop();
        qara.getElapsedTime();
    }

    //==============Print method====================
    public static void ToPrint(int[] r){
        for (int i=0;i<r.length;i++) {
                System.out.print(r[i]+" ");
        }
    }
}
