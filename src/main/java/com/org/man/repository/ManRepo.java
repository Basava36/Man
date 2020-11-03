package com.org.man.repository;

import com.org.man.model.Man;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManRepo extends MongoRepository<Man,Integer> {
    Man findByManId(Integer manId);

    Man findByManAge(Integer manAge);

    Man findByManAddress(String manAddress);

    Man findByManInterest(String manInterest);

    void deleteByManId(Integer manId);
}
