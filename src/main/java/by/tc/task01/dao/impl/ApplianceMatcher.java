package by.tc.task01.dao.impl;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceMatcher<E> {
    private String currentLine;
    private Criteria<E> criteria;

    public ApplianceMatcher(String line, Criteria<E> criteria) {
        currentLine = line;
        this.criteria = criteria;
    }

    //подобрать норм названия методам
    public boolean checkCategoryAndCriteria() {
        if( !checkCategory() ) {
            return false;
        }

        int numberOfMatches = checkCriteria();
        int numberOfCriteria = criteria.getCriteria().size();
        return numberOfMatches == numberOfCriteria;
    }

    private int checkCriteria() {

        int numberOfMatches = 0;
        Set<Map.Entry<E, Object>> criteriaEntry = criteria.getCriteria().entrySet();
        Iterator<Map.Entry<E, Object>> iterator = criteriaEntry.iterator();

        while (iterator.hasNext()) {
            Map.Entry<E, Object> criterion = iterator.next();
            if (checkCriterion(criterion)) {
                numberOfMatches++;
            }
            else break;
        }

        return numberOfMatches;
    }

    private boolean checkCategory() {
        String category = criteria.getGroupSearchName().getSimpleName();
        Matcher matcher = Pattern.compile(category).matcher(currentLine);
        return matcher.find();
    }

    private boolean checkCriterion(Map.Entry<E, Object> criterion) {
        String query = criterion.getKey().toString() + "=" + criterion.getValue();
        Matcher matcher = Pattern.compile(query).matcher(currentLine);
        return matcher.find();
    }
}
