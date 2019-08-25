package com.trustnet.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trustnet.entity.Category;
import com.trustnet.entity.Product;
import com.trustnet.entity.ProductAttribute;
import com.trustnet.entity.ProductDetailResponse;
import com.trustnet.entity.ProductSeller;
import com.trustnet.entity.SellerDetail;
import com.trustnet.entity.SubCategory;
import com.trustnet.entity.UserCart;
import com.trustnet.entity.UserOrder;
import com.trustnet.services.ProductService;

@RestController
@RequestMapping("/api/nearby")
public class ProductController {

	Logger _LOGGER = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;

	@PutMapping("/product")
	public String addUpdateProduct(@RequestBody Product product) {
		_LOGGER.debug("[Add Product]" + product);
		try {
			productService.addUpdateObject(product);
			return "Product Addedd/Updated Succeccfully";
		} catch (Exception e) {
			_LOGGER.error(e.getMessage());
		}
		return "Product Add/Update got failed";
	}

	@PutMapping("/productAttribute")
	public String addUpdateProductAttribute(@RequestBody ProductAttribute productAttribute) {
		_LOGGER.debug("[Add/update productAttribute]" + productAttribute);
		try {
			productService.addUpdateObject(productAttribute);
			return "productAttribute Addedd/Updated Succeccfully";
		} catch (Exception e) {
			_LOGGER.error(e.getMessage());
		}
		return "productAttribute Add/Update got failed";
	}

	@PutMapping("/productSeller")
	public String addUpdateProductSeller(@RequestBody ProductSeller productSeller) {
		_LOGGER.debug("[Add/update productSeller]" + productSeller);
		try {
			productService.addUpdateObject(productSeller);
			return "productSeller Addedd/Updated Succeccfully";
		} catch (Exception e) {
			_LOGGER.error(e.getMessage());
		}
		return "productSeller Add/Update got failed";
	}

	@PutMapping("/category")
	public String addUpdateCategory(@RequestBody Category category) {
		_LOGGER.debug("[Add/update Product]" + category);
		try {
			productService.addUpdateObject(category);
			return "category Addedd/Updated Succeccfully";
		} catch (Exception e) {
			_LOGGER.error(e.getMessage());
		}
		return "category Add/Update got failed";
	}

	@PutMapping("/sellerDetail")
	public String addUpdateSellerDetail(@RequestBody SellerDetail sellerDetail) {
		_LOGGER.debug("[Add/update sellerDetail]" + sellerDetail);
		try {
			productService.addUpdateObject(sellerDetail);
			return "sellerDetail Addedd/Updated Succeccfully";
		} catch (Exception e) {
			_LOGGER.error(e.getMessage());
		}
		return "sellerDetail Add/Update got failed";
	}

	@GetMapping("/sellerDetail")
	public SellerDetail getSellerDetail(@RequestParam("sellerId") String sellerId) {
		_LOGGER.debug("[get sellerDetail]" + sellerId);
		try {
			return productService.getSellerDetail(sellerId);
		} catch (Exception e) {
			_LOGGER.error(e.getMessage());
		}
		return null;
	}

	@GetMapping("/search")
	public List<Product> searchProducts(@RequestParam("productName") String productName,
			@RequestParam(value = "subCategoryId", required = false) String subCategoryId,
			@RequestParam(value = "minPrice", required = false) String minPrice) {
		return productService.searchProducts(productName, subCategoryId, minPrice);
	}

	@GetMapping("/productSellerDetail")
	public List<ProductSeller> getProductSellerDetail(@RequestParam("sellerId") String sellerId) {
		_LOGGER.debug("[get getProductSellerDetail]" + sellerId);
		try {
			return productService.getProductSellerDetail(sellerId);
		} catch (Exception e) {
			_LOGGER.error(e.getMessage());
		}
		return null;
	}

	@PutMapping("/subCategory")
	public String addUpdateSubCategory(@RequestBody SubCategory subCategory) {
		_LOGGER.debug("[Add/update subCategory]" + subCategory);
		try {
			productService.addUpdateObject(subCategory);
			return "subCategory Addedd/Updated Succeccfully";
		} catch (Exception e) {
			_LOGGER.error(e.getMessage());
		}
		return "subCategory Add/Update got failed";
	}

	@GetMapping("/getSubCatOfCategories")
	public List<SubCategory> getAllSubCategoryOfCategories() {
		_LOGGER.debug("[getSubCategoriesOfCategories]");
		return productService.getAllSubCategoryOfCategories();
	}

	@GetMapping("/getSubCatOfCategory")
	public List<SubCategory> getAllSubCategoryOfCategory(@RequestParam("categoryId") String categoryId) {
		_LOGGER.debug("[getSubCatOfCategory]" + categoryId);
		return productService.getAllSubCategoryOfCategory(categoryId);
	}

	@GetMapping("/getProductsOfSubCat")
	public List<Product> getAllProductsOfSubCat(@RequestParam("subCategoryId") String subCategoryId) {
		_LOGGER.debug("[getProductsOfSubCat]" + subCategoryId);
		return productService.getAllProductsOfSubCategory(subCategoryId);
	}

	@GetMapping("/getProductsDetails")
	public List<ProductDetailResponse> getProductsDetails(@RequestParam("productId") String productId,
			@RequestParam("lat") String lat, @RequestParam("lon") String lon) {
		_LOGGER.debug("[getProductsDetails]" + productId);
		return productService.getProductDetailResponse(productId, lat, lon);
	}

	@PutMapping("/userOrder")
	public void addUpdateUserOrder(@RequestBody UserOrder userOrder) {
		productService.addUpdateObject(userOrder);
	}

	/*
	 * @GetMapping("/productAttribute") public Object
	 * getProductAttribute(@RequestParam("productId") Long id) { return
	 * productService.getProductAttribute(id); }
	 */

	@GetMapping("/recentSeller")
	public Object getRecentSeller() {
		return productService.getRecentSeller();
	}

	/*
	 * @PostMapping("/search") public Object getSearchData(@RequestBody String data)
	 * { ObjectMapper om = new ObjectMapper(); Object searchData = null; try {
	 * Search search = om.readValue(data, Search.class); searchData =
	 * productService.findDataWithFilter(search.getCategory(),
	 * search.getPriceRange(), search.getLocationRange()); } catch (Exception e) {
	 * // TODO: handle exception }
	 * 
	 * return searchData; }
	 */

	@PostMapping("/addToCart")
	public Object addToCart() {
		return null;
	}

	@GetMapping("/userCart")
	public Object getUserCarts(@RequestParam("userId") String userId) {
		return productService.getUserCarts(userId);
	}

	@GetMapping("/userOrder")
	public Object getUserOrders(String userId) {
		return productService.getUserOrders(userId);
	}

	@PostMapping("/userCart")
	public Object addUserCart(@RequestBody UserCart userCart) {
		return productService.saveUserCart(userCart);
	}

	@PostMapping("/userOrder")
	public Object addUserOrder(@RequestBody UserOrder userOrder) {
		return productService.saveUserOrder(userOrder);
	}
}
