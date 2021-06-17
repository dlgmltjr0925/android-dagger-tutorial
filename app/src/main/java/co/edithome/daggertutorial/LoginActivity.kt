package co.edithome.daggertutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
	@Inject lateinit var loginViewModel: LoginViewModel
	lateinit var loginComponent: LoginComponent

	override fun onCreate(savedInstanceState: Bundle?) {
		loginComponent = (applicationContext as MyApplication).appComponent.loginComponent().create()
		loginComponent.inject(this)

		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_login)
	}
}

