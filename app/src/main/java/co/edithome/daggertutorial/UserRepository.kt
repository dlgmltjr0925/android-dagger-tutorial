package co.edithome.daggertutorial

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
	private val localDataSource: UserLocalDataSource,
	private val remoteDataSource: UserRemoteDataSource
) {
}