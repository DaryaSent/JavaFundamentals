package com.homework.utill;

public class ArrayUtil {

    public double sum(double[] array){
        double sum=0;

        for (double x:array){
            sum+=x;
        }
        return sum;
    }

    public double average(double[] array){
        double summ=sum(array);
        double aver=summ/(array.length);
        return aver;
    }

    public double max(double[] array){
        double max = array[0];

        for (int i=0; i<array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public double min(double[] array){
        double min = array[0];

        for (int i=0; i<array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public double[] change(double[] array){

        for (int i=0; i<array.length;i++){
            if (array[i]<0){
                array[i]= -1 * array[i];
            }
        }
        return array;
    }
}
