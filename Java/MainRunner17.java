package homework;

import java.util.ArrayList;

public class MainRunner17{
    public static void main(String[] args)
    {
        ArrayList17 arraylist = new ArrayList17();
        arraylist.addLast(1);
        arraylist.addLast(2);
        arraylist.addLast(3);

        if(arraylist.size() != 3)
        {
            System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �� �����غ�����");
            return ;
        }

        System.out.println("�����ϼ���.");
    }
}