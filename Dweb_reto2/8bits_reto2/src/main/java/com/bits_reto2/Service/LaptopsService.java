package com.bits_reto2.Service;

import com.bits_reto2.Model.Laptops;
import com.bits_reto2.Repository.LaptosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lei20
 */
@Service
public class LaptopsService {

    @Autowired
    private LaptosRepository laptopsRepository;

/////////////////////////////// 
    public List<Laptops> getAll() {
        return laptopsRepository.getAll();
    }

    ///////////////////////////////////////
    public Optional<Laptops> getLaptops(int id) {
        return laptopsRepository.getLaptops(id);
    }

    /////////metodo guardar (crear las laptos)/////////////////////////////
    public Laptops save(Laptops laptops) {
        if (laptops.getId() == null) {
            return laptops;
        }
        return laptopsRepository.save(laptops);
    }
    /////////////////////////////

    public Laptops update(Laptops laptops) {
        if (laptops.getId() != null) {
            Optional<Laptops> Laptopsdb = laptopsRepository.getLaptops(laptops.getId());
            if (!Laptopsdb.isEmpty()) {
                if (laptops.getBrand() != null) {
                    Laptopsdb.get().setBrand(laptops.getBrand());
                }
                if (laptops.getModel() != null) {
                    Laptopsdb.get().setModel(laptops.getModel());
                }
                if (laptops.getProcesor() != null) {
                    Laptopsdb.get().setProcesor(laptops.getProcesor());
                }
                if (laptops.getOs() != null) {
                    Laptopsdb.get().setOs(laptops.getOs());
                }
                if (laptops.getDescription() != null) {
                    Laptopsdb.get().setDescription(laptops.getDescription());
                }
                if (laptops.getMemory() != null) {
                    Laptopsdb.get().setMemory(laptops.getMemory());
                }
                if (laptops.getHardDrive() != null) {
                    Laptopsdb.get().setHardDrive(laptops.getHardDrive());
                }

                Laptopsdb.get().setAvailability(laptops.isAvailability());

                if (laptops.getPrice() != 0.0) {
                    Laptopsdb.get().setPrice(laptops.getPrice());
                }
                if (laptops.getQuantity() != 0) {
                    Laptopsdb.get().setQuantity(laptops.getQuantity());
                }
                if (laptops.getPhotography() != null) {
                    Laptopsdb.get().setPhotography(laptops.getPhotography());
                }
                laptopsRepository.update(Laptopsdb.get());
                return Laptopsdb.get();
            } else {
                return laptops;
            }
        } else {
            return laptops;
        }
    }

    ////////////////////////////////////////////////////////////////////
    public boolean delete(int id) {
        return getLaptops(id).map(product -> {
            laptopsRepository.delete(product);
            return true;
        }).orElse(false);
    }

}
