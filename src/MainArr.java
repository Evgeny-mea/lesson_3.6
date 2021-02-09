import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class MainArr {

    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5, 6, 7, 4, 1, 7};
        int[] b = {1, 1, 1, 4, 4, 4, 1, 4, 1};
        int[] c = {3, 2, 1, 9, 1, 7, 7};

        System.out.println(Arrays.toString(Arr(a)));
        System.out.println(Arr2(c));
        System.out.println(Arr2(b));

    }

    public static int[] Arr(int[] arr) {
        int x = 0;
        int [] newArr = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                x = arr[i];
                newArr = new int[arr.length - i - 1];
                for (int j = i + 1, k = 0; j < arr.length; j++, k++) {
                    if (arr[j] == 4) continue;
                    newArr[k] = arr[j];
                }
            }
        }
        try{
            x = 1 / x;
        } catch(ArithmeticException e){
            throw new RuntimeException();
        }
        return newArr;
    }

    public static boolean Arr2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1 && arr[i] != 4) return false;
        }
        return true;
    }

}

