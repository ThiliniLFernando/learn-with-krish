import java.util.Arrays;

public class InsertionSort{

    public static void sort(int[] array){
        int length = array.length;
        for(int i = 1; i<length; i++){
            int key = array[i];
            int j = i - 1;
            while(j>=0 && key<array[j]){
                array[j+1]=array[j];
                --j;
            }
            array[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] data = new int[]{0,83,-4,10,-1,-50,100,5};
        System.out.println(Arrays.toString(data));
        InsertionSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}