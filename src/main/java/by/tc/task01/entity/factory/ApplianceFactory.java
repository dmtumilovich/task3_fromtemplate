package by.tc.task01.entity.factory;

import by.tc.task01.entity.Appliance;

import java.util.Map;

public interface ApplianceFactory {
    Appliance createAppliance(String type, Map<String, Object> options);
}
