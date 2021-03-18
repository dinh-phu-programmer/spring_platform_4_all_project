package com.dinhphu.practice_angularjs.service.common;

import com.dinhphu.practice_angularjs.model.RootClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class CommonAction<T extends RootClass,ID>  {

    private JpaRepository repository;

    public CommonAction(JpaRepository repository){
        this.repository=repository;
    }

    public T findObjectById(ID id){
        return (T) this.repository.findById(id).get();
    }

    public T save(T object){
        return (T) this.repository.save(object);
    };

    public T update(ID id,T object){
        T current= findObjectById(id);
        Long currentId= current.getId();
        current = object;
        current.setId(currentId);
        return (T) this.repository.save(current);
    }

    public T delete(ID id){
        T current=findObjectById(id);
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
