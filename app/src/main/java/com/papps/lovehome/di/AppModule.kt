package com.papps.lovehome.di


import android.content.Context
import com.papps.data.DataSource
import com.papps.data.DataSourceImpl
import com.papps.data.JobExecutor
import com.papps.data.UiThread
import com.papps.domain.PostExecutionThread
import com.papps.domain.ThreadExecutor
import com.papps.domain.UseCaseHandler
import com.papps.lovehome.AppApplication
import dagger.Module
import dagger.Provides


@Module
open class AppModule {
    @Provides
    @ApplicationScoped
    fun application(application: AppApplication): Context {
        return application
    }

    @Provides
    @ApplicationScoped
    fun dataSource(context: Context): DataSource {
        return DataSourceImpl.getInstance(context)
    }

    @ApplicationScoped
    @Provides
    fun jobExecutor(jobExecutor: JobExecutor): ThreadExecutor {
        return jobExecutor
    }

    @ApplicationScoped
    @Provides
    fun uiThread(uiThread: UiThread): PostExecutionThread {
        return uiThread
    }

    @ApplicationScoped
    @Provides
    fun usecaseHandler(): UseCaseHandler {
        return UseCaseHandler.getInstance
    }
}