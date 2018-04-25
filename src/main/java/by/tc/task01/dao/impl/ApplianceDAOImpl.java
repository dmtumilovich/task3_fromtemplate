package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceConverter;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.FileChecker;
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

	private static final String FILE_NAME = "src/main/resources/appliances_db.txt";

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria) throws IOException {

        FileChecker fileCheckerForAppliances = new FileChecker(FILE_NAME);

        List<String> matchingStrings = fileCheckerForAppliances.getStringsWithCriteria(criteria);
        List<Appliance> matches = ApplianceConverter.fromStringList(matchingStrings);

		return matches;
	}
}