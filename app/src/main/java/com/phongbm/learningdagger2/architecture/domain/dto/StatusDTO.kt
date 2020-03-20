package com.phongbm.learningdagger2.architecture.domain.dto

import com.google.gson.annotations.SerializedName

/**
 * Created by PhongBM on 01/03/2019
 */

data class StatusDTO(@SerializedName("messageKey")
                     var messageKey: String = "",

                     @SerializedName("additionalInfoDTO")
                     var additionalInfoDTO: Any? = null,

                     @SerializedName("additionalInfo")
                     var additionalInfo: String? = null)