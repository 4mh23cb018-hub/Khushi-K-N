public class code18 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,7};
        int i;
        int element=7;
        for(i=1;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("elements are found"+i);
            }
            else{
                System.out.println("element not found");
            }
        }
    }
    
}
