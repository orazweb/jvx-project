package com.wildcodeschool.disco_project.repository;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

/*@Repository
public class DiscoDao{

    private final Logger L = LoggerFactory.getLogger(getClass());

    @Autowired
    private AppConfig config;

}*/

public interface DiscoDao<T> {

    T findById(Long id);

    List<T> findAll();



}
