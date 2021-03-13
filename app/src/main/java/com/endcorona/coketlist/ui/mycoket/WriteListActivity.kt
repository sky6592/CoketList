package com.endcorona.coketlist.ui.mycoket

import android.os.Bundle
import android.widget.Toast
import com.endcorona.coketlist.config.BaseActivity
import com.endcorona.coketlist.databinding.ActivityWriteListBinding

class WriteListActivity :
    BaseActivity<ActivityWriteListBinding>(ActivityWriteListBinding::inflate), WriteListView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // x버튼
        binding.ivIconWriteList.setOnClickListener {
            finish()
        }

        // 완료 버튼
        binding.tvCompleteWriteList.setOnClickListener {
            val contents = binding.etEnterContentWriteList.text.toString()
            val postRequest = WriteListRequest(contents=contents)
            WriteListService(this).tryPostWriteList(postRequest)
        }
    }

    override fun onPostWriteListSuccess(listResponse: WriteListResponse) {
        TODO("Not yet implemented")
        Toast.makeText(this,"success",Toast.LENGTH_LONG)
    }

    override fun onPostWriteListFailure(message: String) {
        TODO("Not yet implemented")
        Toast.makeText(this,"fail",Toast.LENGTH_LONG)

    }
}