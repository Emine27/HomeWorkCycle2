package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int culAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int minSalesAvg(int[] sales) {
        int minMonthSales = 0; //переменна для подсчета колличесва месяцев, в которых продажи были ниже среднего
        for (int sale : sales) {
            if (sale < culAvg(sales)) {
                minMonthSales = minMonthSales + 1;
            }
        }
        return minMonthSales;
    }

    public int maxSalesAvg(int[] sales) {
        int maxMonthSales = 0; //переменна для подсчета колличесва месяцев, в которых продажи были выше среднего
        for (int sale : sales) {
            if (sale > culAvg(sales)) {
                maxMonthSales = maxMonthSales + 1;
            }
        }
        return maxMonthSales;
    }
}