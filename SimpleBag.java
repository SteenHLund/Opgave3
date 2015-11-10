package opgave1;


import java.util.ArrayList;


public class SimpleBag implements Bag {
	
	public ArrayList<String> SimpleBag = new ArrayList<String>();
	public boolean addString(String str) {
		
		// TODO not tested
		try {
			SimpleBag.add(str);
			 // Is there anything else to check?
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean removeAllOccurrences(String str) {
		 ArrayList<String> CheckBag = new ArrayList<String>();
		 boolean Checker = false;
		 
		 for (int i = 0;SimpleBag.size() <= i;i++) {
			 if (CheckBag.contains(SimpleBag.get(i).toLowerCase())) {
				 // found duplicate!
				 Checker = true;
				 // TODO Not tested
				 SimpleBag.remove(i);
			 }
			 else {
				 CheckBag.add(SimpleBag.get(i));
			 }
		 }
		 if (Checker) {
			 return true;
		 }
		 else {
		 // No duplicate found... (no actions required?)
			 return false;
		 }
	}

	public String getString(int index) {
		
		return null;
	}

	public int noOfElements() {
		
		return 0;
	}
	
}
