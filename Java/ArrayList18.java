package homework;

import java.util.ArrayList;

public class ArrayList18{
    private int size = 0;
    private Object[] elementData = new Object[50];
    
    public int size()
    {
        return size;
    }
    
    // 3���� ������ �����ϴ� indexOf �޼ҵ带 �ϼ��ϼ���.
    public int indexOf( Object o )
    {
        for (int i = 0; i<size; i++){
            if (o.equals(elementData[i])){
                return i;
            }
        }		
        return -1;
    }
    
    
    public Object get(int index)
    {
        return elementData[index];
    }
    
    public String toString()
    {
        String ans = "[";
        for(int i=0; i<size; i++)
        {
            ans += elementData[i];
            if(i<size-1)
            {
                ans += ",";
            }
        }
        ans += "]";
        return ans;
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