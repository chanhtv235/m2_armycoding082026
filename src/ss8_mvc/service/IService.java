package ss8_mvc.service;

import ss8_mvc.entity.Student;

import java.util.List;

public interface IService <T>{
    List<T> getAll();
    List<T> searchByName();
    void add(T t);
    void deleteById(int id);
}
