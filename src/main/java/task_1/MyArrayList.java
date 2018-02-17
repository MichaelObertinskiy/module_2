package task_1;

public class MyArrayList<T> {
    private final int ARRAY_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[ARRAY_SIZE];
    private int pointer = 0;

    public int add(T element) {
        int x = 0;
        if (pointer == array.length - 1)
            resize(array.length * 2);
        array[pointer++] = element;
        return size();
    }

    public void add(T element, int index) {
        if (array[index].equals(null)) {
            add(element);
        } else {
            for (int i = array.length-1; i > index; i--) {
                array[i] = array[i-1];
            }
            array[index] = element;
        }
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        if (array.length > ARRAY_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2);
    }

    public int size() {
        return pointer;
    }


    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

}
