import java.util.*;
public class nextpermutation {
    static void swap(int i,int j,int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void rev(int i,int j,int arr[]){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;    
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n = arr.length;
        /* TO solve this problem need to take 3 steps 
    1.take the split element that is the element that is lesser than i+1 arr[i] < arr[i+1] and take it as flag
    2.swap the element that is just greater than the flag element
    3.reverse the elements that is after the flag elements that is flag+1 -> n-1
    4.(optional) this is when there is no element s lesser than the i+1 element in the step 1 then it is the 
    last iteration so reverse the array and return it*/
        ArrayList<Integer> ar = new ArrayList<>();
        int flag = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                flag = i;
                break;
            }
        }                // 0 1 2 3 4  5  6  7  8  9  10  11  12
        if(flag != -1){ // 62 92 96 43 28 37 92 5 3 54 93 83 22
            int sin = -1;
            for(int i=n-1;i>=flag+1;i--){
                if(arr[i] > arr[flag] && arr[i] != arr[flag]){
                    sin = i;
                    break;
                }
            }
            System.out.println(arr[flag]);
            swap(sin, flag, arr);
            for(int x=0;x<n;x++){
                System.out.print(arr[x]+" ");
            }
            int i = flag + 1;
            int j = n-1;
            rev(i,j,arr);
        }else{
            rev(0,n-1,arr);
        }
        for(int x=0;x<n;x++){
            ar.add(arr[x]);
        }
        System.out.println(ar);
    }
}
