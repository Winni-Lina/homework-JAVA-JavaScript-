package homework;

import java.util.ArrayList;

public class MainRunner16{
    public static void main(String[] args)
    {
        ArrayList16 arraylist = new ArrayList16();
        arraylist.addLast(1);
        arraylist.addLast(2);
        arraylist.addLast(3);
          
        if(!arraylist.toString().equals("[1,2,3]"))
        {
            System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �� �����غ�����");
            return ;
        }
        
        System.out.println("�����ϼ���.");
    }
}