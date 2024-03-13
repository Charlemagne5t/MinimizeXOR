public class Solution {
    public int minimizeXor(int num1, int num2) {
        int count = Integer.bitCount(num2);
        String bin = Integer.toBinaryString(num1);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) == '1' && count > 0){
                sb.append('1');
                count--;
            }
            else sb.append('0');
        }
        if(count != 0){
            int size = sb.length();
            for(int i = size - 1; i >= 0; i--){
                if(sb.charAt(i) == '0' && count > 0){
                    sb.setCharAt(i, '1');
                    count--;
                }
            }
        }
        while(count != 0){
            sb.insert(0, '1');
            count--;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
