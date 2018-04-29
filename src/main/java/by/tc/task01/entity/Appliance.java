package by.tc.task01.entity;


public abstract class Appliance {

	public String getCategory() {
	    return this.getClass().getSimpleName();
    }
    public abstract String toString();

}
