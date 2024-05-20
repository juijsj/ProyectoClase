package com.estivman.physics_proyect.physics_simulator.services;

import com.estivman.physics_proyect.physics_simulator.models.Material;
import com.estivman.physics_proyect.physics_simulator.utils.ExpansionTypeEnum;

public interface IThermalExpansionService {
    public Material searchSolidElement(String solidMaterialName);

    public Material searchLiquidElement(String liquidMaterialName);

    public String calcExpansion(String materialName, ExpansionTypeEnum expansionType, double initialTemperature,
            double finalTemperature, double initialDimension);

    public String[] calculateCompositeSystemExpansion(String solidMaterialName, double solidInitialTemperature,
            double solidFinalTemperature, double solidInitialDimension, String liquidMaterialName,
            double liquidInitialTemperature,
            double liquidFinalTemperature, double liquidInitialDimension);
}
