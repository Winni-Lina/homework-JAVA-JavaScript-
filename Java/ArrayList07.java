package homework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList07 
{ 
    public static void main(String[] args) 
    {
        ArrayList<String> my_arr_list = new ArrayList<String>();

		my_arr_list.add("hello");
		my_arr_list.add("java");
		my_arr_list.add("world!");

		Iterator<String> it = my_arr_list.iterator();


    }
}