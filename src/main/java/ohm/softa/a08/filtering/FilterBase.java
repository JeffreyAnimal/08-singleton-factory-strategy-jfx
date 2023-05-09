package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.ArrayList;
import java.util.List;

public abstract class FilterBase implements MealsFilter {
	protected abstract Boolean include (Meal m);

	public List<Meal> filter(List<Meal> meals) {
		for(Meal m  :meals){
			if(!include(m))
				meals.remove(m);
		}
		return meals;
	}
}
