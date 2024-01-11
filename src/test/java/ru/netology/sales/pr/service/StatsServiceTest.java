package ru.netology.sales.pr.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @Test
    void testCalculateTotalSales() {
        // int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] monthlySales = {10, 100, 15, 12, 10, 30, 30, 8, 9, 10, 11, 12};
        StatsService statisticsService = new StatsService();

        int totalSales = statisticsService.calculateTotalSales(monthlySales);

        assertEquals(257, totalSales);
    }

    @Test
    void testCalculateAverageSales() {
        int[] monthlySales = {10, 100, 15, 12, 10, 30, 30, 8, 9, 10, 11, 12};
        StatsService statisticsService = new StatsService();

        double averageSales = statisticsService.calculateAverageSales(monthlySales);

        assertEquals(21.41, averageSales, 0.01);
    }

    @Test
    void testFindMonthWithMaxSales() {
        int[] monthlySales = {10, 100, 15, 12, 10, 30, 30, 8, 9, 10, 11, 12};
        StatsService statisticsService = new StatsService();

        int monthWithMaxSales = statisticsService.findMonthWithMaxSales(monthlySales);

        assertEquals(1, monthWithMaxSales);
    }

    @Test
    void testFindMonthWithMinSales() {
        int[] monthlySales = {10, 100, 15, 12, 10, 30, 30, 8, 9, 10, 11, 12};
        StatsService statisticsService = new StatsService();

        int monthWithMinSales = statisticsService.findMonthWithMinSales(monthlySales);

        assertEquals(7, monthWithMinSales);
    }

    @Test
    void testCountMonthsBelowAverage() {
        int[] monthlySales = {10, 100, 15, 12, 10, 30, 30, 8, 9, 10, 11, 12};
        StatsService statisticsService = new StatsService();

        int countBelowAverage = statisticsService.countMonthsBelowAverage(monthlySales);

        assertEquals(9, countBelowAverage);
    }

    @Test
    void testCountMonthsAboveAverage() {
        int[] monthlySales = {10, 100, 15, 12, 10, 30, 30, 8, 9, 10, 11, 12};
        StatsService statisticsService = new StatsService();

        int countAboveAverage = statisticsService.countMonthsAboveAverage(monthlySales);

        assertEquals(3, countAboveAverage);
    }
}
