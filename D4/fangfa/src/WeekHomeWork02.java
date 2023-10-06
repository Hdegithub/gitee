public class WeekHomeWork02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
            System.out.println("数组二为：" + arr1[i]);
        }
    }
}
