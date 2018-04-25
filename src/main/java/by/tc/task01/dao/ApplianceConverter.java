package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.factory.ApplianceFactory;
import by.tc.task01.entity.factory.impl.ApplianceFactoryImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ApplianceConverter {

    public static List<Appliance> fromStringList(List<String> lines) {
        List<Appliance> appliances = new ArrayList<>();

        for(String line : lines) {
            Appliance appliance = fromString(line);
            appliances.add(appliance);
        }

        return appliances;
    }

    public static Appliance fromString(String line) {
        ApplianceFactory applianceFactory = new ApplianceFactoryImpl();

        String category = categoryFromString(line);
        Appliance appliance = applianceFactory.createAppliance(category);
        appliance.setOptions( optionsFromString(line) );

        return appliance;
    }

    private static Map<String, Object> optionsFromString(String line) {
        Map<String, Object> options = new LinkedHashMap<>();
        String category = categoryFromString(line);
        String optionsLine = line.replaceFirst(category + "\\W*", "");
        for(String option : optionsLine.split(",")) {
            String[] key_value = option.split("=");
            options.put(key_value[0].trim(), key_value[1].replaceAll(";", ""));
        }
        return options;
    }

    private static String categoryFromString(String line) {
        return line.split("\\W")[0];
    }
}
