package org.java.crud.jdbc.repository;

import java.util.List;

public interface Repositorio<T> {
    List<T> findall();
    T findone(int id);
    void create(T t);
    void update(T t);
    void delete(int id);
}
