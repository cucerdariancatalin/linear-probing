class HashTable(private val size: Int) {
    private val keys = arrayOfNulls<String>(size)
    private val values = arrayOfNulls<Int>(size)

    private fun hash(key: String): Int {
        var hash = 0
        for (i in 0 until key.length) {
            hash = (hash + key[i].toInt()) % size
        }
        return hash
    }

    fun put(key: String, value: Int) {
        var index = hash(key)
        while (keys[index] != null) {
            index = (index + 1) % size
        }
        keys[index] = key
        values[index] = value
    }

    fun get(key: String): Int? {
        var index = hash(key)
        var i = 0
        while (keys[index] != null) {
            if (keys[index] == key) {
                return values[index]
            }
            index = (index + 1) % size
            i++
            if (i == size) {
                return null
            }
        }
        return null
    }
}
