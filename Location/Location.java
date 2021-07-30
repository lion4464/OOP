package Location;

public class Location {
    public static double maxVal;
    public static int row,column;
    public static void main(String[] args) {
        double[][] m={
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
          };
        Location location = Location.locateLargest(m);

        System.out.println("The location of the largest element is "
                + location.maxVal + " at (" + location.row + ", " + location.column + ")");
    }
    public static Location locateLargest(double[][] list) {
        Location l1=new Location();
                double max = list[0][0];
                int maxIndexI = 0;
                int maxIndexJ = 0;
                for (int k = 0; k < list.length; k++) {
                    for (int l =0; l < list[k].length; l++) {
                        if (max < list[k][l]) {
                            System.out.println("k,l = " + k+","+l+"="+list[k][l]);
                            l1.row =maxIndexI= k;
                            l1.column=maxIndexJ = l;
                            l1.maxVal =max=list[k][l];
                        }
                    }


            }
        return l1;
    }
}