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
		popupDisplay = new ListsViewer arrayDisplay;
	}
	
	public void start()
	{
		firstWords.add("adfasfsadfjsdlkfjdl;kfjsdak;ls");
		firstWords.add("babababababaababab");
		displayList();
	}
	
	private void displayList()
	{
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The contents at " + spot + "are " + firstWords.get(spot));
		}
	}
}
