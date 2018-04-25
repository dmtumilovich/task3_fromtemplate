package by.tc.task01.dao;

import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileChecker {
    private BufferedReader reader;

    public FileChecker(String filepath) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(filepath));
    }

    public <E> List<String> getStringsWithCriteria(Criteria<E> criteria) throws IOException {
        List<String> matchingStrings = new ArrayList<>();
        String line;
        while((line = reader.readLine()) != null) {
            if(checkStringWithCriteria(line, criteria))
                matchingStrings.add(line);
        }
        return matchingStrings;
    }

    private <E> boolean checkStringWithCriteria(String string, Criteria<E> criteria) {
        ApplianceMatcher<E> applianceMatcher = new ApplianceMatcher<>(string, criteria);
        if(applianceMatcher.checkCategoryAndCriteria())
            return true;
        return false;
    }

}
