

class Solution {
    
    static void sieve() {}

    static List<Integer> findPrimeFactors(int N) {

        List<Integer> l = new ArrayList();
        int[] arr =new int[N+1];
        for(int i=2; i*i<=N; i++){
            while(N%i==0){
                l.add(i);
                N=N/i;
            }
        }
        if(N!=1){
            l.add(N);
        }
        return l;
        
    }
}
