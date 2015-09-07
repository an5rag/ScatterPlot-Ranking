package core;

import database.*;
import dataloader.DataLoader;

public class Controller {
	DataLoader dataLoader;
    DataStore dataStore;
    ScatterPlotIndex xIndex;
    ScatterPlotIndex yIndex;
    
	//Sets up datastore, indexes the points
    void setup(){
    	
    	// Load data and gets datastore
    	dataStore = new DataStore();
//    	dataLoader = new DataLoader(dataStore, 1); // load by Hard-coding
    	dataLoader = new DataLoader(dataStore, 1); //load by random test data
    	
        // Index
    	xIndex = new ScatterPlotIndex(dataStore, 0);
    	yIndex = new ScatterPlotIndex(dataStore, 1);    	 
    	
    }
    
    
    // Takes userInput and performs the main logic 
	public void getScatterPlots(Rectangle[] userInput, boolean printWorking){
		
		// Initialize scatterPlotRank
    	ScatterPlotRank scatterPlotRank = new ScatterPlotRank(xIndex, yIndex, userInput, dataStore);
    	
    	// Call logic function in scatterPlotRank
    	scatterPlotRank.ranking(true);
    	
		// Print Results.
    	scatterPlotRank.printRanking();
	}	
	
	
	public static void main(String[] args) {
		
		//will be used to check how much time the code took
		long startTime = System.nanoTime();
		
		//CODE BEGINS HERE
		
		Controller c = new Controller();
		// It first setups
		c.setup();
		
		// FOR TESTING
		
		// Passes User input1
		Rectangle[] userInput = new Rectangle[2];
		userInput[0] = new Rectangle();
		userInput[0].inputCoordinates();
		c.getScatterPlots(userInput,true);
		
		
		
		//CODE ENDS HERE
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
		
	}
	
	
	
}
