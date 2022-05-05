/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        char param[] = s.toCharArray();
        int res = 0;
        for(int i=0; i<param.length; i++){
            switch (param[i]){
                case 'I':
                    if((i<param.length-1) && (param[i+1] == 'V' || param[i+1] == 'X')) res-=1;
                    else res+=1;
                    break;
                case 'V':
                    res+=5;
                    break;
                case 'X':
                    if((i<param.length-1) && (param[i+1] == 'L' || param[i+1] == 'C')) res-=10;
                    else res+=10;
                    break;
                case 'L':
                    res+=50;
                    break;
                case 'C':
                    if((i<param.length-1) && (param[i+1] == 'D' || param[i+1] == 'M')) res-=100;
                    else res+=100;
                    break;
                case 'D':
                    res+=500;
                    break;
                case 'M':
                    res+=1000;
                    break;
            }
        }
        return res;
    }
}
// @lc code=end

