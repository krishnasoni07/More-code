package Z;

public class SMax {
    public static void main(String args[]){

        int a[] = new int[]{5,6,7,1,5};

        int max = Integer.MIN_VALUE;
        int smax = max;

        for(int i = 0; i < a.length;i++)
            if( a[i] > max ){
                smax = max;
                max = a[i];
            }

        System.out.println("smax : " + smax + "\nMax : " + max);
    }
}
