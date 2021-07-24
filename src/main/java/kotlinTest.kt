import jakarta.persistence.*

fun main(){
    // hibernate jpa with kotlin
    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("jpabook")
    var em: EntityManager = emf.createEntityManager()
    var tx: EntityTransaction = em.transaction;
    println("helloworld")

    // transaction start
    try{
        tx.begin()
        val user: UserTest = em.find(UserTest::class.java, 1)
        println("user.name : ${user.name}")
        tx.commit()
    } catch (e: Exception){
        println("e.message = ${e.message}")
        tx.rollback()
    } finally {
        em.close()
    }
}