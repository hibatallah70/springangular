package inpt.sud.springbootbackend.data

import inpt.sud.springbootbackend.data.Product
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import lombok.ToString
import java.io.Serializable
import javax.persistence.*

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
class Category: Serializable {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null
    private var name: String? = null
    private var description: String? = null
    @OneToMany(mappedBy = "category")
    private var products: Collection<Product>? = null
    constructor(id: Long?, name: String?, description: String?, products: Collection<Product>?) {
        this.id = id
        this.name = name
        this.description = description
        this.products = products
    }
    fun getId(): Long? {
        return id
    }
    fun setId(id: Long?) {
        this.id = id
    }
    fun getName(): String? {
        return name
    }
    fun setName(name: String?) {
        this.name = name
    }
    fun getDescription(): String? {
        return description
    }
    fun setDescription(description: String?) {
        this.description = description
    }
    fun getProducts(): Collection<Product>? {
        return products
    }
    fun setProducts(products: Collection<Product>?) {
        this.products = products
    }
}