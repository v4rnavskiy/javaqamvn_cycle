package ru.netology.sqr.javaqamvn_cycle.service;

public class SqrService {

    public int sqrCalc(int min, int max) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if ((i * i >= min) && (i * i <= max)) {
                count++;
            }
        }
        return count;
    }
}