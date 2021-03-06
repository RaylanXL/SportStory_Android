package cn.sportstory.android.timeline.model.like;

import cn.sportstory.android.common.baseinterface.BaseModel;
import cn.sportstory.android.common.bean.TimelineBean;
import cn.sportstory.android.common.bean.TimelineLikeBean;
import cn.sportstory.android.timeline.contract.TimelineLikeContract;
import retrofit2.Callback;

/**
 * Created by aaron on 2017/5/28.
 */

public abstract class TimelineLikeModel extends BaseModel{
    private TimelineLikeContract.Presenter presenter;

    public TimelineLikeModel(TimelineLikeContract.Presenter presenter) {
        this.presenter = presenter;
    }

    abstract public void like(TimelineLikeBean bean, Callback<TimelineLikeBean> callback);

}
