class Solution {
    public int minimizeXor(int num1, int num2) {
        int n2 = Integer.bitCount(num2);

        int res = 0;
        for(int i = 31; i >=0; i--) {
            if((num1 & (1 << i)) != 0){
                res |= 1 << i;
                n2--;
                if(n2 == 0) {
                    return res;
                }
            }
        }
        for(int i = 0; i < 32; i++) {
            if((num1 & (1 << i)) == 0){
                res |= 1 << i;
                n2--;
                if(n2 == 0) {
                    return res;
                }

            }
        }

        return res;
    }
}