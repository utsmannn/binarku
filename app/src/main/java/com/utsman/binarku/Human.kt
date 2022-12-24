package com.utsman.binarku

class Human(
    private val name: String,
    private val age: Int,
    private val job: String = "jobless"
) {

    var isMature: Boolean = false
    var address: String = ""
    private var alias: String = ""

    init {
        isMature = age >= 18
    }

    constructor(name: String, address: String) : this(name, 13) {
        this.address = address
    }

    constructor(name: String, address: String, alias: String): this(name, address) {
        this.alias = alias
    }

    fun description(): String {
        return "This is human with name $name, $age and currently working as $job"
    }
}