package Arrays;

// import java.util.ArrayList;

public class Trapped_Water {
    public static void main(String[] args) {
        // ArrayList<Integer> blocks = new ArrayList<Integer>();

        int[] blocks = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};

        // [0,1,0,2,1,0,1,3,2,1,2,1]
        // blocks.add(0);
        // blocks.add(1);
        // blocks.add(0);
        // blocks.add(2);
        // blocks.add(1);
        // blocks.add(0);
        // blocks.add(1);
        // blocks.add(3);
        // blocks.add(2);
        // blocks.add(1);
        // blocks.add(2);
        // blocks.add(1);

        System.out.println( getTrappedWater( blocks ) );
    }

    public static int getTrappedWater( int[] arr ){

        int[] rightMax = new int[ arr.length ];
        int[] leftMax = new int[ arr.length ];

        rightMax[ arr.length - 1 ] = arr[arr.length - 1];
        leftMax[0] = arr[0];

        for(int i = 1, j = arr.length - 2; i < arr.length;i++,j--){
            if( leftMax[i - 1] > arr[i] ) leftMax[i] = leftMax[i - 1];

            if( rightMax[j + 1] > arr[j] ) rightMax[j] = rightMax[j + 1];
        }

        for(int i: rightMax)
            System.out.print(i +" ");
        for(int i: leftMax)
            System.out.print(i +" ");

        return 0;
    }
}
