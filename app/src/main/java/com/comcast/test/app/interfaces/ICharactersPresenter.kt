package com.comcast.test.app.interfaces

import com.comcast.test.app.model.RelatedTopicsInfo

import java.util.ArrayList

interface ICharactersPresenter {

    interface IPresenter {
        fun getCharacterNames(url: String)
    }

    interface IView {
        fun updateView(topics: ArrayList<RelatedTopicsInfo>)
        fun showErrorMessage();
    }
}
