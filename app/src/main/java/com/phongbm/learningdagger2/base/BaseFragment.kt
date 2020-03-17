package com.phongbm.learningdagger2.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.phongbm.learningdagger2.extension.inflate
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

/**
 * Created by PhongBM on 03/16/2020
 */

abstract class BaseFragment : Fragment(), CoroutineScope, BaseView, View.OnClickListener {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(javaClass.name, "onCreate()...")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(javaClass.name, "onCreateView()...")
        return container.inflate(inflater, getContentViewId())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(javaClass.name, "onViewCreated()...")
        initializeViews()
        initializeComponents()
        initializeData()
    }

    override fun onDestroyView() {
        Log.d(javaClass.name, "onDestroyView()...")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(javaClass.name, "onDestroy()...")
        super.onDestroy()
    }

    override fun onClick(view: View) {
    }

}