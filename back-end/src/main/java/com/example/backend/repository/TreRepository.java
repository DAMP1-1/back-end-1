package com.example.backend.repository;

import com.example.backend.model.Tre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TreRepository extends JpaRepository<Tre,Integer> {


    @Query( value = "select  o from Tre o where o.user.id = ?1")
    List<Tre> findAllByIdUser(int id);
    @Query( value = "select  o from Tre o where o.idtre = ?1")
    Tre findTreById(int id);
    @Query( value = "select  o.idtre from Tre o where o.tentre = ?1")
    int findTreByName(String idtre1);
}
