package simpsonsviewer.sample.com.mvvm_practice.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import simpsonsviewer.sample.com.mvvm_practice.MainActivity


@Module
 abstract class AppBuilder{

    @ContributesAndroidInjector
     abstract fun bindMainActivity(): MainActivity
}