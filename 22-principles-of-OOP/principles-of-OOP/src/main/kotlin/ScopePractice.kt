fun main() {
    val myLock = EncryptionLock(40)

    println("Does the key 34 unlock my lock: ${myLock.unlock(34)}")
    println("Does the key 45 unlock my lock: ${myLock.unlock(45)}")
    println("Does the key 70 unlock my lock: ${myLock.unlock(70)}")
    println("Does the key 89 unlock my lock: ${myLock.unlock(89)}")
    println("Does the key 135 unlock my lock: ${myLock.unlock(135)}")

}

class EncryptionLock(private val privateKey: Int) {
    fun unlock(publicKey: Int) = formula(publicKey) == privateKey
    private fun formula(publicKey: Int) = publicKey / 2 + 5
}