package simpsonsviewer.sample.com.mvvm_practice.di.module

import android.app.Application
import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule{

   @Provides
   @Singleton
     fun provideContext(application: Application): Context {
        return application
    }

    @Provides
    @Singleton
     fun provideGson(): Gson {
        return GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    }
 }