class Main{
    public static void main(String[] args){
        int[] arr = {10,20,30,40};

        System.out.println("Printing all subarrays");


        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int it = i; it<= j; it++){
                    System.out.print(arr[it]+" ");
                }
                System.out.println();
            }

        }
    }
}
