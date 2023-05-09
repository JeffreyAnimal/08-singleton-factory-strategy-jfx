package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

public class VegetarianFilter extends FilterBase{
	@Override
	protected Boolean include(Meal m) {
		return m.isVegetarian();
	}
}
