public class task4 {
    public static void main(String[] args) {
    int [] arr = CreateArray(5);
    ShowArr(arr);
    System.out.println("");
    ShowArr(arr);
    ArrayShiftLeft(3,arr);
    }

    public static int[] CreateArray(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            int r = (int) (Math.random() * 6);
            arr[i] = r;
        }
        return arr;
    }
    public static void ShowArr(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] ArrayShiftLeft(int num,int[]arr) {
        int temp = arr[num];
        for (int i = num; i == num - 1; i++) {
            arr[i]=
            if (i == arr.length){
                i = 0;
                System.out.println(arr[i]);
            }
        }
    return arr;
    }
}
