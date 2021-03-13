package com.endcorona.coketlist.ui.login

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.endcorona.coketlist.MainActivity
import com.endcorona.coketlist.R
import com.endcorona.coketlist.config.BaseActivity
import com.endcorona.coketlist.databinding.ActivityLogInBinding
import com.endcorona.coketlist.ui.endcorona.EndCoronaActivity
import com.endcorona.coketlist.ui.findpw.FindPwActivity
import com.endcorona.coketlist.ui.signup.SignUpActivity


class LogInActivity : BaseActivity<ActivityLogInBinding>(ActivityLogInBinding::inflate), LogInView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnLogIn.setOnClickListener {
            //서
//            val email = binding.etEnterEmailLogIn.text.toString()
//            val pw = binding.etEnterPwLogIn.text.toString()
//            val postRequest = LogInRequest(email = email, password = pw)
//            showLoadingDialog(this!!)
//            LogInService(this).tryPostSignUp(postRequest)
            val intent = Intent(this, EndCoronaActivity::class.java)
            startActivity(intent)
        }
    }


    fun onCheckLogin() {
        //서버 구현

    }

    fun onMoveSignUp(view: View) {
        return startActivity(Intent(this, SignUpActivity::class.java))
    }

    fun onMoveFindPw(view: View) {
        return startActivity(Intent(this, FindPwActivity::class.java))

    }

    //다이얼로그 다시 작성하기
//    fun makeDialog(msg: String) {
//        val builder = AlertDialog.Builder(this)
//        val build = builder.create()
//        builder.setMessage(msg)
//            .setPositiveButton("확인", DialogInterface.OnClickListener { dialog, which ->
//                build.dismiss()
//            })
//        builder.create()
//    }

    override fun onPostSignUpSuccess(response: LogInResponse) {
        dismissLoadingDialog()
//        val intent = Intent(this, EndCoronaActivity::class.java)
//        startActivity(intent)
//        makeDialog(response.message)
        when (response.code) {
            1000 -> Toast.makeText(this, response.message, Toast.LENGTH_LONG)
            2000, 2002, 2003, 3000, 3001, 3002 -> Toast.makeText(
                this,
                response.message,
                Toast.LENGTH_LONG
            )
        }
    }

    override fun onPostSignUpFailure(message: String) {
        dismissLoadingDialog()
        Toast.makeText(this, message, Toast.LENGTH_LONG)

    }

}