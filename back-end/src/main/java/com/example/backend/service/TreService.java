package com.example.backend.service;

import com.example.backend.model.Tre;

import java.util.List;

public interface TreService {
//    void save(TreDto tre, int idUser);
    void save(Tre tre);
   List<Tre> findAllById(int id);
    void deleteById(int id);
    Tre findTreById(int id);

    int findTreByName(String idtre1);
}
