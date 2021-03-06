package com.lyj.fakepivix.module.login.register

import android.arch.lifecycle.LifecycleOwner
import com.lyj.fakepivix.app.base.BaseViewModel

/**
 * @author greensun
 *
 * @date 2019/3/13
 *
 * @desc 登录
 */
class RegisterViewModel : BaseViewModel<IRegisterModel>() {

    override var mModel: IRegisterModel = RegisterModel()

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)

    }

}