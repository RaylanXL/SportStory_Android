package cn.sportstory.android.account.model.uploadPhoneInfo;

import java.util.LinkedHashMap;
import java.util.Map;

import cn.sportstory.android.account.contract.UploadPhoneInfoContract;
import cn.sportstory.android.common.bean.PhoneInfoBean;
import cn.sportstory.android.common.bean.SendVCodeBean;
import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by aaron on 2017/5/20.
 */

public class UploadPhoneInfoModelImpl extends UploadPhoneInfoModel {

    public UploadPhoneInfoModelImpl(UploadPhoneInfoContract.Presenter presenter) {
        super(presenter);
    }

    @Override
    public void uploadPhoneInfo(PhoneInfoBean bean, Callback<PhoneInfoBean> callback) {

        Map<String, String> map = new LinkedHashMap<>();
        map.put("brand", bean.getBrand());
        map.put("model", bean.getModel());
        map.put("network_type", bean.getNetwork_type());
        map.put("lat", bean.getLat());
        map.put("lon", bean.getLon());
        map.put("city", bean.getCity());
        map.put("imei", bean.getImei());
        Call<PhoneInfoBean> repos = service.uploadPhoneInfo(map);
        repos.enqueue(callback);
    }
}
