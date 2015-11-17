package opgave1;

import java.util.ArrayList;
import java.util.Collections;

public class OrderedBag implements Bag {
	public ArrayList<String> OrderedBag = new ArrayList<String>();
	public boolean addString(String str) {
		
		// TODO not tested
		try {
			Collections.sort(OrderedBag);
			OrderedBag.add(str);
			
			// Since this is the sorting-bag. We need to sort it out.
			// Importing Collections to manage sorting it out.
			Collections.sort(OrderedBag);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean removeAllOccurrences(String str) {
		 boolean Checker = false;
		 
		 for (int i = 0;OrderedBag.size() > i;i++) {
			 if (OrderedBag.get(i) == str) {
				 Checker = true;
				// TODO Not tested
				 OrderedBag.remove(i);
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
			if (OrderedBag.size() > index && index >= 0) {
				return OrderedBag.get(index);
			}
			else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}

	public int noOfElements() {
		// Since there is no input, we don't need to check for errors
		return OrderedBag.size();
	}
}
