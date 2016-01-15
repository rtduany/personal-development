/* You are given an integer N. Your job is to figure out how many substrings inside of N divide evenly with N.
Confused? I'll break it down for you.
Let's say that you are given the integer '877692'.
8 does not evenly divide with 877692. 877692/8 = 109711 with 4 remainder.
7 does not evenly divide with 877692. 877692/7 = 125384 with 4 remainder.
7 does not evenly divide with 877692. 877692/7 = 125384 with 4 remainder.
We aren't going to stop there though. We need to check ALL of the substrings inside of 877692.
87 does not evenly divide with 877692. 877692/87 = 10088 with 36 remainder.
77 does not evenly divide with 877692. 877692/77 = 11398 with 46 remainder.
Rules:
-If an integer is 0, then it does NOT divide evenly into anything.
-Even though N can divide evenly with itself, we do not count it towards the end number.
Input:
A non negative integer.
Output:
The number of times you found an integer that was evenly divisible with N.
*/
import java.util.ArrayList;
import java.util.Arrays;
public class DivisibleInts{

}
