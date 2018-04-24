package by.tc.task01.entity;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Appliance {
    protected Map<String, Object> options;

	public String getCategory() {
	    return this.getClass().getSimpleName();
    }

	public Map<String, Object> getOptions() {
	    return options;
    }

	public void setOptions(Map<String, Object> options) {
	    this.options = options;
    }

}
