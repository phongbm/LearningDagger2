package com.phongbm.learningdagger2.architecture.domain.dto

import com.google.gson.annotations.SerializedName

/**
 * Created by PhongBM on 01/03/2019
 */

data class ResponseDTO<T>(@SerializedName("result")
                          var result: T?,

                          @SerializedName("statusDTO")
                          var statusDTO: StatusDTO)