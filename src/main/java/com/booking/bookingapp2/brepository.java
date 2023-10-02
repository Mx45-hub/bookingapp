package com.booking.bookingapp2;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface brepository extends  JpaRepository<bmodel, Long>{

    bmodel save(bmodel product);

    List<bmodel> findAll();

    


    
}
