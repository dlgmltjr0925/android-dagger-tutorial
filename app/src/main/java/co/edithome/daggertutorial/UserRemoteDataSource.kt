package co.edithome.daggertutorial

import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(
	private val loginService: LoginRetrofitService
) {
}