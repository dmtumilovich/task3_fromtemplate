package by.tc.task01.entity.factory.impl;

import by.tc.task01.entity.*;
import by.tc.task01.entity.factory.ApplianceFactory;

import java.util.Map;

public class ApplianceFactoryImpl implements ApplianceFactory {

    @Override
    public Appliance createAppliance(String type, Map<String, Object> options) {
        switch (type) {
            case "Laptop":
                return new Laptop(options);
            case "Oven":
                return new Oven(options);
            case "Refrigerator":
                return new Refrigerator(options);
            case "Speakers":
                return new Speakers(options);
            case "TabletPC":
                return new TabletPC(options);
            case "VacuumCleaner":
                return new VacuumCleaner(options);

                default:
                    return null;
        }
    }
}
