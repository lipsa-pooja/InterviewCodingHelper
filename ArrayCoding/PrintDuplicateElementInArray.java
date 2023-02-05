package ArrayCoding;

//input={1,5,6,7,4,3,1,5,6,6,7}----->integerArray
//output={1,5,6,7}--------->duplicate element

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateElementInArray {
    public static void main(String[] args)
    {
        //int[] arr = {1, 5, 6, 7, 4, 3, 1, 5, 6, 6, 7};
        //printDuplicateUsingHashMap(arr);
        printDuplicateUsingHashMap(new int[]{1, 5, 6, 7, 4, 3, 1, 5, 6, 6, 7});
    }

    public static void printDuplicateUsingHashMap(int[] inputArray)
    {
        //print each element contains value
        //create an empty hashmap obbject
        HashMap<Integer,Integer> hm=new HashMap<>() ;
        for(int keyelement:inputArray)
        {
          if(hm.get(keyelement)== null)
          {
              hm.put(keyelement,1);
          }
          else
          {
              //hm.put(key,value+1)
              //value=hm.get(key)
              hm.put(keyelement,hm.get(keyelement)+1);
          }
        }
     //find duplicate elements
       Set<Map.Entry<Integer,Integer>> entryset=hm.entrySet();
        for(Map.Entry<Integer,Integer> entry:entryset)

        {
         if(entry.getValue()>1)
         {
             System.out.println("Dulicate element in: "+entry.getKey()+" found "+entry.getValue()+" times");
         }
        }



    }
    }

