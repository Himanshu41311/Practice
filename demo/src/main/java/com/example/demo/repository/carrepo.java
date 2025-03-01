// repo for car
package com.example.demo.repository;

import com.example.demo.model.CARS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface carrepo extends JpaRepository<CARS,String> {

}
