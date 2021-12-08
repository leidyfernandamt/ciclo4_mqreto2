
package com.bits_reto2.Repository;

import com.bits_reto2.Model.Laptops;
import com.bits_reto2.Repository.CrudRepository.LaptopsCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lei20
 */
@Repository
public class LaptosRepository {
    
     @Autowired
    private LaptopsCrudRepository computerCrudRepository;

    public List<Laptops> getAll(){
        return computerCrudRepository.findAll();
    }

    public Optional<Laptops> getLaptops(int id){
        return computerCrudRepository.findById(id);
    }

    public Laptops save(Laptops laptops){
        return computerCrudRepository.save(laptops);
    }

    public void update(Laptops laptops){
        computerCrudRepository.save(laptops);
    }

    public void delete(Laptops laptops){
        computerCrudRepository.delete(laptops);
    }
  
    
}
