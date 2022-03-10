package inpt.sud.springbootbackend.entities

import inpt.sud.springbootbackend.data.Product
import org.springframework.data.rest.core.config.Projection



@Projection(name = "P1", types = [Product::class])
interface ProductProjection {
    val currentPrice: Double
}