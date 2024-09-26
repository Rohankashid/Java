package math;

import java.util.Arrays;

public class Stats {
    


    public double mean(int arr[]) {

        double result = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        result = sum / arr.length;

        return result;

    }


        public double median(int arr[],int n){

            Arrays.sort(arr);


            if(n%2!=0){
                return (double)(arr[n/2]);
            }
            
            return (double)(arr[(n-1)/2]+arr[n/2]);
            

        }


        public double average(int arr[]) {

            
            double sum = 0;
    
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
    
            return sum / arr.length;
    
           
    
        }

        public double StandardDeviation(int arr[]){
            double sum=0;
            int length=arr.length;
            for(int i=0;i<arr.length;i++){
                sum+=arr[(int) i];
            }

            double mean=sum/length;

            double StandardDeviation=0.0;

            for(int num=0;num<arr.length;num++){
                StandardDeviation=+Math.pow(num-mean, 2);
            }


            return Math.sqrt(StandardDeviation/length);
        }

    }





