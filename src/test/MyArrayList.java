package test;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;
    
    public void add(String element){
        array[size] = element;
        size++;
        if (size == array.length) {
            String[] tempArray = new String[array.length + 10];
            for (int i = 0; i < size; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
    }

    public void printArray(){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;

        if (array.length - size >= 10 || size > 10) {
            String[] tempArr = new String[array.length - 10];
            for (int i = 0; i < size; i++) {
                tempArr[i] = array[i];
            }
            array = tempArr;
        }
    }

    public void remove(String name){
        for (int i = 0; i < size; i++) {
            if (array[i].equals(name)) {
                remove(i);
                return;
            }
        }
    }

    public String getElement(int index){
        return array[index];
    }

    public int getSize(){
        return size;
    }

    public void printArrayLength() {
        System.out.println(array.length);
    }
}
