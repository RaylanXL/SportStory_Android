package cn.sportstory.android.account.contract;

import android.content.Context;
import android.widget.Toast;

import cn.sportstory.android.R;
import cn.sportstory.android.common.baseinterface.BasePresenter;
import cn.sportstory.android.common.baseinterface.BaseView;
import cn.sportstory.android.common.bean.UserLoginBean;

/**
 * Created by aaron on 2017/5/17.
 */

public interface LoginTaskContract {

    abstract class View extends BaseView<Presenter> {
        protected abstract void showVCodeError();              //验证码错误

        protected abstract boolean isActive();
    }

    interface Presenter extends BasePresenter {
    }
}
