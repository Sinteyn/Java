package org.example.Homework.Homework6.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Laptop {
    private String manufacturer;
    private String model;
    private Double price;
    private String color;
    private Double screenDiagonal;
    private Boolean gaming;
    private String os;
    private String screenResolution;
    private String screenType;
    private String cpuModel;
    private Integer cpuCores;
    private Double cpuFrequency;
    private Integer ram;
    private Boolean ssd;
    private Integer rom;
    private String graphicsCard;
}
