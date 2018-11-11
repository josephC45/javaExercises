
import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/*
 * Instructor: Anirban Ghosh
 * @author: Joseph Curto
 * Course: COP2551
 * Homework 10
 */

public class BinPacking {
		private int contName;
		private int capacity;
		private int currentSize;
		
		
		public BinPacking(int capacity) {
			this.capacity = capacity;
			this.objects = new ArrayList<Integer>();
			
		}
	//Suppose to add the weight of the objects to the overall size.
		public boolean contain(Integer objects) {
			if(this.currentSize + objects > this.capacity) return false;
			
			this.objects.add(objects);
			this.currentSize += objects;
			
			
			return true;
		}
	//Data fields used throughout program
		private List<Integer> containers = new ArrayList<Integer>(Arrays.asList(0,0,0));
		private List<Integer> objects;
		private int contCapacity = 10;
		private int contCounter = 1;
	
	//Makes sure array doesn't exceed the size specified.
	public BinPacking(List<Integer> objects, int contCapacity) {
		this.objects = objects;
		this.contCapacity = contCapacity;
		this.containers = new ArrayList<>(this.objects.size());
	}
	

		/*This is where i struggled...
		 * This is where the weights the user specified were suppose to be put into separate containers.
		 * My boolean contain method kept saying that it was undefined for type integer.
		 */
		
		public void ContainerProb() {
		Collections.sort(this.objects, Collections.reverseOrder());
		
		if(this.objects.get(0) > this.contCapacity) {
			return;
		}
		this.containers.addAll((Collection<? extends Integer>) new BinPacking(contCounter,contCapacity));
		
		 
		for (Integer currentObject : objects) {
			
			boolean Ok = false;
			int currentCont = 0;
			
			while(!Ok) {
				if(currentCont == this.containers.size()) {
					Integer newCont = new containers <Integer> (++contCounter,contCapacity);
					 newCont.contain(currentObject);
					this.containers.add(newCont);
					Ok = true;
					
				}
				else if(this.containers.get(currentCont).contain(currentObject)) {
					Ok = true;
				}
					else {
					currentCont++;
				}
			}
		}
	}
		
	public void showResults() {
		for (Integer container : this.containers) {
			System.out.println(container);
		}
	}
			
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of objects: ");
		int obj = scanner.nextInt();
		
		System.out.println("Enter the weights of the objects: ");
		int [] weight = new int[obj];
		for (int i = 0; i < obj; i++) {
			weight[0] = scanner.nextInt();
			
			}
			scanner.close();
		}
}
/*
 * 								Work Cited:
 * Bin packing implementation: “chap5._.2 Bin Packing Problem Implementation.” YouTube, YouTube,
   31 Mar. 2017, www.youtube.com/watch?v=uDdMuUWf6h4.
 */

		
		
			
		
	
	
	
