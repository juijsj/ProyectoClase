package com.estivman.physics_proyect.physics_simulator.dtos;

import com.estivman.physics_proyect.physics_simulator.utils.ExpansionTypeEnum;

public class ParseMaterialDto {
    private String solidMaterialName;
    private double solidInitialTemperature;
    private double solidFinalTemperature;
    private double solidInitialDimension;
    private ExpansionTypeEnum expansionType;

    // Getters y setters
    public String getSolidMaterialName() {
        return solidMaterialName;
    }

    public void setSolidMaterialName(String solidMaterialName) {
        this.solidMaterialName = solidMaterialName;
    }

    public double getSolidInitialTemperature() {
        return solidInitialTemperature;
    }

    public void setSolidInitialTemperature(double solidInitialTemperature) {
        this.solidInitialTemperature = solidInitialTemperature;
    }

    public double getSolidFinalTemperature() {
        return solidFinalTemperature;
    }

    public void setSolidFinalTemperature(double solidFinalTemperature) {
        this.solidFinalTemperature = solidFinalTemperature;
    }

    public double getSolidInitialDimension() {
        return solidInitialDimension;
    }

    public void setSolidInitialDimension(double solidInitialDimension) {
        this.solidInitialDimension = solidInitialDimension;
    }

    public ExpansionTypeEnum getExpansionType() {
        return expansionType;
    }

    public void setExpansionType(ExpansionTypeEnum expansionType) {
        this.expansionType = expansionType;
    }
}
