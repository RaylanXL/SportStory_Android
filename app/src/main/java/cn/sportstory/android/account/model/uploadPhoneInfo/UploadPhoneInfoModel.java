package cn.sportstory.android.account.model.uploadPhoneInfo;

import cn.sportstory.android.account.contract.UploadPhoneInfoContract;
import cn.sportstory.android.common.baseinterface.BaseModel;
import cn.sportstory.android.common.bean.PhoneInfoBean;
import retrofit2.Callback;

/**
 * Created by aaron on 2017/5/20.
 */

public abstract class UploadPhoneInfoModel extends BaseModel {
    private UploadPhoneInfoContract.Presenter presenter;

    public UploadPhoneInfoModel(UploadPhoneInfoContract.Presenter presenter) {
        this.presenter = presenter;
    }
    abstract public void uploadPhoneInfo(PhoneInfoBean bean, Callback<PhoneInfoBean> callback);
}
