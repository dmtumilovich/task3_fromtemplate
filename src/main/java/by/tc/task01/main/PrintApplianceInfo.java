package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliances) {
		if(appliances.size() == 0) {
			System.out.println("No matches!\n");
			return;
		}

		for(Appliance appliance : appliances) {
			System.out.println(appliance);
		}
		System.out.println();
	}

}
