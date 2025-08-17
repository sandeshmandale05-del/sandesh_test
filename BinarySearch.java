public class BinarySearch{
    public static int Binary(int arr[],int key){
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int mid=(first +last)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                first=mid+1;
            }
            else if(arr[mid]>key){
                last=mid-1;
            }
        }return -1;
    }
    public static void main(String args[]){
       
        int arr[]={1,2,3,4,5,6,7,8,9};
        int result=Binary(arr,7);
        if(result!= -1){
            System.out.println("Element found at location :"+ result);
        }else{
        System.out.println("Element not found I am sorry bro");
        }
    }
}