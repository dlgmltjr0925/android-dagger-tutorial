package co.edithome.daggertutorial

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {

	@Singleton
	@Provides
	fun provideLoginRetrofitService(): LoginRetrofitService {
		return Retrofit.Builder()
			.baseUrl("https://example.com")
			.build()
			.create(LoginRetrofitService::class.java)
	}
}