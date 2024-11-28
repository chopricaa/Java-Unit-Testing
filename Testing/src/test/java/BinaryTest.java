import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;

public class BinaryTest {
	Binary bs;
	@BeforeEach
	public void setUp() {
		bs = new Binary();
	}
   
	@Test
	@DisplayName("the index shoud be displayed")
	public void binarytest() {
		int arr[] = {1,4,6,8,9,34,56};
		int target =9;
		int n = arr.length;
		assertEquals(4,bs.bins(arr, 0, n-1, target));
	}
	
	@Test
	@DisplayName("The  testcase2")
	public void bts2(){
		int arr[]= {1,4,6,8,9,34,56};
		int target = 64;
		int n = arr.length;
		assertEquals(-1,bs.bins(arr, 0, n-1, target));
		
	}
	@Test
	@DisplayName("The  testcase2")
	public void Emptyy(){
		int arr[]= {};
		int target = 64;
		int n = arr.length;
		assertEquals(-1,bs.bins(arr, 0, n-1, target));
	}
	
	@Test
	@DisplayName("The  testcase3")
	public void unsorted(){
		int arr[]= {1,4,5,6,8,3,9};
		int target = 8;
		int n = arr.length;
		assertEquals(-1,bs.bins(arr, 0, n-1, target));
	}
	
	@Test
	@Disabled("Ignoring this for now")
	@DisplayName("The  testcase3")
	public void ignorecase(){
		int arr[]= {8};
		int target = 8;
		int n = arr.length;
		assertEquals(-1,bs.bins(arr, 0, n-1, target));
	}
	
	
	@AfterEach
	public void td() {
		bs= null;
		
	}
	
	
}
