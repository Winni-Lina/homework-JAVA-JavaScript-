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
            System.out.println("틀렸습니다. 다시 잘 생각해보세요");
            return ;
        }
        
        System.out.println("제출하세요.");
    }
}