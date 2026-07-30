import java.util.Arrays;

public class quicksortproblem1 {
    public static int partications(int arr[],int low,int high){
        int pe = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<=pe){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void Quick(int arr[],int low,int high){
        if(low<high){
            int sort = partications(arr,low,high);

            Quick(arr, low ,sort-1);
            Quick(arr,sort+1,high);
        }
    }
    public static void main (String[] args){
        int arr[] = {0,0,2,3,4,4,2,0,0,0};

        Quick(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}
