package com.papps.lovehome.di

import com.papps.lovehome.AppApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@ApplicationScoped
@Component(modules = [AppModule::class, ActivityBuilder::class, AndroidSupportInjectionModule::class])
interface AppComponent {

    fun inject(application: AppApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: AppApplication): Builder

        fun build(): AppComponent
    }
}