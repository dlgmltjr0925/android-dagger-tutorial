package co.edithome.daggertutorial

import dagger.Subcomponent
import javax.inject.Inject
import javax.inject.Scope

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope {

	@ActivityScope
	@Subcomponent
	interface LoginComponent {}

	@ActivityScope
	class LoginViewModel @Inject constructor(
		private val userRepository: UserRepository
	)
}