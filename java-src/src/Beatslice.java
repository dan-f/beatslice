import java.util.ArrayList;
import java.util.Random;

import com.cycling74.max.Atom;
import com.cycling74.max.MaxObject;

public class Beatslice extends MaxObject {
	private ArrayList<Atom> list;
	Random ronald;
	
	public Beatslice() {
		declareIO(1, 1); // inlet takes list of ints, outlet chooses one of the non-zero ints
		list = new ArrayList<Atom>();
		ronald = new Random();
	}
	
	public void list(Atom content[]) {
		list.clear(); // clear the list
		for (int i = 0; i < content.length; i++) {
			if (content[i].getInt() > 0) { // only add positive non-zero values to our list
				list.add(content[i]);
			}
		}
		
		// choose a random element from the list, and spit it out
		if (!list.isEmpty()) {
			int r = ronald.nextInt(list.size());
			outlet(0, list.get(r).getInt()-1);
		} else {
			outlet(0, 0);
		}
	}
	
	public void bang() {
		if (!list.isEmpty()) {
			int r = ronald.nextInt(list.size());
			outlet(0, list.get(r).getInt()-1);
		} else {
			outlet(0, 0);
		}
	}
}