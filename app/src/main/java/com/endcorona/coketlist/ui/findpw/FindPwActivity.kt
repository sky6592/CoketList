package com.endcorona.coketlist.ui.findpw

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.endcorona.coketlist.R
import com.endcorona.coketlist.config.BaseActivity
import com.endcorona.coketlist.databinding.ActivityFindPwBinding

@Suppress("UNREACHABLE_CODE")
class FindPwActivity : BaseActivity<ActivityFindPwBinding>(ActivityFindPwBinding::inflate),
    FindPwView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //완료 버튼
        binding.btnSentFindPw.setOnClickListener {
            //서버 전 가상 화면
            startActivity(Intent(this, TempoNumActivity::class.java))

            //서버 구동
//            val email = binding.etEnterEmailFindPw.text.toString()
//            val postRequest = FindPwRequest(email = email)
//            showLoadingDialog(this!!)
//            FindPwService(this).tryPostFindPw(postRequest)


        }
    }

    fun makeDialog(msg: String) {
        var builder = AlertDialog.Builder(this)
        builder.setMessage(msg)

        // 버튼 클릭시에 무슨 작업을 할 것인가!
        var listener = object : DialogInterface.OnClickListener {
            override fun onClick(p0: DialogInterface?, p1: Int) {
                when (p1) {
                    DialogInterface.BUTTON_POSITIVE ->
                        showCustomToast("확인을 누르면 다이얼로그 취소가 되야함!")

                    //DialogInterface.BUTTON_NEUTRAL ->

                    //DialogInterface.BUTTON_NEGATIVE ->

                }
            }
        }
        builder.setPositiveButton("확인", listener)
        builder.show()
    }

    override fun onPostFindPwSuccess(response: FindPwResponse) {
        TODO("Not yet implemented")
        //TempoNumActivity 이동!
        if (response.code == 1000) {
            startActivity(Intent(this, TempoNumActivity::class.java))
        } else {
            makeDialog(response.message)
        }


    }

    override fun onPostFindPwFailure(message: String) {
        TODO("Not yet implemented")
    }
}