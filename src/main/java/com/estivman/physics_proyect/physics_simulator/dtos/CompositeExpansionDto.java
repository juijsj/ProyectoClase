package com.estivman.physics_proyect.physics_simulator.dtos;

public class CompositeExpansionDto {
    private String solidMaterialName;
    private double solidInitialTemperature;
    private double solidFinalTemperature;
    private double solidInitialDimension;
    private String liquidMaterialName;
    private double liquidInitialTemperature;
    private double liquidFinalTemperature;
    private double liquidInitialDimension;

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

    public String getLiquidMaterialName() {
        return liquidMaterialName;
    }

    public void setLiquidMaterialName(String liquidMaterialName) {
        this.liquidMaterialName = liquidMaterialName;
    }

    public double getLiquidInitialTemperature() {
        return liquidInitialTemperature;
    }

    public void setLiquidInitialTemperature(double liquidInitialTemperature) {
        this.liquidInitialTemperature = liquidInitialTemperature;
    }

    public double getLiquidFinalTemperature() {
        return liquidFinalTemperature;
    }

    public void setLiquidFinalTemperature(double liquidFinalTemperature) {
        this.liquidFinalTemperature = liquidFinalTemperature;
    }

    public double getLiquidInitialDimension() {
        return liquidInitialDimension;
    }

    public void setLiquidInitialDimension(double liquidInitialDimension) {
        this.liquidInitialDimension = liquidInitialDimension;
    }
}
