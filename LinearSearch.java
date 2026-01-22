public class LinearSearch {
    public static int LinearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
             return -1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {23, 4, 1, 56, 3, 78, 90};
        int key = 3;
         int index = LinearSearch(arr, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
