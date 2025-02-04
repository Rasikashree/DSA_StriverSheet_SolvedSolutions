class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){
                list.add(i);
                while(N%i==0){
                    N=N/i;
                }
            }
        }
        if(N!=1)
        list.add(N);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
