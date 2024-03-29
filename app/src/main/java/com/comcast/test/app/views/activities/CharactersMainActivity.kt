package com.comcast.test.app.views.activities

import android.os.Bundle
import android.util.Log
import com.comcast.test.app.R
import com.comcast.test.app.views.fragments.CharacterNamesFragment

class CharactersMainActivity : BaseActivity() {

    private val TAG = CharactersMainActivity::class.java.simpleName

    /**
     * onCreate method of an activity
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate")
        setContentView(R.layout.main_activity_layout)

        launchFragment(CharacterNamesFragment(), "CharactersFragment")
    }
}
