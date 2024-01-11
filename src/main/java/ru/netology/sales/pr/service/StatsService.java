package ru.netology.sales.pr.service;

public class StatsService {

    public int calculateTotalSales(int[] sales) {
        // Метод для расчета суммы всех продаж
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public double calculateAverageSales(int[] sales) {
        // Метод для расчета средней суммы продаж в месяц
        int totalSales = calculateTotalSales(sales);
        return (double) totalSales / sales.length;
    }

    public int findMonthWithMaxSales(int[] sales) {
        // Метод для поиска номера месяца с максимальными продажами
        int maxSales = Integer.MIN_VALUE;
        int maxMonth = -1;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                maxSales = sales[i];
                maxMonth = i;
            }
        }

        return maxMonth;
    }

    public int findMonthWithMinSales(int[] sales) {
        // Метод для поиска номера месяца с минимальными продажами
        int minSales = Integer.MAX_VALUE;
        int minMonth = -1;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                minSales = sales[i];
                minMonth = i;
            }
        }

        return minMonth;
    }

    public int countMonthsBelowAverage(int[] sales) {
        // Метод для подсчета количества месяцев с продажами ниже среднего
        double averageSales = calculateAverageSales(sales);
        int count = 0;

        for (int sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }

        return count;
    }

    public int countMonthsAboveAverage(int[] sales) {
        // Метод для подсчета количества месяцев с продажами выше среднего
        double averageSales = calculateAverageSales(sales);
        int count = 0;

        for (int sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }

        return count;
    }
}
