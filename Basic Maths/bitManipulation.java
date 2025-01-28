class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        int bitmass=(1<<(i-1));
        if((num&bitmass)==0)
            System.out.print(0+" "+(num|bitmass)+" "+num);
        else
            System.out.print(1+" "+num+" "+(num^bitmass));
    }
}
