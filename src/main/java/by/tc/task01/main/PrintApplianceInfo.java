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
			print(appliance);
		}
		System.out.println();
	}

	public static void print(Appliance appliance) {
		String applianceInfo = makeString(appliance);
		System.out.println(applianceInfo);
	}

	public static String makeString(Appliance appliance) {
		StringBuilder builder = new StringBuilder();

		String category = appliance.getCategory();
		builder.append(category).append(": ");

		Set<Map.Entry<String, Object>> options = appliance.getOptions().entrySet();

		Iterator<Map.Entry<String, Object>> iterator = options.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Object> entry = iterator.next();
			String optionKey = entry.getKey();
			Object optionValue = entry.getValue();
			builder.append(optionKey).append("=").append(optionValue).append("  ");
		}
		return builder.toString();
	}

}
