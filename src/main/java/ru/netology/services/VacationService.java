package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев отдыха
        int money = 0; // сумма денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {// можем отдыхать
                money = (money - expenses) / 3;
                count++;  //увеличиваем счетчик месяцев отдыха
            } else {
                money = money + income - expenses; // продолжаем работать
            }
        }
        return count;
    }
}