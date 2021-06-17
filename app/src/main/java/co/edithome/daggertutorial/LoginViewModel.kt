package co.edithome.daggertutorial

import javax.inject.Inject

class LoginViewModel @Inject constructor(
	private val userRepository: UserRepository
) {
}