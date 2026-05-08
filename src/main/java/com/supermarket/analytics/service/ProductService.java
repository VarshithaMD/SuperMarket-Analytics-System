@Service
public class ProductService {

    @Autowired
    private Firestore firestore;

    public List<Product> getProductsByCategory(String category) {
        List<Product> products = new ArrayList<>();
        try {
            ApiFuture<QuerySnapshot> query = firestore.collection("products")
                    .whereEqualTo("category", category)
                    .get();

            for (DocumentSnapshot doc : query.get().getDocuments()) {
                Product product = doc.toObject(Product.class);
                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try {
            ApiFuture<QuerySnapshot> query = firestore.collection("products").get();
            for (DocumentSnapshot doc : query.get().getDocuments()) {
                Product product = doc.toObject(Product.class);
                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
