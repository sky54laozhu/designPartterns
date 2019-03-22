package strategy.examples.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Student stu[] = {
                new Student("张三" ,23),
                new Student("李四" ,26)
                , new Student("王五" ,22)};
        Arrays. sort(stu,new SortComparator());
        System.out.println(Arrays.toString(stu));

        List<Student> list = new ArrayList<Student>(3);
        list.add( new Student("zhangsan" ,31));
        list.add( new Student("lisi" ,30));
        list.add( new Student("wangwu" ,35));
        Collections. sort(list,new SortComparator());
        System.out.println(list);

    }

}