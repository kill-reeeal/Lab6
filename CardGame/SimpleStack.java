package CardGame;

import java.util.ArrayList;

public class SimpleStack<Integer> {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public void push(Integer item){
        list.add(0,item);
    }
    public Integer pop(){
        return list.remove(0);
    }
    public int size(){
        return list.size();
    }
    public Integer peek(){
        return list.get(0);
    }
}