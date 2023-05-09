package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

public abstract class MealsFilterFactory {
	public static MealsFilter getStrategy(String key){
		switch (key.toLowerCase()){
			case "no soy":
				return new NotesFilter("mit Soja");

			case "no pork":
				return new CategoryFilter("Schwein");

			case "vegetarian":
				return new VegetarianFilter();

			case "all":
				return new NoFilter();

			default:
				throw new IllegalStateException(String.format("No Matching key found for %S key",key));
		}
	}

//	//public static MealsFilter getStrategy(){
//		return new NoFilter();
//	}
}
