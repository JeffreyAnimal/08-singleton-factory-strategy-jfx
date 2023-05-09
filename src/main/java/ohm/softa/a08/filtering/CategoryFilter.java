package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.ArrayList;
import java.util.List;

public class CategoryFilter extends FilterBase {
	@Override
	public List<Meal> filter(List<Meal> meals) {
		List<Meal> filtered=new ArrayList<Meal>();
		for(Meal m  :meals){
			if(super.include(m))
				filtered.add(m);

		}
		return filtered;
	}
}
