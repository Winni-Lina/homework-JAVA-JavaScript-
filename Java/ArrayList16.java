package homework;

import java.util.ArrayList;

public class ArrayList16 {
    private int size = 0;
    private Object[] elementData = new Object[50];
    
    public Object get(int index)
    {
        return elementData[index];
    }
    
    public String toString()
    {
        String str = "[";
		for(int i=0; i<size; i++) {
			str += elementData[i];
			if (i< size-1){
				str+=",";
			}
		}
		
		return str + "]";
	}
    
    public boolean addLast(Object e)
    {
        elementData[size++] = e;
        return true;
    }
    
    public boolean add(int index, Object element)
    {
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }
    public boolean addFirst(Object element)
    {
        return add(0, element);
    }
}