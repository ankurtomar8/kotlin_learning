package InheritanceInKotlin

class CustomerGenericRepository<T> : Repository<T> {
    override fun getByID(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<T> {
        TODO("Not yet implemented")
    }
}

interface Repo {
    fun <T> getById(id:Int): T
    fun <T> getAll(id:Int): List<T>
}

class MyRepo: Repo{
    override fun <T> getById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun <T> getAll(id: Int): List<T> {
        TODO("Not yet implemented")
    }

}