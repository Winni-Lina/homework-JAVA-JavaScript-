package homework;

import java.util.ArrayList;

public class MainRunner18{
	public static void main(String[] args)
    {
        ArrayList18 arraylist = new ArrayList18();
        arraylist.addLast(10);
        arraylist.addLast(20);
        arraylist.addLast(30);
        
        if(arraylist.indexOf(20)!=1 || arraylist.indexOf(100)!=-1)
        {
            System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �� �����غ�����");
            return ;
        }
        
        System.out.println("�����ϼ���.");
    }
}