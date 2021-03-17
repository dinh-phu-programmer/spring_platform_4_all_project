package com.dinhphu.practice_angularjs.service;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class CommonAction<T,ID>  {

    private CrudRepository repository;

    public CommonAction(CrudRepository repository){
        this.repository=repository;
    }

    public T findObject(ID id){
        return (T) this.repository.findById(id).get();
    }

    public T save(T object){
        return (T) this.repository.save(object);
    };

    public T update(ID id,T object){
        T current= findObject(id);

        current = object;

        return (T) this.repository.save(current);
    }

    public T delete(ID id){
        T current=findObject(id);
        this.repository.deleteById(id);
        return current;
    }

    public List<T> findAll(){

        List<T> result= new ArrayList<>();
//        result.add()
        Iterable<T> ite= this.repository.findAll();
        for(T obj : ite){
            result.add(obj);
        }

        return result;
    }
}
