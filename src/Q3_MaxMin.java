public class Q3_MaxMin {
    public static void main(String[] args){
        int[] arr = {25, 12, 47, 3, 38};
        int max = arr[0];
        int min = arr[0];
        for(int num : arr){
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        System.out.println("Largest number = " + max);
        System.out.println("Smallest number = " + min);
    }
}
