package com.wildcodeschool.disco_project.DAO;

import java.util.List;

public interface GenericDao<T>  {
     List<T> findAll();
     T findById(Long id);
     T create (T model);
     T update (T model);
     void delete (Long id);

}
