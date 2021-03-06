package cn.sportstory.android.account.presenter;

import java.net.URLEncoder;

import cn.sportstory.android.account.contract.UploadUserLocationContract;
import cn.sportstory.android.account.model.uploadUserLocation.UploadUserLocation;
import cn.sportstory.android.account.model.uploadUserLocation.UploadUserLocationModel;
import cn.sportstory.android.common.baseinterface.BaseView;
import cn.sportstory.android.common.bean.CommonBean;
import cn.sportstory.android.common.bean.UserLocationBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by aaron on 2017/5/21.
 */

public class UploadUserLocationPresenter extends UploadUserLocationContract.Presenter {

    private UploadUserLocationContract.View view;
    private UploadUserLocationModel model;
    private UserLocationBean bean;

    @Override
    public void doTask() {

        model.uploadLocation(bean, new Callback<UserLocationBean>() {
            @Override
            public void onResponse(Call<UserLocationBean> call, Response<UserLocationBean> response) {

            }

            @Override
            public void onFailure(Call<UserLocationBean> call, Throwable t) {

            }
        });
    }

    @Override
    public void setupTask(CommonBean bean, BaseView view) {
        this.view = (UploadUserLocationContract.View)view;
        this.bean = (UserLocationBean) bean;
        model = new UploadUserLocation(this);
    }
}
