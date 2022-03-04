package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testMultiply() {
        List<Integer> multiply = calculator.multiply();
        assertNotNull( multiply);
    }

    @Test
    void test(){

    }
}