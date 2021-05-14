package com.papps.lovehome.di

import com.papps.data.RepositoryImpl
import com.papps.domain.Repository
import dagger.Module
import dagger.Provides

@Module
open class Module {
    @Provides
    fun repository(repositoryImpl: RepositoryImpl): Repository = repositoryImpl
}