package com.papps.cache


class CacheSourceImpl(var database: Database) : CacheSource {
    override fun contact(): ContactDao = database.contactDao()
}