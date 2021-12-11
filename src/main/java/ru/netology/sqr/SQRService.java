package ru.netology.sqr;

public class SQRService {
    public int calculate(int min, int max) {

        //int min = 200;
        //int max = 300;
        int calc = 0;
        for (int i = 1; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                calc = calc + 1;
            }

        }
        return calc;


    }

    }



