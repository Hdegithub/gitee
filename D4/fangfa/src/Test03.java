public class Test03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int[] arr1 = {10, 20, 30};
    }

    public static void Arr(int[] arr, int[] arr1) {
        for (int i = 0; i < arr.length; i++) {
            if (arr == null || arr1 == null) ;
            else if (arr.length == arr1.length) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] != arr1[i]) ;

                }
            }
        }
    }
}