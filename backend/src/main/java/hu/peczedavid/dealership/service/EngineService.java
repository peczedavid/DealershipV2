package hu.peczedavid.dealership.service;

import hu.peczedavid.dealership.entity.EngineEntity;
import hu.peczedavid.dealership.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineService {

    @Autowired
    private EngineRepository engineRepository;

    public List<EngineEntity> findAll() {
        return engineRepository.findAll();
    }

}
