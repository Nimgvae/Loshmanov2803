package HWs.hw2803;
/*
Task 1. Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
Подсказка: можно решить, используя HashMap.
* */

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String s = "leetcode";
        checkCharacter(s);

    }
    public static  void checkCharacter(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else map.put(c, 1);
        }
        String result = "-1";
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() ==1){
                result = "" + entry.getKey();
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.println(result);
    }
}
