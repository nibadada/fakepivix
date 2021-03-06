package com.lyj.fakepivix.module.login.login

import android.os.Bundle
import com.lyj.fakepivix.R
import com.lyj.fakepivix.BR
import com.lyj.fakepivix.app.base.FragmentationFragment
import com.lyj.fakepivix.databinding.FragmentLoginBinding
import com.lyj.fakepivix.module.login.register.RegisterFragment
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * @author greensun
 *
 * @date 2019/3/20
 *
 * @desc
 */
class LoginFragment : FragmentationFragment<FragmentLoginBinding, LoginViewModel>() {

    companion object {
        fun newInstance(): LoginFragment {
            val args = Bundle()
            val fragment = LoginFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override var mViewModel: LoginViewModel = LoginViewModel()

    override fun initData(savedInstanceState: Bundle?) {

    }

    override fun initView(savedInstanceState: Bundle?) {
        btn_register.setOnClickListener {
            start(RegisterFragment.newInstance())
        }
    }

    override fun bindLayout(): Int = R.layout.fragment_login

}