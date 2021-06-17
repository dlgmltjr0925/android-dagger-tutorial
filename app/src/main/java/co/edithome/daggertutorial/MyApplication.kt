package co.edithome.daggertutorial

import android.app.Application


class MyApplication: Application() {
	val appComponent = DaggerApplicationComponent.create()
}