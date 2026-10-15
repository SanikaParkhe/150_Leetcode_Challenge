class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        char temp;
        int right = s.length - 1;

        while(left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;


        }
    }
}