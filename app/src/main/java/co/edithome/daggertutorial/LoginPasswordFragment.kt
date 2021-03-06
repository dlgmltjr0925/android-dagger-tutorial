package co.edithome.daggertutorial

import android.content.Context
import androidx.fragment.app.Fragment
import javax.inject.Inject

class LoginPasswordFragment: Fragment() {
	@Inject lateinit var loginViewModel: LoginViewModel

	override fun onAttach(context: Context) {
		super.onAttach(context)

		(activity as LoginActivity).loginComponent.inject(this)
	}
}