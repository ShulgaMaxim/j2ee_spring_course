package lectureOne;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.google.common.collect.Lists;

@ContextConfiguration
public class WareHouseTest {

	@Test
	public void testAddProduct() {
		ICategory c = new Category("other");
		IProduct p1 = new Product(50, 50, c);
		IProduct p2 = new Product(100, 100, c);
		IProduct p3 = new Product(200, 200, c);
		List<IProduct> list = Lists.newArrayList(p1,p2);
		IWareHouse wh = new WareHouse(list);
		wh.addProduct(p3);
		Assert.assertEquals(3, wh.getGoods().size());
	}
	
	

}
