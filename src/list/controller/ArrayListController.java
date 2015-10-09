package list.controller;

import java.util.ArrayList;
import lists.view.ListsViewer;

public class ArrayListController 
{
	private ArrayList<String> firstWords;
	private ListsViewer popupDisplay;
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
		popupDisplay = new ListsViewer();
	}
	
	public void start()
	{
		firstWords.add("adfasfsadfjsdlkfjdl;kfjsdak;ls");
		firstWords.add("babababababaababab");
		firstWords.add(1, "Genius is the ability to reduce the complicate to the simple.");
		
		displayList();
		firstWords.set(2, "I am dying...");
		firstWords.remove(0);
		displayList();
		showOtherLoop();
	}
	
	private void displayList()
	{
		popupDisplay.showList("The size of the list is: " + firstWords.size());
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The contents at " + spot + " are " + firstWords.get(spot));
		}
	}
		
	private void showOtherLoop()
	{
		for(String words : firstWords)
		{
			popupDisplay.showList(words);
		}
	
	}
}
