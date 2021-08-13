import java.util.Arrays;

public class MyArrayList {

    private String[] myData;
    private int size;

    public MyArrayList() {
        this.size = 10;
        this.myData = new String[this.size];
    }

    public MyArrayList(int size) {
        this.size = size;
        this.myData = new String[this.size];
    }

    public void add(String value) {
        int dataSize = 0;

        for (int i = 0; i < myData.length; i++) {
            if (myData[i] != null) {
                dataSize++;
            }
        }

        if ((dataSize + 1) > myData.length) {
            String[] newData = new String[(myData.length * 3) / 2 + 1];

            for (int i = 0; i < myData.length; i++) {
                newData[i] = myData[i];
            }

            myData = newData;
            size = newData.length;
        }

        myData[dataSize++] = value;
    }

    public String remove(int index) {
        String removedValue = myData[index];

        String[] newData = new String[myData.length - 1];

        for (int i = 0; i < index; i++) {
            newData[i] = myData[i];
        }

        for (int i = index; i < myData.length - 1; i++) {
            newData[i] = myData[i + 1];
        }

        myData = newData;
        size = newData.length;

        return removedValue;
    }

    @Override
    public String toString ( ) {
        return "MyArrayList{" +
               "myData=" + Arrays.toString ( myData ) +
               ", size=" + size +
               '}';
    }
}
