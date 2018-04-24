package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.factory.ApplianceFactory;
import by.tc.task01.entity.factory.impl.ApplianceFactoryImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO{

	private static final String FILE_NAME = "appliances_db.txt";

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria) throws IOException {

		List<Appliance> matches = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
		ApplianceFactory applianceFactory = new ApplianceFactoryImpl();

		String line;
		while((line = reader.readLine()) != null) {

			ApplianceMatcher<E> applianceMatcher = new ApplianceMatcher<>(line, criteria);
			if(applianceMatcher.checkCategoryAndCriteria()) {
				Class<E> type = criteria.getGroupSearchName();
				Appliance appliance = applianceFactory.createAppliance(type);
				appliance.setOptions(optionsFromString(line));
				matches.add(appliance);
			}

		}

		return matches;
	}


	public static Map<String, Object> optionsFromString(String line) {
		Map<String, Object> options = new LinkedHashMap<>();
		String category = line.split("\\W")[0];
		String optionsLine = line.replaceFirst(category + "\\W*", "");
		for(String option : optionsLine.split(",")) {
			String[] key_value = option.split("=");
			options.put(key_value[0].trim(), key_value[1].replaceAll(";", ""));
		}
		return options;
	}
}


//you may add your own new classes