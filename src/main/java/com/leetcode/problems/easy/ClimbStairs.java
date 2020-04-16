package com.leetcode.problems.easy;

/**
 * 70. 爬楼梯(Climbing Stairs)
 * [题目]
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * [示例1]
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 *    1.  1 阶 + 1 阶
 *    2.  2 阶
 *
 *  [示例2]
 *  输入： 3
 *  输出： 3
 *  解释： 有三种方法可以爬到楼顶。
 *  1.  1 阶 + 1 阶 + 1 阶
 *  2.  1 阶 + 2 阶
 *  3.  2 阶 + 1 阶
 *
 * Created by zeyuan on 2020/4/16.
 */
public class ClimbStairs {

    /**
     * f(n) = f(n-1)+f(n-2)
     */
    public int climbStairs(int n) {

        if(n<=2){
            return n;
        }
        int nMinusOne = 2; // n-1 次的方法数
        int nMinusTwo = 1; // n-2 次方法数
        int steps = 0;
        for(int i=2;i<n;i++){
            steps = nMinusOne + nMinusTwo;
            nMinusTwo = nMinusOne;
            nMinusOne = steps;
        }
        return steps;
    }
}
