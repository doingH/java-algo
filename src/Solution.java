import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;;

class Solution {
	public static void main(String[] args) {
		
		 String[] genres = {"classic", "pop", "classic", "classic", "pop","aaa","aaa"};
		 int[] plays = {500, 600, 150, 800, 2500,10,10};
		
	    HashMap<String, Integer> genresSum = new HashMap<String, Integer>();
	    
	    for(int i=0; i<genres.length; i++) {
		    genresSum.put(genres[i], genresSum.getOrDefault(genres[i], 0) + plays[i]);
	    }
	    
	    List<Entry<String, Integer>> genresSumList = new ArrayList<Entry<String, Integer>>(genresSum.entrySet());
	    
	    //genresSum 내림차순 sort
        Collections.sort(genresSumList, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
            return e2.getValue().compareTo(e1.getValue());
            }
        });
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(Entry<String, Integer> list : genresSumList) {
        	
        	List<Entry<Integer, Integer>> rankByPlays = new ArrayList<Entry<Integer,Integer>>();
    	    for(int i=0; i<genres.length; i++) {
    	    	if(!list.getKey().equals(genres[i])) {
    	    		continue;
    	    	}
    	    	Entry<Integer, Integer> idxRnk = new AbstractMap.SimpleEntry<Integer, Integer>(i, plays[i]);
    	    	rankByPlays.add(idxRnk);
       	    }
    	    
    	    Collections.sort(rankByPlays, new Comparator<Entry<Integer, Integer>>() {
                @Override
                public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
                	
                	//play수에 대한 내림차순
                	int compareVal = e2.getValue().compareTo(e1.getValue());
                	if(compareVal != 0) {
                		return compareVal;
                	}
                	
                	//play수가 같을 시 고유번호 오름차순
                	return e1.getKey().compareTo(e2.getKey());
                	
                }
            });
    	    
    	    int i=0;
    	    for(Entry<Integer, Integer> list2 : rankByPlays) {
    	    	result.add(list2.getKey());
    	    	if(++i == 2) {
    	    		break;
    	    	}
    	    }
    	    
    	    /*
    	    List<Entry<Integer, Integer>> aa = rankByPlays.stream()
            .collect(Collectors.groupingBy(Entry<Integer, Integer>::getValue,
                    Collectors.minBy(Comparator.comparing(Entry<Integer, Integer>::getKey))))
            .values()
            .stream()
//            .map(Optional::Integer)
            .map(Optional::get)
            .limit(2)
            .collect(Collectors.toList());
    	    
    	    for(Entry<Integer, Integer> list2 : aa) {
    	    	result.add(list2.getKey());
    	    }
    	    */
    	    
        }
        System.out.println(result);
//        Integer[] answer = result.toArray(new Integer[result.size()]);
	}
	
}