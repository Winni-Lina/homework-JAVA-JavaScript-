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
            System.out.println("틀렸습니다. 다시 잘 생각해보세요");
            return ;
        }

        System.out.println("제출하세요.");
    }
}