package com.ns.yc.lifehelper.ui.home.contract;


import com.ns.yc.lifehelper.base.mvp1.BasePresenter;
import com.ns.yc.lifehelper.base.mvp1.BaseView;
import com.ns.yc.lifehelper.model.bean.HomeBlogEntity;
import com.ns.yc.lifehelper.ui.main.view.MainActivity;

import java.util.List;


/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/3/21
 * 描    述：Home主页面
 * 修订历史：
 *
 *       v1.5 修改于11月3日，改写代码为MVP架构
 * ================================================
 */
public interface HomeFragmentContract {

    interface View extends BaseView {
        void setNewsData(List<HomeBlogEntity> list);
    }

    interface Presenter extends BasePresenter {
        void getHomeNewsData();
        List<CharSequence> getMarqueeTitle();
        List<Object> getBannerData();
        void bindActivity(MainActivity activity);
    }


}
