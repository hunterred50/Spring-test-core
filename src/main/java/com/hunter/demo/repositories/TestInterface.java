package com.hunter.demo.repositories;

import com.hunter.demo.models.TestModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestInterface extends MongoRepository<TestModel, String> {
    public TestModel findByFirstName(String firstName);
}
