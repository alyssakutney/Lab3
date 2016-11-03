import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListStack<T> {
  LinkedList<T> list;
    private int cursor;
    
    public LinkedListStack() {
        list = new LinkedList<T>();
        cursor = -1;
    }

    public void push(T item) {
        if(list.size() == 0){
          list.add(item);
        }else{
          list.add(0, item);
        }
    }

    public T first(){
      if(list.size()== 0){
    	return null;
      }else{
    	cursor = 0;
    	return list.get(cursor);
      }
    }
    
    public T pop() {
        if(list.isEmpty()){
          throw new NoSuchElementException();
        }
        return list.remove(0);
    }

    public T next(){
      if(cursor <0 || cursor == (list.size()-1)){
    	return null;
      }else{
    	cursor++;
    	return list.get(cursor);
      }
    }
    
    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return (list.size() == 0);
    }

    public void clear(){
      list.clear();
    }

}

