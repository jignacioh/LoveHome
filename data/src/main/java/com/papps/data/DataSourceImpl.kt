package com.papps.data

import android.content.Context
import com.papps.cache.CacheSource
import com.papps.cache.CacheSourceImpl
import com.papps.cache.Database
import com.papps.remote.RemoteSource
import com.papps.remote.RemoteSourceImpl
import javax.inject.Inject

class DataSourceImpl @Inject constructor(context: Context) : DataSource {

    private var cache: CacheSource =
        CacheSourceImpl(Database.getInstance(context.applicationContext))

    private var remote: RemoteSource = RemoteSourceImpl()

    companion object : SingletonHolder<DataSource, Context>(::DataSourceImpl)

    override fun remote(): RemoteSource = remote

    override fun cache(): CacheSource = cache

}