package com.estivman.physics_proyect.physics_simulator.utils;

import java.util.List;

import com.estivman.physics_proyect.physics_simulator.models.Material;

public class SearchElement {
    
    public static Material searchElement(String materialName, List<Material> materialsList) {
        for (Material material : materialsList) {
            if (material.getName().equals(materialName)) {
                return material;
            }
        }
        return null;
    }
}

