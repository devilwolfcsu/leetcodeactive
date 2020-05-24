package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * MaximalSquare 测试
 * Created by zeyuan on 2020/5/24.
 */
public class MaximalSquareTest {

    @Test
    public void testMaximalSquare(){

        MaximalSquare maximalSquare = new MaximalSquare();
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        Assert.assertEquals(maximalSquare.maximalSquare(matrix),4);
    }

    @Test
    public void testMaximalSquareForSpe(){
        //[['0','0','0','0','0'],['1','0','0','0','0'],['0','0','0','0','0'],['0','0','0','0','0']]

        MaximalSquare maximalSquare = new MaximalSquare();
        char[][] matrix = {
                {'0','0','0','0','0'},
                {'1','0','0','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'}
        };
        Assert.assertEquals(maximalSquare.maximalSquare(matrix),1);
    }

    @Test
    public void testMaximalSquareForAll(){
        //[['1','1','1','1'],['1','1','1','1'],['1','1','1','1']]

        MaximalSquare maximalSquare = new MaximalSquare();
        char[][] matrix = {
                {'1','1','1','1'},
                {'1','1','1','1'},
                {'1','1','1','1'},
        };
        Assert.assertEquals(maximalSquare.maximalSquare(matrix),9);
    }

    @Test
    public void testMaximalSquareForBig(){


        MaximalSquare maximalSquare = new MaximalSquare();
        char[][] matrix = {
                {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','0','0','1','1','1','1','1','1','1','1','0','0','1','1','1','0','1','1','1','1','1','1','1','1'},
                {'1','1','1','1','0','1','1','0','1','1','1','1','1','1','1','1','1','0','1','1','0','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1'},
                {'0','1','1','1','1','0','1','0','1','1','1','1','1','1','0','1','1','0','1','1','0','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},
                {'0','1','0','1','1','0','1','0','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','0','1','0','1','1','0','1','1','1','1','1','1'},
                {'1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','0','1','1','0','0','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},
                {'1','1','1','1','1','1','1','1','1','0','1','1','0','1','0','1','1','1','1','1','1','1','1','1','1','1','0','1','0','1','1','1','1','1','1','0','1','1','1','1'},
                {'0','1','1','0','1','1','0','1','0','1','1','1','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','0','1','0','1'},
                {'0','1','1','1','1','1','1','1','1','1','1','1','1','1','0','0','1','1','1','1','1','1','1','0','0','1','1','0','0','1','1','0','1','1','0','1','0','1','0','1'},
                {'1','1','1','1','0','1','1','1','1','0','1','1','1','1','1','1','1','1','1','0','1','1','0','1','1','0','1','1','1','1','0','1','0','1','1','0','1','0','1','1'},
                {'1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','0','1','1','0','1','1','0','1','1','1','0','1','1','1','1','0','1','1','1','1'},
                {'1','1','1','0','1','1','0','0','1','1','1','1','1','1','1','1','1','1','1','1','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},
                {'1','0','1','1','1','1','1','1','1','0','1','1','1','1','0','1','1','1','1','0','0','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},
                {'0','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','0','1','1','1','0','1','1','1','1','1','0','1','1','1','1','1'},
                {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','0','1','1'},
                {'1','1','1','1','1','0','0','1','1','1','1','1','1','1','1','0','1','0','1','1','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1'},
                {'1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1'},
                {'1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','0','0','1','1','1','1','1','1','0','0','1','1','1','1','1'},
                {'1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','0','1','1','1'},
                {'1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','0','1','1','1','1','1','0','0','1','0','1','1','1','1','1','0','1','1','1','1','1','1'},
                {'1','1','1','1','1','1','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1'},
                {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','0','1','1','1','1','1','0','1','1','1','1','1','0','1','1','0','1','1'},
                {'1','1','0','0','0','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1'},
                {'1','1','1','1','1','0','1','0','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','0','0','1','0','1','1','1','0','0','1','1','1','1','1','1','1','1'},
                {'1','1','1','0','0','1','0','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','0','1','1','1','1','0','1','1','1','1','0','1','1','1','1','1','0','1'},
                {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','0','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1'},
                {'1','1','1','1','1','1','1','0','1','1','1','1','1','1','0','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1'},
                {'1','1','1','0','0','1','1','1','1','1','1','1','1','1','1','0','1','1','1','0','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','0','1','1','1'},
                {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','0','1','1','1','1','1','1','0','1','0','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1'},
                {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','0','0','1','1','1','1','1','1','1','1','1','0','1','1','1','0','1'},
                {'1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','0','0','1','1','1','0','1','1','0','1','1'},
                {'1','1','1','1','0','1','1','0','1','1','1','1','1','1','0','1','1','0','1','1','0','1','1','1','1','1','1','0','1','1','1','1','1','1','1','0','1','1','1','1'},
                {'1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},
                {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},
                {'1','1','0','0','0','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','0','1','1'},
                {'1','1','1','1','1','0','1','1','1','1','1','1','1','1','0','1','1','1','1','0','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},
                {'0','1','1','1','1','1','1','1','1','1','1','1','0','0','1','1','1','1','1','1','1','1','1','1','0','1','0','1','0','1','1','0','1','1','1','1','1','1','1','1'},
                {'1','0','1','1','0','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','0','0','1','1'},
                {'1','0','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','0','1','1','1','1','1'},
                {'0','1','1','1','1','0','1','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','1'},
                {'0','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','0','1','1','1','0','1','1','1','1','0','1','1','1','0','1','1','1','1','1','1','1','1','1','1'},
                {'0','1','1','1','1','1','1','1','1','1','1','1','0','1','0','1','1','1','1','0','1','1','1','1','1','1','0','1','0','1','1','0','0','1','1','1','1','0','1','1'},
                {'1','1','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','0','1','1','1','1','1','1','1','0','1','1','1','1','1','1','1','1','0','1','1','1','0'},
                {'1','1','1','1','1','0','1','1','1','1','1','1','1','1','0','0','1','1','1','1','1','1','1','1','1','1','1','0','1','1','1','1','1','1','0','0','1','1','1','1'},
                {'1','1','0','1','1','0','1','1','1','1','1','1','0','1','0','1','1','1','1','1','0','1','1','1','1','1','1','1','1','0','0','1','1','1','0','1','0','1','0','0'},
                {'0','1','1','0','1','1','1','1','1','1','1','0','0','1','1','1','1','1','0','0','1','0','1','1','1','1','1','0','1','1','1','0','1','1','0','1','1','1','0','1'}
        };
        Assert.assertEquals(maximalSquare.maximalSquare(matrix),64);
    }
}
