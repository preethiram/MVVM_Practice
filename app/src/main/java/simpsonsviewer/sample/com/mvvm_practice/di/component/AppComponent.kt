package simpsonsviewer.sample.com.mvvm_practice.di.component

import dagger.Component
import dagger.android.AndroidInjectionModule
import simpsonsviewer.sample.com.mvvm_practice.di.builder.AppBuilder
import simpsonsviewer.sample.com.mvvm_practice.di.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppBuilder::class,AppModule::class,AndroidInjectionModule::class))
interface AppComponent{

}