package inpt.sud.springbootbackend.dao

import inpt.sud.springbootbackend.dao.ProductRepository
import inpt.sud.springbootbackend.data.Product

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.nio.file.Files
import java.nio.file.Paths

@RestController
@RequestMapping
class MyRestController public constructor(p: ProductRepository) {
    private final val productRepository: ProductRepository = p

    @GetMapping(path = ["/photoProduct/{id}"], produces = [MediaType.IMAGE_PNG_VALUE])

    public fun getPhoto(@PathVariable("id") id: Long): ByteArray {
        val p: Product = productRepository.findById(id).get()
        println(System.getProperty("user.home"))

        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/ecom/products/"+p.getPhotoName()))
    }


}