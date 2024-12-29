package InheritanceInKotlin

interface Repository<T>{
    fun getByID(id: Int): T
    fun getAll(): List<T>
}

fun main(){

    val customerRepo = CustomerGenericRepository<Customer>()

    val customer = customerRepo.getByID(10)
    val customers = customerRepo.getByID()

}