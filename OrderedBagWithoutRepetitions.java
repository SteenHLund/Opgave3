package opgave1;

import java.util.ArrayList;
import java.util.Collections;

public class OrderedBagWithoutRepetitions implements Bag {
	public ArrayList<String> OrderedBagWithoutRepetitions = new ArrayList<String>();
	public boolean addString(String str) {
		
		// TODO not tested
		try {
			Collections.sort(OrderedBagWithoutRepetitions);
			if (OrderedBagWithoutRepetitions.contains(str)) {
				return false;
			}
			OrderedBagWithoutRepetitions.add(str);
			
			
			// Since this is the sorting-bag. We need to sort it out.
			// Importing Collections to manage sorting it out.
			Collections.sort(OrderedBagWithoutRepetitions);
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean removeAllOccurrences(String str) {
		 boolean Checker = false;

		 for (int i = 0;OrderedBagWithoutRepetitions.size() > i;i++) {
			 if (OrderedBagWithoutRepetitions.get(i) == str) {
				 Checker = true;
				// TODO Not tested
				 OrderedBagWithoutRepetitions.remove(i);
			 }
		 }
		 
		 // This below here is for targeting all items without the need of an input
//		 ArrayList<String> CheckBag = new ArrayList<String>();
//		 
//		 for (int i = 0;BagWithoutRepetitions.size() <= i;i++) {
//			 if (CheckBag.contains(BagWithoutRepetitions.get(i).toLowerCase())) {
//				 // found duplicate!
//				 Checker = true;
//				 // TODO Not tested
//				 BagWithoutRepetitions.remove(i);
//			 }
//			 else {
//				 CheckBag.add(BagWithoutRepetitions.get(i));
//			 }
//		 }
		 
		 if (Checker) {
			 return true;
		 }
		 else {
			 // No duplicate found... (no actions required?)
			 return false;
		 }
	}

	public String getString(int index) {
		try {
			if (OrderedBagWithoutRepetitions.size() > index && index >= 0) {
				return OrderedBagWithoutRepetitions.get(index);
			}
			else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}

	public int noOfElements() {
		return OrderedBagWithoutRepetitions.size();
	}
}
