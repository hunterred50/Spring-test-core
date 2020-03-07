package com.hunter.demo.controllers;

import com.hunter.demo.models.TestModel;
import com.hunter.demo.repositories.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3001")
@RestController @RequestMapping("/test")
public class TestControllers {

    @Autowired
    private TestInterface testInterface;

    @GetMapping(path="/hello")
    String helloWorld () {
        return "hello world!";
    }

    @GetMapping(path="/firstName")
    TestModel findName () {
        return testInterface.findByFirstName("hunter");
    }

    @GetMapping(path="/allUsers")
    List<TestModel> findUsers () {
        return testInterface.findAll();
    }

    @PostMapping(path="/insert")
    TestModel insertName(@RequestBody TestModel model) {
        return testInterface.insert(model);
    }

    @DeleteMapping(path="/delete/{id}")
    void deleteName(@PathVariable("id") String id) {
        testInterface.deleteById(id);
    }
}
