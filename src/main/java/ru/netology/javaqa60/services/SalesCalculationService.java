package ru.netology.javaqa60.services;
public class SalesCalculationService {

    public int getSalesAmount (int[] sales) {

        int sum = 0;
        for (int i =0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int getAverageSum (int[] sales) {

        int sum = getSalesAmount(sales);
        int averageSum = sum / sales.length;

        return averageSum;
    }

    public int getMaxSales (int[] sales) {

        int maxMonth = sales[0];
        for (int i=0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSales (int[] sales) {

        int minMonth = sales[0];
        for (int i=0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getBelowAverageSales (int[] sales) {

        int minAverageMonth = 0;
        int averageSum = getAverageSum(sales);
        for (int i=0; i < sales.length; i++) {
            if (sales[i] <= averageSum) {
                minAverageMonth = i;
            }
        }
        return minAverageMonth + 1;
    }

    public int getAboveAverageSales (int[] sales) {

        int maxAverageMonth = 0;
        int averageSum = getAverageSum(sales);
        for (int i=0; i < sales.length; i++) {
            if (sales[i] >= averageSum) {
                maxAverageMonth = i;
            }
        }
        return maxAverageMonth + 1;
    }
}
