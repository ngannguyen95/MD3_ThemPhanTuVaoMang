import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 5, 84, 53, 15, 4, 6};
        System.out.println("Mảng cũ: " + Arrays.toString(arr));
        System.out.println("Nhập số cần chèn: ");
        int inputNumber = scanner.nextInt();
        System.out.println("Nhập vào vị trí cần chèn: ");
        int index = scanner.nextInt();
        int[] newArr = new int[arr.length +1];

        // kiểm tra index có trong mảng hay không và hoán đổi index
        if (index <= -1 && index >= arr.length - 1) {
            System.out.println("Không chèn được vào phần tử mảng");
        } else {
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = arr[i];
                }else if (i == index){
                    newArr[i] = inputNumber;
                }else newArr[i] = arr[i-1];
            }

            System.out.println("Mảng mới : " + Arrays.toString(newArr));
        }

    }
}