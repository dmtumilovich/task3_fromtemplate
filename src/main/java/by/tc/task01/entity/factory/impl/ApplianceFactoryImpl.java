package by.tc.task01.entity.factory.impl;

import by.tc.task01.entity.*;
import by.tc.task01.entity.factory.ApplianceFactory;

public class ApplianceFactoryImpl implements ApplianceFactory {

    @Override
    public Appliance createAppliance(String type) {
        switch (type) {
            case "Laptop":
                return new Laptop();
            case "Oven":
                return new Oven();
            case "Refrigerator":
                return new Refrigerator();
            case "Speakers":
                return new Speakers();
            case "TabletPC":
                return new TabletPC();
            case "VacuumCleaner":
                return new VacuumCleaner();

                default:
                    return null;
        }
    }
}
