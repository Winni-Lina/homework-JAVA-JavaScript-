package homework;

import java.util.ArrayList;

public class ArrayList04 
{ 
    public static void main(String[] args) 
    {
        ArrayList<String> my_arr_list = new ArrayList<String>();

		my_arr_list.add("hello");
		my_arr_list.add("java");
		my_arr_list.add("world!");

		my_arr_list.remove(2);

    }
}