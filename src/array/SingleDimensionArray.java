package array;

public class SingleDimensionArray {
     int arr [] = null ;
     
     //constructor
     public SingleDimensionArray(int sizeOfArray) {
    	 arr = new int [sizeOfArray];
    	 for(int i=0;i<sizeOfArray;i++) {
    		 arr[i]=Integer.MIN_VALUE;
    	 }
     }

     // print the array
     public void traverseArray() {
    	 try {
    		 for(int i =0;i<arr.length;i++) {
    			 System.out.println(arr[i] + " ");
    		 }
    		 
    	 }catch(Exception exc){
    		 System.out.println("Array no longer exists !! ");
    	 }
     }

     // insert value in the array
     public void insert(int location,int valueToBeInserted) {
    	 try {
    		 if(arr[location] == Integer.MIN_VALUE) {
    			 arr[location] = valueToBeInserted;
    			 System.out.println("Successfully Inserted " + valueToBeInserted +" at Location " + location);
    		 }else {
    			 System.out.println("This cell is already occupied by another value.");
    		 }
    		 
    	 }catch(ArrayIndexOutOfBoundsException exc) {
    		 System.out.println("Invalid index to access array !");
    	 }
     }

      // access a particular element in array
     public void accessingCell(int cellNumber) {

    	 try {
    		 System.out.println(arr[cellNumber]);
    	 }catch(ArrayIndexOutOfBoundsException exc) {
    		 System.out.println("Invalid index to access Array");
    	 }
     }


   //Search for an element in the given Array
  	public void searchInAnArray(int valueToSearch) {
 		for (int i = 0; i < arr.length; i++) {
 			if (arr[i] == valueToSearch) {
 				System.out.println("Value found !");
 				System.out.println("Index of " + valueToSearch + " is: " + i);
 				return;
 			}
 		}
 		System.out.println(valueToSearch + " is not found!!");
 	}

 	//Delete value from given Array
 		public void deleteValueFromArray(int deleteValueFromThisCell) {
 			try {
 				arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
 			} catch (ArrayIndexOutOfBoundsException e) {
 				System.out.println();
 				System.out.println("Cant delete the value as cell# provided is not in the range of array !");
 			
 			}
 		}

 	//Delete the entire Array
    	public void deleteThisArray() {
 			arr = null;
 			System.out.println("Array has been succefully deleted");
 		}

} // end of class
