package com.example.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class UploadWorker(context: Context,param:WorkerParameters):Worker(context,param) {
    override fun doWork(): Result {
        Log.d("uploadWorker","Uploading data...")

        Thread.sleep(3000)

        Log.d("UploadWorker","Upload complete!")
        return Result.success()
    }
}