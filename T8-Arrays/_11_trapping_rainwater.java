public class _11_trapping_rainwater {
    public static int trappedRainwater(int array[]) {
        int n = array.length;
        
        int LeftMax[] = new int[n];
        LeftMax[0] = array[0];
        int i;
        for(i = 1; i < n; i++) {
            LeftMax[i] = Math.max(array[i] , LeftMax[i - 1]);
        }

        int RightMax[] = new int[n];
        RightMax[n - 1] = array[n - 1];
        for(i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(array[i] , RightMax[i + 1]);
        }

        int trapped_Rainwater = 0;
        for(i = 0; i < n; i++) {
            trapped_Rainwater += waterLevel - array[i];
        }

        return trapped_Rainwater;
    }
    public static void main(String[] args) {
        int array[] = {4, 2, 0, 3, 2, 5};
        System.out.println(trappedRainwater(array));
    }
}