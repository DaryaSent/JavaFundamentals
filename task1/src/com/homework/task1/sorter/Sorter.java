package com.homework.task1.sorter;



public class Sorter {

    //Сортировка пузырьковая
    public double[] bubbleSort(double[] array ) {
        boolean needSwap = true;

        while (needSwap) {
            needSwap = false;

            for (int i = 1; i < array.length; i++) {

                if (array[i] < array[i - 1]) {
                    double swap = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = swap;
                    needSwap = true;
                }
            }
        }
         return array;
    }

    //Сортировка выбором
    public double[] selSort(double[] array){

        for (int left=0; left<array.length; left++){
            int idarr=left;

            for (int i=0; i<array.length; i++){
                if (array[i]>array[idarr]){
                    idarr=i;
                }

                double swap = array[left];
                array[left] = array[idarr];
                array[idarr] = swap;
            }
        }
        return array;
    }

    //Сортировка челночная
    public double[] shellSort(double[] array) {

        for(int i=1; i<array.length; i++){
            if (array[i]<array[i-1]){
                double swap = array[i];
                array[i] = array[i - 1];
                array[i - 1] = swap;

                for (int z=i-1;(z-1)>=0;z--){
                    if (array[z]<array[z-1]){
                        double swap2 = array[z];
                        array[z] = array[z - 1];
                        array[z - 1] = swap2;
                    }
                    else {break;}
                }
            }
        }
        return array;
    }
}
