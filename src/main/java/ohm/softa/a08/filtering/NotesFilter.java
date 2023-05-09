package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.ArrayList;
import java.util.List;

public class NotesFilter extends FilterBase {

	String exclude;
	NotesFilter(String exclude){
		this.exclude=exclude;
	}

	@Override
	protected Boolean include(Meal m) {
		for(String note:m.getNotes())
			if(note.toLowerCase().contains(exclude.toLowerCase()))
				return false;
		return true;
	}
}
