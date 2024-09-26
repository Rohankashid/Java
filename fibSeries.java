class fibSeries{
    public static void main(String[] args) {
        int n=20;
        long[] fib=new long[n];

        fib[0]=1;
        fib[1]=1;

        for(int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }

        System.out.println("the first 20 numbers in the series are :");
        for (int i = 0; i < n; i++) {

            System.out.println(fib[i]+" ");
            
        }

        long sum=0;
        for (int i = 0; i < n; i++) {
            sum+=fib[i];
            
        }

        double average =(double)sum/n;

        System.out.println("the average of the series is :"+average);
 

    }
}