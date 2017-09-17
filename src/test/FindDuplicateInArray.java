package test;

public class FindDuplicateInArray {

	public static void main(String[] args) {

		Integer array[] = {1,2,3,4,5};
		int duplicate = findDuplicateByHashing(array);
		if(duplicate == -1){
			System.out.println("No duplicates in " + arrayToString(array));
		} else {
			System.out.println(duplicate + " is duplicated in " + arrayToString(array));
		}
	}

	private static int findDuplicateByHashing(Integer array[]){
		
		boolean[] visited = new boolean[array.length + 1]; 
		
		for(int count = 0; count < array.length; count++){
			
			if(visited[array[count]])
				return array[count];
			visited[array[count]] = true;
		}
		
		return -1;
	}
	
	private static String arrayToString(Object[] array){
		
		StringBuilder output = new StringBuilder("");
		
		for(int count = 0; count < array.length; count++){
			
			output.append(array[count].toString());
		}
		
		return output.toString();
	}
}
