package dao;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public interface InterfaceDAO <T>{
    public int insert(T t);
    
    public int update(T t);
    
    public int delete(T t);
    
    public T selectById(int id);
    
    public ArrayList<T> selectAll();
}
