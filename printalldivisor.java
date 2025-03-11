class Solution {
    public static int sumOfDivisors(int n) {
        // code here
        int sum=0;
        int funcsum=0;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               if(i%j==0){
                   funcsum+=j;
               }
               sum+=funcsum;
               funcsum=0;
           }
        }
        return sum;
    }
}

