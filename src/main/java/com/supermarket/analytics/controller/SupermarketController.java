@RestController
@RequestMapping("/api/products")
public class SupermarketController {

    @Autowired
    private ProductService productService;

    @GetMapping("/category/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category) {
        return productService.getProductsByCategory(category);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
