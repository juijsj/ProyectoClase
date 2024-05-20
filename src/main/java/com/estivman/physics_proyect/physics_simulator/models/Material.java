package com.estivman.physics_proyect.physics_simulator.models;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import com.estivman.physics_proyect.physics_simulator.utils.ExpansionTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Material implements IMaterial {
    private String name;
    private String thermalExpansionCoefficient;
    private String texturePath;
    private String materialImagePath;
    private String minTemperature;
    private String maxTemperature;

    @Override
    public String calculateExpansion(ExpansionTypeEnum ExpansionType, double initialTemperature, double finalTemperature, double initialDimension) {
        double expansion = 0;
        switch (ExpansionType) {
            case LINEAR:
                expansion = Double.parseDouble(thermalExpansionCoefficient) * initialDimension * (finalTemperature - initialTemperature);
                break;
            case SUPERFICIAL:
                expansion = 2 * Double.parseDouble(thermalExpansionCoefficient) * initialDimension * (finalTemperature - initialTemperature);
                break;
            case VOLUMETRIC:
                expansion = 3 * Double.parseDouble(thermalExpansionCoefficient) * initialDimension * (finalTemperature - initialTemperature);
                break;
        }
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.######", symbol);
        return df.format(expansion);
    }
}
