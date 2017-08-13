package com.obaied.dingerquotes.ui.start

import com.obaied.dingerquotes.data.model.Quote
import com.obaied.dingerquotes.ui.base.MvpView

/**
 * Created by ab on 19/03/2017.
 */

interface StartMvpView : MvpView {
    fun showQuotes(quotes: List<Quote>)
    fun showEmpty()
    fun showError(error: String)
    fun showProgress()
    fun hideProgress()
}
