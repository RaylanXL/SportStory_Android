package cn.sportstory.android.account.model.updateUserInfo;

import com.google.gson.Gson;

import java.util.LinkedHashMap;
import java.util.Map;

import cn.sportstory.android.account.contract.UpdateUserInfoContract;
import cn.sportstory.android.common.bean.UserBean;
import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by aaron on 2017/5/21.
 */

public class UpdateUserAvatar extends UpdateUserInfoModel {

    public UpdateUserAvatar(UpdateUserInfoContract.Presenter presenter) {
        super(presenter);
    }

    @Override
    public void updateUserInfo(UserBean bean, Callback<UserBean> callback) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("avatar", bean.getAvatar());
        Call<UserBean> repos = service.updateUserAvatar(map);
        repos.enqueue(callback);

    }
}
