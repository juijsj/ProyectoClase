package com.estivman.physics_proyect.physics_simulator.models;

import com.estivman.physics_proyect.physics_simulator.utils.ExpansionTypeEnum;

public interface IMaterial {
    public String calculateExpansion(ExpansionTypeEnum ExpansionType, double initialTemperature,
            double finalTemperature, double initialDimension);
}
