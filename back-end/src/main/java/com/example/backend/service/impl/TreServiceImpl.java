package com.example.backend.service.impl;

import com.example.backend.model.Tre;
import com.example.backend.repository.TreRepository;
import com.example.backend.service.TreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreServiceImpl implements TreService {
    @Autowired
    private TreRepository treRepository;

    @Override
    public void save(Tre tre) {
        treRepository.save(tre);
    }

    @Override
    public List<Tre> findAllById(int id) {
        return treRepository.findAllByIdUser(id);
    }

    @Override
    public void deleteById(int id) {
        treRepository.deleteById(id);
    }

    @Override
    public Tre findTreById(int id) {
        return treRepository.findTreById(id);
    }

    @Override
    public int findTreByName(String idtre1) {
        return treRepository.findTreByName(idtre1);
    }

}
