package com.estivman.physics_proyect.physics_simulator.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.estivman.physics_proyect.physics_simulator.models.Material;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class MaterialJsonReader {

    public List<Material> loadSolidMaterials() {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Material>>() {
        }.getType();
        List<Material> materials = new ArrayList<>();
        try {
            JsonReader reader = new JsonReader(new FileReader("src/main/resources/solid-materials.json"));
            materials = gson.fromJson(reader, listType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return materials;
    }

   public List<Material> loadLiquidMaterials() {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Material>>() {}.getType();
        List<Material> materials = new ArrayList<>();
        try (InputStream inputStream = getClass().getResourceAsStream("/liquid-materials.json");
             InputStreamReader reader = new InputStreamReader(inputStream)) {
            materials = gson.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return materials;
    }
}
