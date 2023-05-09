package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.ArrayList;
import java.util.List;

public class CategoryFilter extends FilterBase {

	private String exclude;
	public CategoryFilter(String exclude){
		this.exclude=exclude;
	}

	@Override
	protected Boolean include(Meal m) {
		return !m.getCategory().toLowerCase()
			.contains(exclude.toLowerCase());
	}
}
