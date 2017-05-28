package cn.sportstory.android.timeline.contract;

import cn.sportstory.android.common.baseinterface.BasePresenter;
import cn.sportstory.android.common.baseinterface.BaseView;
import cn.sportstory.android.common.bean.TimelineBean;
import cn.sportstory.android.nearby.contract.UserNearbyContract;

/**
 * Created by aaron on 2017/5/28.
 */

public interface TimelinePostContract {
    abstract class Presenter implements BasePresenter{

        public static final String TIMELINE_TYPE_TEXT = "00";
        public static final String TIMELINE_TYPE_IMG = "01";
    }

    abstract class View extends BaseView<UserNearbyContract.Presenter>{
        abstract public void postFailed(TimelineBean bean);
        abstract public void postSuccess(TimelineBean bean);
    }
}
