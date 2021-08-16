package com.myconv.junit;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.myconv.bl.NumberConvertor;

import junit.framework.Assert;

public class NumberConvertorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void convertNumberToTextTest() {

		NumberConvertor numConv = new NumberConvertor();

		Map<String, String> numberMap = new HashMap<String, String>();
		/*
		numberMap.put("0", "zero");
		numberMap.put("1", "one");
		numberMap.put("2", "two");
		numberMap.put("3", "three");
		numberMap.put("4", "four");
		numberMap.put("5", "five");
		numberMap.put("6", "six");
		numberMap.put("8", "eight");
		numberMap.put("9", "nine");
		numberMap.put("10", "ten");
		numberMap.put("11", "eleven");
		numberMap.put("12", "twelve");
		numberMap.put("13", "thirteen");
		numberMap.put("14", "fourteen");
		numberMap.put("15", "fifteen");
		numberMap.put("16", "sixteen");
		numberMap.put("17", "seventeen");
		numberMap.put("18", "eighteen");
		numberMap.put("19", "nineteen");
		numberMap.put("20", "twenty");
		
		numberMap.put("21", "twenty one");
		numberMap.put("29", "twenty nine");
		numberMap.put("30", "thirty");
		numberMap.put("40", "forty");
		numberMap.put("50", "fifty");
		numberMap.put("60", "sixty");
		numberMap.put("70", "seventy");
		numberMap.put("80", "eighty");
		numberMap.put("90", "ninety");
		numberMap.put("91", "ninety one");
		numberMap.put("99", "ninety nine");
		
		
		numberMap.put("100", "one hundred");
		numberMap.put("101", "one hundred and one");
		numberMap.put("109", "one hundred and nine");
		numberMap.put("110", "one hundred and ten");
		numberMap.put("120", "one hundred and twenty");
		numberMap.put("121", "one hundred and twenty one");
		numberMap.put("200", "two hundred");
		numberMap.put("900", "nine hundred");
		numberMap.put("999", "nine hundred and ninety nine");
		
		numberMap.put("1000", "one thousand");
		numberMap.put("1100", "one thousand one hundred");
		numberMap.put("1110", "one thousand one hundred and ten");
		numberMap.put("9999", "nine thousand nine hundred and ninety nine");
		numberMap.put("10000", "ten thousand");
		numberMap.put("99999", "ninety nine thousand nine hundred and ninety nine");
		numberMap.put("100000", "one lakh");
		numberMap.put("9999999", "ninety nine lakh ninety nine thousand nine hundred and ninety nine");
		numberMap.put("10000000", "one crore");
		numberMap.put("99999999", "nine crore ninety nine lakh ninety nine thousand nine hundred and ninety nine");
		numberMap.put("999999999", "ninety nine crore ninety nine lakh ninety nine thousand nine hundred and ninety nine");
		numberMap.put("9999999999", "nine hundred and ninety nine crore ninety nine lakh ninety nine thousand nine hundred and ninety nine");
		*/
		numberMap.put("99999999999", "nine thousand nine hundred and ninety nine crore ninety nine lakh ninety nine thousand nine hundred and ninety nine");
					
		/*
		 * String expectedOutputStr = "nine"; 
		 * String inputStr = "9";
		 * 
		 * String actualOutputStr = numConv.convertNumToStr(inputStr);
		 * Assert.assertEquals("Testing", expectedOutputStr, actualOutputStr);
		 * 
		 */
		for (Map.Entry<String, String> entry : numberMap.entrySet()) {

			String expectedOutput = entry.getValue();
			String actualOutput = numConv.convertNumToStr(entry.getKey());
			Assert.assertEquals("Falied Validation for >>> &&& >> " + entry.getKey(), expectedOutput, actualOutput);

		}

	}
}
