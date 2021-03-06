package com.teame.boostcamp.myapplication.ui.addpost;

import android.app.ProgressDialog;
import android.net.Uri;

import com.teame.boostcamp.myapplication.adapter.PostListAdapter;
import com.teame.boostcamp.myapplication.model.entitiy.GoodsListHeader;
import com.teame.boostcamp.myapplication.ui.base.BasePresenter;
import com.teame.boostcamp.myapplication.ui.base.BaseView;

import java.util.List;

public interface AddPostContract {

    interface View extends BaseView {
        void pickGalleryImages();

        void takePicture();

        void succeedAddPost();

        void showListSelection(List<GoodsListHeader> goodsListHeaders);

        void failAddPost();

        void occurServerError();

        void showSelectionLoading();

        void showContentAlert();

        ProgressDialog showLoading();
    }

    interface Presenter extends BasePresenter {
        void addPost(String content, List<Uri> bitmapList);

        void loadMyList();

        void setListSelection(GoodsListHeader selected);

    }
}
