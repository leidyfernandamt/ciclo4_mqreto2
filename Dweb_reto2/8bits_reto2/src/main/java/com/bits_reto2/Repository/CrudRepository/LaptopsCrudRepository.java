
package com.bits_reto2.Repository.CrudRepository;

import com.bits_reto2.Model.Laptops;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author lei20
 */
public interface LaptopsCrudRepository extends MongoRepository<Laptops, Integer>{
    
}
