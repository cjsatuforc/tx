package com.theostanton.tx

import android.util.Log

interface Logger {
  fun debug(msg: String) {
    Log.d(javaClass.simpleName, msg)
  }

  fun logError(msg: String) {
    Log.e(javaClass.simpleName, msg)
  }
}