package Sorting;
// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create, fill,
// sort, and search in a list of integers.
//          
// ****************************************************************
public class IntegerList{

    int[] list; //values in the list

    //-------------------------------------------------------
    //create a list of the given size
    //creates a new list of size elements. Elements are initialized to 0.
    //-------------------------------------------------------
    public IntegerList(int size)
    {
    list = new int[size];
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
    for (int i=0; i<list.length; i++)
        list[i] = (int)(Math.random() * 100) + 1;
    }


    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
    for (int i=0; i<list.length; i++)
        System.out.println(i + ":\t" + list[i]);
    }


    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target)
    {
    int location = -1;
    for (int i=0; i<list.length && location == -1; i++)
        if (list[i] == target)
        location = i;
    return location;
    }


    //-------------------------------------------------------
    //sort the list into ascending order using the selection sort algorithm
    //-------------------------------------------------------
    public void selectionSort()
    {
    int minIndex;
    for (int i=0; i < list.length-1; i++)
        {
        //find smallest element in list starting at location i
        minIndex = i;
        for (int j = i+1; j < list.length; j++)
            if (list[j] < list[minIndex])
                minIndex = j;

        //swap list[i] with smallest element
        int temp = list[i];
        list[i] = list[minIndex];
        list[minIndex] = temp;
        }
    }

    //-------------------------------------------------------
    //replaces the first occurrence of oldVal in the list with newVal. 
    //-------------------------------------------------------
    public void replaceFirst(int oldVal, int newVal)
    {
     int location = -1 ;
     location = search(oldVal);
     if (location == -1 )
         System.out.println("This Value does not exist, value not Replaced");
     else
         list[location] = newVal;
    }
   
    //-------------------------------------------------------
    //replaces all occurrences of oldVal in the list with newVal
    //-------------------------------------------------------
    public void replaceAll(int oldVal, int newVal)
    {
    int location = -1;
	for (int i=0; i<list.length; i++)
	   {
	       if (list[i] == oldVal)
	       {
	           location = i;
	           list[location] = newVal;
	       }
	   }
    }

    //-------------------------------------------------------
    // sorts the list into decreasing (instead of increasing) order
    //-------------------------------------------------------
    public void sortDecreasing()
    {
    int maxIndex;
    for (int i=0; i < list.length-1; i++)
        {
        //find highest element in list starting at location i
        maxIndex = i;
        for (int j = i+1; j < list.length; j++)
            if (list[j] > list[maxIndex])
                maxIndex = j;

        //swap list[i] with Highest element
        int temp = list[i];
        list[i] = list[maxIndex];
        list[maxIndex] = temp;
        }
    }

    //-------------------------------------------------------
    // uses a binary search to find the target assuming the list is sorted in decreasing order. 
    //-------------------------------------------------------
    public int binarySearchD(int target)
    {
    int low, mid, high;
    low = 0;
    high = (list.length - 1);
    mid = (low + high) / 2;
    while (list[mid] != target && low <= high)
    {
        if (target < list[mid])
            low = mid + 1;
        else
            high = mid - 1;
            mid = (low + high) / 2;
    }
    if (list[mid] == target)
        return mid;
    else
        return -1;
    }
}