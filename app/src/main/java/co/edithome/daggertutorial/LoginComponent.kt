package co.edithome.daggertutorial

import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginComponent {

	@Subcomponent.Factory
	interface Factory {
		fun create(): LoginComponent
	}

	fun inject(activity: LoginActivity)
	fun inject(usernameFragment: LoginUsernameFragment)
	fun inject(passwordFragment: LoginPasswordFragment)
}