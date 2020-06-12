package com.wildcodeschool.disco_project.repository;

import java.util.List;

public interface DiscoDao<T> {

    T findById(Long id);

    List<T> findAll();

}
