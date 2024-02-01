package com.vergiliusproject.repos;

import org.springframework.data.repository.CrudRepository;
import com.vergiliusproject.entities.Tdata;
import com.vergiliusproject.entities.Ttype;

import java.util.List;

public interface TdataRepository extends CrudRepository<Tdata, Integer> {
    List<Tdata> findByTtype(Ttype ttype);
}