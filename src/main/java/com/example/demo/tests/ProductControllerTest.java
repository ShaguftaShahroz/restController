//package com.example.demo;
//
//
//import java.util.Arrays;
//import java.util.Date;
//
//@WebMvcTest(ProductController.class)
//public class ProductControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private ProductService productService;
//
//    @Test
//    public void testCreateProduct() throws Exception {
//        Product product = new Product("Sample Product", new Date());
//        when(productService.saveProduct(any(Product.class))).thenReturn(product);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/products")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(new ObjectMapper().writeValueAsString(product)))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.productName").value("Sample Product"));
//
//        verify(productService).saveProduct(any(Product.class));
//    }
//
//    @Test
//    public void testGetAllProducts() throws Exception {
//        Product product1 = new Product("Product 1", new Date());
//        Product product2 = new Product("Product 2", new Date());
//        when(productService.getAllProducts()).thenReturn(Arrays.asList(product1, product2));
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/products")
//                        .accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$[0].productName").value("Product 1"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[1].productName").value("Product 2"));
//
//        verify(productService).getAllProducts();
//    }
//}
//
