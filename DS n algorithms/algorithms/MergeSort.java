import java.util.Arrays;

/*
 * 1. devide arrays into subarrays until subarrays.length = 1
 * 2. merge sub arrays by comparing the two subarrays values.
 *  2.1. create copy of sub arrays.
 *  2.2. compare sub arrays values.
 *  2.3. insert lowest value into the main array and increament subarray position by 1.
 *  2.4. create loops for two sub arrays to insert to main array if there is any value remain.
 */
public class MergeSort {

    public static void sort(int[] array, int l, int r){
        if(r<=l){
            return;
        }
        int m = (l+r)/ 2 ;
        sort(array, l, m);
        sort(array, m+1, r);
        merge(array,l,m,r);
    }

    private static void merge(int[] array,int l,int m,int r){
        int n1 = (m-l)+1;
        int n2 = r - m ;
        /*
         * create sub copies of sub arrays
         */
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for(int i = 0; i<n1; i++)
            L[i] = array[l+i];
        for(int j = 0; j<n2; j++)
            R[j] = array[m+1+j];

        /*
         * create index variables to get the current iteration position of sub arrays
         */
        int l_index = 0 ;
        int r_index = 0 ;
        int ar_index = l ;
        while(l_index<n1 && r_index<n2){
            if(L[l_index]<R[r_index]){
                array[ar_index] = L[l_index];
                ++l_index;
            }else{
                array[ar_index] = R[r_index];
                ++r_index;
            }
            ++ar_index;
        }

        while(l_index<n1){
            array[ar_index] = L[l_index];
            ++l_index;
            ++ar_index;
        }

        while(r_index<n2){
            array[ar_index] = R[r_index];
            ++r_index;
            ++ar_index;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{0,83,-4,10,-1,-50,100,5};
        System.out.println(Arrays.toString(data));
        MergeSort.sort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
}
