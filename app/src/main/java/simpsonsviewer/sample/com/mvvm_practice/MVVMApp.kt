package simpsonsviewer.sample.com.mvvm_practice

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MVVMApp : Application() ,HasActivityInjector{
   @Inject
    var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>? = null



    override fun activityInjector(): DispatchingAndroidInjector<Activity>? {
        return activityDispatchingAndroidInjector
    }

    override fun onCreate() {
        super.onCreate()



    }
}