package org.banco.app.repository;

public interface Repositorio<T> {
    T findOne(Integer NumCuenta);
    void update(T t);
}
