package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceService {	
	
	<E> List<Appliance> find(Criteria<E> criteria) throws IOException;
	
}
