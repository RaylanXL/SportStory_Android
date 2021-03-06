package cn.sportstory.android.timeline.contract;

import cn.sportstory.android.common.baseinterface.BasePresenter;
import cn.sportstory.android.common.baseinterface.BaseView;
import cn.sportstory.android.common.bean.TimelineBean;

/**
 * Created by aaron on 2017/5/28.
 */

public interface TimelineLikeContract {

    abstract public class Presenter implements BasePresenter{

    }

    abstract class View extends BaseView<Presenter> {
        abstract public void likeSuccess(TimelineBean bean);
        abstract public void likeFailed(TimelineBean bean);
    }
}
