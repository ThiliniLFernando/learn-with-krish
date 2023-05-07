import java.util.Arrays;

public class SelectionSort{
    public static void sort(int[] array){
        int length = array.length;
        for(int i=0; i<length-1; i++){
            for(int j=0; j<length-1-i;j++){
                if(array[j]>array[j+1]){
                    int swapVal = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swapVal;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] data = new int[]{0,83,-4,10,-1};
        System.out.println(Arrays.toString(data));
        BubbleSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}