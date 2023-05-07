import java.util.Arrays;

public class SelectionSort{
    public static void sort(int[] array){
        int length = array.length;
        for(int i=0; i<length-1; i++){
            int minimumIndx = i;
            for(int j=i+1; j<length;j++){
                if(array[j]<array[minimumIndx]){
                    minimumIndx = j;
                }
            }
            int first = array[i];
            array[i] = array[minimumIndx];
            array[minimumIndx] = first;
        }
    }
    public static void main(String[] args) {
        int[] data = new int[]{0,83,-4,10,-1};
        System.out.println(Arrays.toString(data));
        SelectionSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}