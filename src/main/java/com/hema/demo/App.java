package com.hema.demo;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int []arr= {1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int []nums) {
    	nums[0]=9;
    }
    
}

