package hu.peczedavid.dealership.controller;

import hu.peczedavid.dealership.entity.EngineEntity;
import hu.peczedavid.dealership.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/engine")
public class EngineController {

    @Autowired
    private EngineService engineService;

    @GetMapping
    public ResponseEntity<List<EngineEntity>> getAll() {
        List<EngineEntity> engineEntities = engineService.findAll();
        return new ResponseEntity<>(engineEntities, HttpStatus.OK);
    }

}
