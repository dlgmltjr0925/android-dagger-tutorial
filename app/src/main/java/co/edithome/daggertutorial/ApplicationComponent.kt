package co.edithome.daggertutorial

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, SubcomponentsModule::class])
interface ApplicationComponent {
	fun inject(ativity: LoginActivity)

	fun loginComponent(): LoginComponent.Factory
}