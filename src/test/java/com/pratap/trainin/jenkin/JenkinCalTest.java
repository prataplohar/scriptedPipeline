package com.pratap.trainin.jenkin;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pratap.training.jenkin.JenkinCalculator;

public class JenkinCalTest {

	@Test
	public void addTest() {
		JenkinCalculator myCal=new JenkinCalculator();
		assertEquals(10,myCal.addNums(5,5));
	}
	
	@Test
	public void subTest() {
		JenkinCalculator myCal=new JenkinCalculator();
		assertEquals(5,myCal.subNums(10,5));
	}

}
