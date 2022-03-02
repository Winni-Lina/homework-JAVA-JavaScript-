package homework;

import java.util.ArrayList;

public class ArrayList11 {
    private int size = 0;
    private Object[] elementData = new Object[50];

    public boolean addLast(Object element){
        elementData[size++] = element;
        return true;
    }
    
    public boolean add(int index, Object element){
        return true;
    }
}