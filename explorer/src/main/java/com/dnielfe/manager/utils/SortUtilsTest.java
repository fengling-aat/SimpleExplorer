package com.dnielfe.manager.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SortUtilsTest {
    private SortUtils example;
    @Before
    public void setup() throws Exception{
        example = new SortUtils();
    }
    @Test
    public void multiplyTest1() throws Exception{
        assertEquals(8,example.multiply(2,4));
    }
    @Test
    public void multiplyTest2() throws Exception{
        assertEquals(6,example.multiply(1,4));
    }
    @Test
    public void multiplyTest3() throws Exception{
        assertEquals(4,example.multiply(2,2));
    }
    @Test
    public void BubbleSortTest1() throws Exception{
        //assertEquals([1,2,3,4],example.BubbleSort([2,3,1,4]));
        int []src = {2,4,1,3};
        int []dest = {1,2,3,4};
        assertArrayEquals(dest,example.BubbleSort(src));
    }
    @Test
    public void BubbleSortTest2() throws Exception{
        //assertEquals([1,2,3,4],example.BubbleSort([2,3,1,4]));
        int []src = {2,4,1,3,0,7,5};
        int []dest = {0,1,2,3,4,5,7};
        assertArrayEquals(dest,example.BubbleSort(src));
    }
    @Test
    public void SplitBySpaceTest1() throws  Exception{
        String[] dest = {"a","b","c","d"};
        assertArrayEquals(dest,example.SplitBySpace("a b c d"));
    }
    @Test
    public void SplitBySpaceTest2() throws  Exception{
        String[] dest = {"aa","bb","cc","ddd"};
        assertArrayEquals(dest,example.SplitBySpace("aa bb cc ddd"));
    }
}