
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * @author ?? ??? E-mail 372445135@qq.com:
 * @version ?????2017?11?26? ??8:14:09
 * ???
 */
public class TestDemo extends TestCase{
	Demo demo=new Demo();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("?????????????");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("???????????????");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("???????setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("???????tearDown");
	}
	@Test
	public void test() {
//		fail("????");
	}
	@Test
	public void testAddUser(){
		System.out.println("??testadduser");
		demo.addUser("???");
		demo.addUser("dahuang2");
		//?? ??  ????????demo ?queryCount????????2
		assertEquals(demo.queryCount(), 1);//???

	}
	@Test
	public void  testDeleteUser() {
		System.out.println("??testdeleteUser");
		demo.deleteUser();
		assertEquals(demo.queryCount(), 1);
		demo.deleteUser();
		assertEquals(demo.queryCount(), 0);
	}


}

