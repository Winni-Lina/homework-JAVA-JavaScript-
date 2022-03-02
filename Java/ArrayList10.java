package homework;

import java.util.ArrayList;

public class ArrayList10 {
    private int size = 0;
    private Object[] elementData = new Object[50];

    public boolean addLast(Object e){
        elementData[size] = e;
        size++;

        return true;
    }
}