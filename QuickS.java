public class QuickS{

    public static void Printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int Qint=partition(arr,si,ei);
        QuickSort(arr,si,Qint-1);
        QuickSort(arr,Qint+1,ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si; j<ei ; j++){
            if(arr[j]<=pivot){
                i++;
                // swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String args[]){
        System.out.println("Hey");
        int arr[]={5,3,8,2,7};
        QuickSort(arr, 0, arr.length-1);
        Printarr(arr);
    }
}
