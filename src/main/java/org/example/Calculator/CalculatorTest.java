package org.example.Calculator;

import org.assertj.core.api.Assertions;

public class CalculatorTest {
    public static void main(String[] args) {
        calculatingDiscountTestPositive();
        calculatingDiscountTestNegative();
    }

    public static void calculatingDiscountTestPositive(){
        Assertions.assertThat(Calculator.calculatingDiscount(5500.00, 50)).isEqualTo(2750);
        Assertions.assertThat(Calculator.calculatingDiscount(5500.00, 0)).isEqualTo(5500);
    }
    public static void calculatingDiscountTestNegative(){
        Assertions.assertThatThrownBy(() -> Calculator.calculatingDiscount(1680, 101)).isInstanceOf(ArithmeticException.class);
        Assertions.assertThatThrownBy(() -> Calculator.calculatingDiscount(1680, -1)).isInstanceOf(ArithmeticException.class);
    }
}