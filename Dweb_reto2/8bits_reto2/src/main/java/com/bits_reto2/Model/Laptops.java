package com.bits_reto2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author lei20
 */
@Document(collection = "laptops")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptops {

    @Id

    private Integer id;
    private String brand;
    private String model;
    private String procesor;
    private String os;
    private String description;
    private String memory;
    private String hardDrive;
    private boolean availability;
    private double price;
    private int quantity;
    private String photography;

}
