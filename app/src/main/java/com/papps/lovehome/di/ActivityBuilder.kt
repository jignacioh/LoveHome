package com.papps.lovehome.di

import com.papps.lovehome.ItemListActivity
import dagger.android.ContributesAndroidInjector
import dagger.Module

@Module(includes = [ViewModelModule::class, com.papps.lovehome.di.Module::class])
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun foo(): ItemListActivity
}