# Linear Probing in Kotlin

This is an implementation of linear probing in Kotlin. Linear probing is a collision resolution technique used in hash tables to resolve collisions between keys. It works by searching the next available position in the array when there is a collision.

## Usage

val hashTable = HashTable(10)
hashTable.put("John", 27)
hashTable.put("Jane", 25)
val johnAge = hashTable.get("John")

## Contributing

Feel free to contribute by creating a pull request or opening an issue.
