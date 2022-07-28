package com.neo;

import com.core.Calculator;

/**
 * @author ManhKM on 7/28/2022
 * @project module2
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("SUM: "+calculator.sum(12, 13));
    }
}
