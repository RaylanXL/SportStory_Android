package cn.sportstory.android.account.model.sendVCode;


import java.util.LinkedHashMap;
import java.util.Map;

import cn.sportstory.android.account.presenter.SendVCodePresenter;
import cn.sportstory.android.common.bean.SendVCodeBean;
import retrofit2.Call;
import retrofit2.Callback;


/**
 * Created by aaron on 2017/5/19.
 */

public class SendVCodeModelImpl extends SendVCodeModel {

    public SendVCodeModelImpl(SendVCodePresenter presenter) {
        super(presenter);
    }

    @Override
    public void sendVCode(SendVCodeBean bean, Callback<SendVCodeBean> callback) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("phone", bean.getPhone());
        Call<SendVCodeBean> repos = service.sendVcode(map);
        repos.enqueue(callback);

    }
}
