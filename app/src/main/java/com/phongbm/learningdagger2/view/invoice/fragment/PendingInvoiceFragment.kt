package com.phongbm.learningdagger2.view.invoice.fragment

import android.content.Context
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.phongbm.learningdagger2.R
import com.phongbm.learningdagger2.base.BaseFragment
import com.phongbm.learningdagger2.viewmodel.SalesInvoiceViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_pending_invoice.*
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by PhongBM on 03/17/2020
 */

class PendingInvoiceFragment : BaseFragment() {
    companion object {
        private const val TAG = "PendingInvoiceFragment"
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<SalesInvoiceViewModel> { viewModelFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (parentFragment as SalesInvoiceFragment).salesInvoiceComponent.inject(this)
    }

    override fun getContentViewId() = R.layout.fragment_pending_invoice

    override fun initializeViews() {
        btnTest1.setOnClickListener(this)
        btnTest2.setOnClickListener(this)
    }

    override fun initializeComponents() {
    }

    override fun initializeData() {
        Log.d(TAG, "initializeData()... ${viewModel.hashCode()}")
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnTest1 -> {
                launch {
                    val invoiceModules = viewModel.getAllInvoices()
                    Log.d(TAG, "invoiceModules: $invoiceModules")
                }
            }
            R.id.btnTest2 -> {
                viewModel.getInvoiceData()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe({
                        }, {
                            it.printStackTrace()
                        })
            }
        }
    }

}