package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Appliance> result;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteria = new Criteria(null);
		criteria.add(Oven.CAPACITY, 33);
		result = service.find(criteria);

		PrintApplianceInfo.print(result);

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>(Oven.class);
		criteriaOven.add(Oven.CAPACITY, 33);


		result = service.find(criteriaOven);

		PrintApplianceInfo.print(result);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>(Oven.class);
		criteriaOven.add(Oven.HEIGHT, 200);
		criteriaOven.add(Oven.DEPTH, 300);

		result = service.find(criteriaOven);

		PrintApplianceInfo.print(result);

		//////////////////////////////////////////////////////////////////
		
		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>(TabletPC.class);
		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 4);

		result = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(result);

		//////////////////////////////////////////////////////////////////

		Criteria<Speakers> criteriaSpeakers = new Criteria<>(Speakers.class);
		criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS, 3);
		criteriaSpeakers.add(Speakers.CORD_LENGTH, 3);

		result = service.find(criteriaSpeakers);

		PrintApplianceInfo.print(result);

	}

}
