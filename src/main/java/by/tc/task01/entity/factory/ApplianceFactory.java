package by.tc.task01.entity.factory;

import by.tc.task01.entity.Appliance;

public interface ApplianceFactory {
    Appliance createAppliance(String type);
}
