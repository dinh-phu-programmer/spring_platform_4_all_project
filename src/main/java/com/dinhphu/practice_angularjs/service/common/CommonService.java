package com.dinhphu.practice_angularjs.service.common;

import java.util.List;

public interface CommonService<T,ID> {
    T save(T object);
    T update(ID id,T object);
    T delete(ID id);
    List<T> findAll();
    T findById(ID id);

}
