package com.example.movieshowing.ui.auth


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movieshowing.R


class LoginFragment :
    BaseAuthFragment() {

    private val RESULT_CODE = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        launchSignInFlow()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

//    private fun launchSignInFlow() {
//        startActivityForResult(
//                AuthUI.getInstance()
//                    .createSignInIntentBuilder()
//                    .setAvailableProviders(
//                            arrayListOf(
//                                    AuthUI.IdpConfig.GoogleBuilder().build(),
//                                    AuthUI.IdpConfig.EmailBuilder().build()
//                            )
//                    )
//                    .setIsSmartLockEnabled(true)
//                    .setTheme(R.style.LoginTheme)
//                    .setAuthMethodPickerLayout(
//                        AuthMethodPickerLayout
//                            .Builder(R.layout.fragment_login)
//                            .setGoogleButtonId(R.id.google_btn)
//                            .setEmailButtonId(R.id.email_btn)
//                            .build()
//                    )
//                    .build(),
//            RESULT_CODE, ActivityOptions.makeCustomAnimation(
//            context,
//            android.R.anim.slide_in_left, android.R.anim.slide_out_right
//        ).toBundle()
//        );
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        if(requestCode == RESULT_CODE) {
//            val response = IdpResponse.fromResultIntent(data)
//            if(resultCode == Activity.RESULT_OK) {
//                Timber.i("Successfully signed in user ${FirebaseAuth.getInstance().currentUser?.displayName}!")
//            } else {
//                Timber.i("Sign in unsuccessful ${response?.error?.errorCode}")
//            }
//        }
//    }
}