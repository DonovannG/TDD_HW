import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.*;

public class Tests {
	/*
    We need to get the size of the list
    We need to clear the list
    We need to add Items
    We need to be able to check if an item exists
    We need to get elements by index
    We need to search the index of an object
    We need to remove an item by index*/
	
    @Test
    public void getSizeOfList() {
        // we instatiate a integer list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // we get the size of the list
        assertEquals(4, list.size());
    }
    
    @Test
    public void getSizeOfListEmpty() {
        // an empty list is intantiated
        List<Integer> list = new ArrayList<>();

        //we check that the size is indded 0 as it is empty 
        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {
        // a null list is instantiated
        List<Integer> list = null;

        // by trying to do an opertaion of this list we should get a null pointer exceptio
        list.size();
    }

    @Test
    public void getSizeOfListWhenRemovingElements() {
        // a integer list is instantiated
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // we can check the before and after size when removing an element
        assertEquals(4, list.size());
        list.remove(1);
        assertEquals(3, list.size());
    }

    // Unit testing for clearing the list
    @Test
    public void getSizeOfListClear() {
        //an integer list is instantiated and the cleared
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.clear();

        // by checking the new size, we can conclude that the list was cleared
        assertEquals(0, list.size());
    }
    
    public void clearListEmpty() {
        // We instantiante a empty list
        List<Integer> list = new ArrayList<>();
        
        //By checking the size before and after clearin the empty list, we see that it stays the same
        assertEquals(0, list.size());
        list.clear();
        assertEquals(0, list.size());
    }
    
    @Test(expected = NullPointerException.class)
    public void clearListNull() {
        // We instantiate a null list and then clear it
        List<Integer> list = null;
        
        //by trying to clear an empty list we should get an error, proving that the list is indeed null
        list.clear();

    }
    
    //add Items
    @Test
    public void addIntList() {
        //An Integer list is instantiated and then an int is added, then well check if the list has an element
        List<Integer> list = new ArrayList<>();
        list.add(1);

        //by asserting that the list isnt null, we conclude that an element was added
        assertNotNull(list);
    }    
    
    @Test
    public void addStrList() {
        // A String list is instantiated and then an String is added, then well check if the list has an element
        List<String> list = new ArrayList<>();
        list.add("q");

        //by asserting that the list isnt null, is concluded that the string was added sucessfully
        assertNotNull(list);
    }    
    
    @Test
    public void addDoubleList() {
        // Inicialización/escenario
        List<Double> list = new ArrayList<>();
        list.add(59.69);

        // ¿qué es lo que queremos probar?
        assertNotNull(list);
    } 
    //check if an item exists
    
    @Test
    public void checkAnElementExist() {
        // We instantiate an int list and the add a element
        List<Integer> list = new ArrayList<>();
        list.add(1);



        //by asserting that the number is over -1 we conlude that a number exist in the list
        assertTrue(list.get(0)>-1);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void checkNonExistentElement() {
        // An empty int list is instantiated
        List<Integer> list = new ArrayList<>();
        //by realizing that the position is out of bounds we conclude that de index is empty
        assertFalse(list.get(0)==1);
    }

    
    @Test(expected = NullPointerException.class)
    public void checkElementNullList() {
        //A null list is instantiated
        List<Integer> list = null;

        //By realizing the null pointer exception,, we conclude that the index is null
        assertFalse(list.get(0)==1);
    }
    
    //getElementsByIndex
    
    @Test
    public void checkAnElementIndex() {
        // We instantiate a list with some elements and an int with an arbitrary value
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int i = 0;

        //by asserting that the element in the index isnt -1, we conclude that there is an element in the index
        assertTrue(list.get(i)!=-1);
    }
   
    @Test(expected = IndexOutOfBoundsException.class)
    public void checkIfElementIsInIndex() {
        //An empty list and an arbitrary int are instantiated
        List<Integer> list = new ArrayList<>();
        int i = 0;

        //by asseting that this results in and index out if bounds, we realize that the list is empty by cheking an index
        assertFalse(list.get(i)!=-1);
    }
    
    @Test(expected = NullPointerException.class)
    public void checkIndexNullList() {
        //A null list and an arbitrary int are instantiated
        List<Integer> list = null;
        int i = 0;

        //By asserting the null pointer exception, we conclude thta the list is null by checking the index
        assertTrue(list.get(i)==null);
    }
    
    
    //search the index of an object
    @Test
    public void searchAnElementIndex() {
       //A integer list is instantiated
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        // by not being -1 the index of 1 exists
        assertTrue(list.indexOf(1)!=-1);
    }
   
    @Test
    public void searchIndexInEmptyList() {
        // an empty list is instantiated
        List<Integer> list = new ArrayList<>();
   

        //As the result is minus one, then the object doesnt exist and has no index
        assertTrue(list.indexOf(1)==-1);
    }
    
    @Test(expected = NullPointerException.class)
    public void searchIndexNullList() {
        // a null list is instantiated
        List<Integer> list = null;
        

        //a null pointer exception proves that there isn an index to search for
        assertTrue(list.indexOf(1)==-1);
    }
    
  //remove an item by index
    @Test
    public void removeElementbyIndex() {
        //An list of integers is initialized with some elements
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        
        //We check the size and then we eliminate the element 1 by its index and the we check the new size
        assertEquals(4, list.size());
        list.remove(list.indexOf(1));
        assertEquals(3, list.size());

    }
   
    @Test
    public void removeIndexInEmptyList() {
        // an empty list is instantiated 
        List<Integer> list = new ArrayList<>();
        //we check the size of the empty list and then try to eliminate an index but there isnt any, so the list size stay the same
        assertEquals(0, list.size());
        list.remove(list.indexOf(1));
        assertEquals(0, list.size());
    }
    
    @Test(expected = NullPointerException.class)
    public void removeIndexNullList() {
        //  a null list is instantiated
        List<Integer> list = null;
        

        // any attemps to remove something from this list should result in null pointer exception
        list.remove(list.indexOf(1));
    }

}
