package com.kutugondrong.networkkgadapter

import kotlin.reflect.KClass

/**
 * KG KutuGondrong
 * Abstract class for converter json to object
 */
abstract class ConverterNetworkKGAdapter(val type: Int = -1) {
    companion object {
        const val JSONKGADAPTER = 1
    }

    abstract fun fromJson(json: String, classOf: KClass<*>, isList: Boolean): Any?

    abstract  fun toJson(value: Any) : String?

}

