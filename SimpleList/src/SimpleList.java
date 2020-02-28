
public class SimpleList {

	private int list[];
	private int count;

	public SimpleList(){
		count = 0 ;
		list = new int[10];
	}
	public void add(int numbToAdd) {
		//make temp list so that we can transfer values correctly
		int tempList[] = new int[list.length];

		if (list.length == count) {

			// for loop to populate the temp list 
			for (int i = 0; i<= list.length; i++) {
				tempList[i]= list[i];
			}
			//resizing by 50%
			int tempsize = list.length + ((list.length)/2);
			list = new int[tempsize];
			
			//filling up the array
			//first we must put the number entered in the first element of the array
			list[0] = numbToAdd;
			
			for(int i = 1; i<= count; i++) {
				list[i] = tempList[i-1];
			}
		}
		else if(list.length < count ) {
			// for loop to populate the temp list 
			for (int i = 0; i<= list.length; i++) {
				tempList[i]= list[i];
			}
			
			//filling up the array
			//first we must put the number entered in the first element of the array
			list[0] = numbToAdd;
			
			for(int i = 1; i<= count; i++) {
				list[i] = tempList[i-1];
			}
		}
	}
		
		public void remove(int numbToRemove) {
			//for loop to traverse and check to see if the element is in the array
			for(int i = 0; i<= count; i++) {
				//if found remove depending if it is more than 25% full
				if(list[i] == numbToRemove) {
				
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

