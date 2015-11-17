package opgave1;

import java.util.ArrayList;

public class BagWithoutRepetitions implements Bag {
	
	public ArrayList<String> BagWithoutRepetitions = new ArrayList<String>();
	public boolean addString(String str) {
		
		// TODO not tested
		// This did include all errors we can encounter?
		try {
			if (BagWithoutRepetitions.contains(str)) {
				return false;
			}
			BagWithoutRepetitions.add(str);
			// Double check!
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean removeAllOccurrences(String str) {
		 boolean Checker = false;
		 
		 for (int i = 0;BagWithoutRepetitions.size() > i;i++) {
			 if (BagWithoutRepetitions.get(i) == str) {
				 Checker = true;
				// TODO Not tested
				 BagWithoutRepetitions.remove(i);
			 }
		 }
		 
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
			if (BagWithoutRepetitions.size() > index && index >= 0) {
				return BagWithoutRepetitions.get(index);
			}
			else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}

	public int noOfElements() {
		return BagWithoutRepetitions.size();
	}
	
}
