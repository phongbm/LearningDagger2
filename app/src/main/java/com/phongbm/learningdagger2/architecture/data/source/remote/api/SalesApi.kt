package com.phongbm.learningdagger2.architecture.data.source.remote.api

import com.phongbm.learningdagger2.architecture.domain.dto.ResponseDTO
import com.phongbm.learningdagger2.architecture.domain.dto.WrapInvoiceDTO
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by PhongBM on 03/20/2020
 */

interface SalesApi {
    companion object {
        private const val SALES = "/sales-2.0.0"
    }

    @GET("$SALES/quote/get")
    fun getInvoiceData(@Query("quoteId") invoiceId: String): Single<ResponseDTO<WrapInvoiceDTO>>

}