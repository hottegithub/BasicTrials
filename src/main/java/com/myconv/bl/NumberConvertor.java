package com.myconv.bl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/***
 * 
 * @author Mahendra
 * My notes:
 * 1. First just do the single digits with switch case
 * 2. Then replace with Hashmap from 1 to 20 and then in increments of 10 and use the logic
 * 	if (numberMap.containsKey(longKey)) {
			returnStr = numberMap.get(longKey);
			return returnStr;
		}
 * 3. Then put this logic till 99  
 * 		long tempLong1 = num / 10 * 10;
		long tempLong2 = num % 10;
		returnStr = numberMap.get(tempLong1) + " " + numberMap.get(tempLong2);		
		return andAppender(returnStr);
 * 4. Then introduce this clause if(num >= item) for 100 
 */


public class NumberConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private Map<Integer, String> upperLimitNumber () {
		
		Map<Integer, String> upperNumberMap = new HashMap<Integer, String>();
		upperNumberMap.put(100, "hundred");
		upperNumberMap.put(1000, "thousand");
		upperNumberMap.put(100000, "lakh");
		upperNumberMap.put(10000000, "crore");
		return upperNumberMap;
		
	}

	public String convertNumToStr(String inputStr) {

		String returnStr = "";
		//int num = Integer.parseInt(inputStr);
		
		long num = Long.parseLong(inputStr); 
		/*
		 * switch (num) { case 0: returnStr = "zero"; break; case 1: returnStr = "one";
		 * break; case 2: returnStr = "two"; break; case 3: returnStr = "three"; break;
		 * case 4: returnStr = "four"; break; }
		 */

		Map<Long, String> numberMap = findInMapper();
		long longKey = num;

		if (numberMap.containsKey(longKey)) {
			returnStr = numberMap.get(longKey);
			return returnStr;
		}
		
		List<Integer> intList = createNumberSystemList();
		Iterator <Integer> iterator = intList.iterator();
		Map<Integer, String> upperMap = upperLimitNumber();
		
		while(iterator.hasNext()) {
			int item = iterator.next();
			
			if(num >= item) {
				long prefixLong = num / item;
				String prefixStr = convertNumToStr(prefixLong+"");
				returnStr = prefixStr + " " + upperMap.get(item);
				
				//int tempInt = num % item;
				long tempInt = num % item;
				if(tempInt > 0) {
					returnStr = returnStr + " " + convertNumToStr(tempInt+"");
				}
				System.out.println("returnStr >>>>>>"+returnStr);
				return andAppender(returnStr);
			}
		}
		
		long tempLong1 = num / 10 * 10;
		long tempLong2 = num % 10;
		returnStr = numberMap.get(tempLong1) + " " + numberMap.get(tempLong2);		
		return andAppender(returnStr);
	}

	private static List <Integer> createNumberSystemList()
    {
        List <Integer> list = new ArrayList<Integer>();
        list.add(10000000);
        list.add(100000);
        list.add(1000);
        list.add(100);
        return list;
    }
	
	private Map<Long, String> findInMapper() {

		Map<Long, String> numberMap = new HashMap<Long, String>();
		numberMap.put((long) 0, "zero");
		numberMap.put((long) 1, "one");
		numberMap.put((long) 2, "two");
		numberMap.put((long) 3, "three");
		numberMap.put((long) 4, "four");
		numberMap.put((long) 5, "five");
		numberMap.put((long) 6, "six");
		numberMap.put((long) 7, "seven");
		numberMap.put((long) 8, "eight");
		numberMap.put((long) 9, "nine");

		numberMap.put((long) 10, "ten");
		numberMap.put((long) 11, "eleven");
		numberMap.put((long) 12, "twelve");
		numberMap.put((long) 13, "thirteen");
		numberMap.put((long) 14, "fourteen");
		numberMap.put((long) 15, "fifteen");
		numberMap.put((long) 16, "sixteen");
		numberMap.put((long) 17, "seventeen");
		numberMap.put((long) 18, "eighteen");
		numberMap.put((long) 19, "nineteen");
		numberMap.put((long) 20, "twenty");
		numberMap.put((long) 30, "thirty");
		numberMap.put((long) 40, "forty");
		numberMap.put((long) 50, "fifty");
		numberMap.put((long) 60, "sixty");
		numberMap.put((long) 70, "seventy");
		numberMap.put((long) 80, "eighty");
		numberMap.put((long) 90, "ninety");

		return numberMap;
	}

	private String andAppender(String str) {

		String returnStr = str;

		if (str.contains(" and ")) {
			return returnStr;
		}

		if (str.endsWith("hundred")) {
			return returnStr;
		} else if (str.contains("hundred")) {
			String parts[] = str.split("hundred");
			returnStr = parts[0] + "hundred and" + parts[1];
			return returnStr;
		}
		return returnStr;
	}

}
