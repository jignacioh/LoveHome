package com.papps.lovehome.di

import androidx.lifecycle.ViewModel
import com.papps.lovehome.StuffsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule : BaseFactory() {
    @Binds
    @IntoMap
    @ViewModelKey(StuffsViewModel::class)
    abstract fun fooViewModel(fooViewModel: StuffsViewModel): ViewModel
}