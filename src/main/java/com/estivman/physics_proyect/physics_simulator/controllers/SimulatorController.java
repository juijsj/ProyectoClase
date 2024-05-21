package com.estivman.physics_proyect.physics_simulator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estivman.physics_proyect.physics_simulator.dtos.CompositeExpansionDto;
import com.estivman.physics_proyect.physics_simulator.dtos.ParseMaterialDto;
import com.estivman.physics_proyect.physics_simulator.models.Material;
import com.estivman.physics_proyect.physics_simulator.services.ThermalExpansionService;

@RestController
@RequestMapping("/")
public class SimulatorController {

    @Autowired
    private ThermalExpansionService thermalExpansionService;

    @GetMapping()
    public String test() {
        return "test";
    }

    /*
     * Under this line you can add needed endpoints, be careful, I'll let spaces to
     * let you add them, so there's no branch collition, even though better ask
     * before add a new endpoint, I think we just need 4 endpoints (ignoring the
     * load one).
     */

    // Under here first endpoint

    // Under here second endpoint

    // Under here third endpoint
    @CrossOrigin(origins = "https://thermaldilatation.vercel.app/")
    @PostMapping("/calculateExpansionSystem")
    public String calcExpansion(@RequestBody ParseMaterialDto request) {
        return thermalExpansionService.calcExpansion(
                request.getSolidMaterialName(),
                request.getExpansionType(),
                request.getSolidInitialTemperature(),
                request.getSolidFinalTemperature(),
                request.getSolidInitialDimension());
    }

    @CrossOrigin(origins = "https://thermaldilatation.vercel.app/")
    @PostMapping("/calculateCompositeSystem")
    public String[] calculateCompositeSystemExpansion(@RequestBody CompositeExpansionDto request) {
        // Extraer los valores del DTO
        String solidMaterialName = request.getSolidMaterialName();
        double solidInitialTemperature = request.getSolidInitialTemperature();
        double solidFinalTemperature = request.getSolidFinalTemperature();
        double solidInitialDimension = request.getSolidInitialDimension();
        String liquidMaterialName = request.getLiquidMaterialName();
        double liquidInitialTemperature = request.getLiquidInitialTemperature();
        double liquidFinalTemperature = request.getLiquidFinalTemperature();
        double liquidInitialDimension = request.getLiquidInitialDimension();

        // Llamar al servicio con los parámetros extraídos
        return thermalExpansionService.calculateCompositeSystemExpansion(
                solidMaterialName, solidInitialTemperature, solidFinalTemperature, solidInitialDimension,
                liquidMaterialName, liquidInitialTemperature, liquidFinalTemperature, liquidInitialDimension);
    }

    @CrossOrigin(origins = "https://thermaldilatation.vercel.app/")
    @GetMapping("/getSolidMaterials")
    public List<Material> getSolidMaterials() {
        return thermalExpansionService.getSolidMaterialsList();
    }

    @CrossOrigin(origins = "https://thermaldilatation.vercel.app/")
    @GetMapping("/getLiquidMaterials")
    public List<Material> getLiquidMaterials() {
        return thermalExpansionService.getLiquidMaterialsList();
    }

}
