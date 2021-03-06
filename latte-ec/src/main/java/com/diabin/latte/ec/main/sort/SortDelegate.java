package com.diabin.latte.ec.main.sort;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.diabin.latte.delegates.bottom.BottomItemDelegate;
import com.diabin.latte.ec.R;
import com.diabin.latte.ec.main.sort.content.ContentDelegate;
import com.diabin.latte.ec.main.sort.list.VerticalListDelegate;

/**
 * Created by fei on 2017/8/2.
 */

public class SortDelegate extends BottomItemDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_sort;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        final VerticalListDelegate listDelegate=new VerticalListDelegate();
        loadRootFragment(R.id.vertical_list_container,listDelegate);
        //设置右侧第一个分类显示
        replaceLoadRootFragment(R.id.sort_content_container, ContentDelegate.newInstance(1),false);
    }
}
