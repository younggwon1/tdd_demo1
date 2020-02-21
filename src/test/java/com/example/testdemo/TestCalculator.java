package com.example.testdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 Application SRS:계산기
 1. 2가지 숫자의 정수 덧셈
 2. 2가지 숫자의 정수 뺄셈
 */

public class TestCalculator {
    // annotation -> 부가 설명, 기능을 코드없이 설정
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        assertTrue(result==30); //import static org.junit.jupiter.api.Assertions.assertTrue; 필요
        //Assertions.assertTrue(result==30); //import static org.junit.jupiter.api.Assertions; 필요
    }

    @Test
        public void testSub() {
        Calculator calc = new Calculator();
        int result = calc.sub(20, 10);
        assertTrue(result == 10);
    }

    @Test
    public void testAddError() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        assertFalse(result!=30); //import static org.junit.jupiter.api.Assertions.assertFalse; 필요
    }

    @Test
    public void testSubError() {
        Calculator calc = new Calculator();
        int result = calc.sub(20, 10);
        assertEquals(10,result,"결과는 10이어야 합니다."); //import static org.junit.jupiter.api.Assertions.assertEquals; 필요
    }
}
