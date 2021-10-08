package com.bridgelabz.Day27;
import java.util.Arrays;

public class GenericsBubbleSort<T extends Comparable<? super T>> {
    T[] array;

    GenericsBubbleSort(T[] array) {
        this.array = array;
    }
    private T[] bubbleSort(){
        for(int i = array.length; i > 1; i--){
            for(int j = 0; j < i - 1; j++){
                if(array[j].compareTo(array[j+1]) > 0){
                    swapElements(j, array);
                }
            }
        }
        return array;
    }
    private void swapElements(int index, T[] arr){
        T temp = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = temp;
    }
    public static void main(String[] args) {
        Integer[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54};
        GenericsBubbleSort<Integer> genericsBubbleSort = new GenericsBubbleSort<>(intArr);
        Integer[] sa1 = genericsBubbleSort.bubbleSort();
        System.out.println("Sorted array- " + Arrays.toString(sa1));
    }
}
