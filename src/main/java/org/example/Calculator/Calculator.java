package org.example.Calculator;

public class Calculator {

    /**
     * Метод расчета итоговой цены товара в корзине
     *
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки (число от 1 до 100)
     * @return сумма покупки со скидкой или -1 в случае некорректного значения discountAmount
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) throws ArithmeticException{
        if (discountAmount < 0 || 100 < discountAmount)
            throw new ArithmeticException("Значение скидки некорректно: " + discountAmount);
        else if (discountAmount == 0) return purchaseAmount;
        else return purchaseAmount * (discountAmount * 0.01);
    }
}