package project2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Initiations {
	public static void array1() {
		// declares an Array of integers.
		int[] arr;

		// allocating memory for 5 integers.
		arr = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at index " + i + " : " + arr[i]);
	}
	public static void array2() {
        //Array Declaration
        int[] array;
        //Array Initialization
        array = new int[]{1,2,3,4,5};
        //Printing the elements of array
        for (int i =0;i < 5;i++)
        {
            System.out.println(array[i]);
        }
    }
	 public static void arrayList() {
	      ArrayList<Integer> myList = new ArrayList<Integer>();
	      myList.add(50);
	      myList.add(29);
	      myList.add(35);
	      myList.add(11);
	      myList.add(78);
	      myList.add(64);
	      myList.add(89);
	      myList.add(67);
	      System.out.println("Points\n"+ myList);
	      Collections.sort(myList);
	      System.out.println("Points (ascending order)\n"+ myList);
	   }
	 public static void arrayList2() {
	      ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(50,29,35,11,78,64,89,67));
	      System.out.println("Points\n"+ myList);
	      Collections.sort(myList);
	      System.out.println("Points (ascending order)\n"+ myList);
	   }
	 public static void list1() 
	    { 
	  
	        // Create an empty list 
	        List<Integer> list = new ArrayList<Integer>(); 
	  
	        // Instantiating list using Collections.addAll() 
	        Collections.addAll(list, 1, 2, 3, 4); 
	  
	        // Print the list 
	        System.out.println("List : " + list.toString()); 
	    } 

		public static void list()	    { 
	  
	        // For ArrayList 
	        List<Integer> list = new ArrayList<Integer>(); 
	        list.add(1); 
	        list.add(3); 
	        System.out.println("ArrayList : " + list.toString()); 
	  
	        // For LinkedList 
	        List<Integer> llist = new LinkedList<Integer>(); 
	        llist.add(2); 
	        llist.add(4); 
	        System.out.println("LinkedList : " + llist.toString()); 
	  
	        
	    } 
		public static void list2() 
	    { 
	  
	        // Creating the list 
	        List<Integer> list = Collections.unmodifiableList( 
	            Arrays.asList(1, 2, 3)); 
	  
	        // Print the list 
	        System.out.println("List : " + list.toString()); 
	    } 
		public static void list3() 
	    { 
	  
	        try { 
	            // Creating the list 
	            List<Integer> list = Collections.unmodifiableList( 
	                Arrays.asList(1, 2, 3)); 
	  
	            // Print the list 
	            System.out.println("List : " + list.toString()); 
	  
	            // Trying to modify the list 
	            System.out.println("Trying to modify the list"); 
	            list.set(0, list.get(0)); 
	        } 
	  
	        catch (Exception e) { 
	            System.out.println("Exception : " + e); 
	        } 
	    }
		public static void list4() 
	    { 
	  
	        // Creating the list 
	        List<Integer> list = Collections.singletonList(2); 
	  
	        // Print the list 
	        System.out.println("List : " + list.toString()); 
	        
	        List<Integer> unmodifiableList = List.of(1, 2, 3); 
	        
	        // Printing the List 
	        System.out.println("List : "
	                           + unmodifiableList.toString()); 
	    } 
		public static void list5() 
	    { 
	  
	        // Creating a List using Syntax 1 
	        List<Integer> list1 = Stream.of(1, 2, 3) 
	                                  .collect(Collectors.toList()); 
	  
	        // Printing the list 
	        System.out.println("List using Syntax 1: "
	                           + list1.toString()); 
	  
	        // Creating a List using Syntax 2 
	        List<Integer> list2 = Stream 
	                                  .of(3, 2, 1) 
	                                  .collect( 
	                                      Collectors 
	                                          .toCollection(ArrayList::new)); 
	  
	        // Printing the list 
	        System.out.println("List using Syntax 2: "
	                           + list2.toString()); 
	  
	        // Creating a List using Syntax 3 
	        List<Integer> list3 = Stream 
	                                  .of(1, 2, 3, 4) 
	                                  .collect( 
	                                      Collectors 
	                                          .collectingAndThen( 
	                                              Collectors.toList(), 
	                                              Collections::unmodifiableList)); 
	  
	        // Printing the list 
	        System.out.println("List using Syntax 3: "
	                           + list3.toString()); 
	    } 
		public static void set() {

		      List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		      //Scenario 1
		      Set<Integer> set1 = new HashSet<>(list);
		      System.out.println(set1);

		      //Scenario 2
		      Set<Integer> set2 = new HashSet<>(list);
		      Collections.addAll(set2, 1,2,3,4,5,6);
		      System.out.println(set2);

		      //Scenario 3
		      Set<Integer> set3 = Collections.unmodifiableSet(set2);
		      System.out.println(set3);

		      //Scenario 4
		      Set<Integer> set4 = new HashSet<>();
		      set4.add(1);set4.add(2);set4.add(3);
		      set4.add(4);set4.add(5);set4.add(6);
		      System.out.println(set4);
		   }
		public static void map(){  
			  Map<Integer,String> map=new HashMap<Integer,String>();  
			  map.put(100,"Amit");  
			  map.put(101,"Vijay");  
			  map.put(102,"Rahul");  
			  //Elements can traverse in any order  
			  for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
			 } 
		 public static void map1(){  
			 Map<Integer,String> map=new HashMap<Integer,String>();          
			       map.put(100,"Amit");    
			       map.put(101,"Vijay");    
			       map.put(102,"Rahul");   
			       //Returns a Set view of the mappings contained in this map        
			       map.entrySet()  
			       //Returns a sequential Stream with this collection as its source  
			       .stream()  
			       //Sorted according to the provided Comparator  
			       .sorted(Map.Entry.comparingByKey())  
			       //Performs an action for each element of this stream  
			       .forEach(System.out::println);  
			  } 
		 public static void map2(){  
			 Map<Integer,String> map=new HashMap<Integer,String>();          
			       map.put(100,"Amit");    
			       map.put(101,"Vijay");    
			       map.put(102,"Rahul");    
			       //Returns a Set view of the mappings contained in this map    
			       map.entrySet()  
			       //Returns a sequential Stream with this collection as its source  
			       .stream()  
			       //Sorted according to the provided Comparator  
			       .sorted(Map.Entry.comparingByValue())  
			       //Performs an action for each element of this stream  
			       .forEach(System.out::println);  
			  } 
		 public static void string() {
		        
		        String str1 ;
		        str1 = new String("C Programming");
		        String str2 = new String("C++ Programming");
		        String str3 = "Java Programming";
		        
		        System.out.println(str1);
		        System.out.println(str2);
		        System.out.println(str3);
		    }

	public static void main(String[] args) {
		array1();
		array2();
        arrayList();
        arrayList2();
        list();
        list1();
        list2();
        list3();
        list4();
        list5();
        set();
        map();
        map1();
        map2();
        string();
	}

}

OUTPUT:
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
1
2
3
4
5
Points
[50, 29, 35, 11, 78, 64, 89, 67]
Points (ascending order)
[11, 29, 35, 50, 64, 67, 78, 89]
Points
[50, 29, 35, 11, 78, 64, 89, 67]
Points (ascending order)
[11, 29, 35, 50, 64, 67, 78, 89]
ArrayList : [1, 3]
LinkedList : [2, 4]
List : [1, 2, 3, 4]
List : [1, 2, 3]
List : [1, 2, 3]
Trying to modify the list
Exception : java.lang.UnsupportedOperationException
List : [2]
List : [1, 2, 3]
List using Syntax 1: [1, 2, 3]
List using Syntax 2: [3, 2, 1]
List using Syntax 3: [1, 2, 3, 4]
[1, 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
100 Amit
101 Vijay
102 Rahul
100=Amit
101=Vijay
102=Rahul
100=Amit
102=Rahul
101=Vijay
C Programming
C++ Programming
Java Programming
