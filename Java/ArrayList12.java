package homework;

import java.util.ArrayList;

public class ArrayList12 {
	private int size = 0;
    private Object[] elementData = new Object[50];

    public boolean addLast(Object e)
    {
        elementData[size++] = e;
        return true;
    }

    public boolean add(int index, Object element)
    {
        for(int i=size-1; i>=index; i--){
            elementData[i+1] = elementData[i];
        }

        return true;
    }
}