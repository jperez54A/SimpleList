
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
			count +=1;
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
			count +=1;
		}
	}
		
		public void remove(int numbToRemove) {
			//check to see if the array is of size necessary
			//create temp list to use later
			double arraySize = (double)count/(double)list.length;
			int tempList[];
			int arrayIndx = 0;
			
			// part one finding the element in the array
			for(int i =0; i<=list.length; i++) {
				if(list[i] == numbToRemove) {
					arrayIndx = i;
				}
			}
			if (arrayIndx > 0){
				//remove element 
				//using another for loop shift element
				for(int i = arrayIndx; i<=count; i++ ) {
					list[i]=list[i+1];
				}
				count -=1;
			}
			
			
			//check size 
			while(arraySize < .75) {
				tempList = new int[list.length -1];
				//filling the temp list in order to resize it correctly
				for(int i = 0; i <= list.length-1; i++){
					tempList[i]=list[i];
				}
				list = new int[list.length-1];
				
				// filling up the array
				for(int i = 0; i <= list.length-1; i++){
					list[i]=tempList[i];
				}
				//calculating the size again to check once again
				arraySize = (double)count/(double)list.length;
			
			}	
		}
		public void append(int numbToAppend) {
			//make temp list so that we can transfer values correctly
			int tempList[] = new int[list.length];
			if (count == list.length) {
				
				// for loop to populate the temp list 
				for (int i = 0; i<= list.length; i++) {
					tempList[i]= list[i];
				}
				//resizing by 50%
				int tempsize = list.length + ((list.length)/2);
				list = new int[tempsize];
				
				//filling up the array
				for(int i = 0; i<= count; i++) {
					list[i] = tempList[i];
				}
				
				
				//editing we must put the number entered into the next empty space
				list[count+1] = numbToAppend;
				//increment the number of values of whats in the array
				count +=1;
			
			}
		}
		public int first() {
			int temp = 0;
			if (count > 0) {
				temp = list[0];
			}
			else if (count == 0) {
				temp = -1;
			}
			return temp;
		}
		
		public int last() {
			int temp = 0;
			if (count > 0) {
				temp = list[count];
			}
			else if (count == 0) {
				temp = -1;
			}
			return temp;
		}
		public int size() {
			return count;
		}
		
			
			
		}