package sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSort() {
		//fail("Not yet implemented");
		Bubble test_obj=new Bubble();
		int arr[]= {641,5,12,212,112,1,22,43,442,430,0,8,80,7};
		int expected[]= {0,1,5,7,8,12,22,43,80,112,212,430,442,641};
		assertArrayEquals(expected, test_obj.sort(arr));//( expected,test_obj.sort(arr) );
		
		
	}

	@Test
	void testPrintSortedarray() {
		//fail("Not yet implemented");
	}

	@Test
	void testMain() {
		//fail("Not yet implemented");
	}

}
