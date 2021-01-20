package com.gtja.foldingscreen.adaptive.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.gtja.foldingscreen.R;

import java.util.ArrayList;
import java.util.List;

public class TextAdaptiveFragment extends Fragment {

    private AdaptiveViewModel mViewModel;

    public static TextAdaptiveFragment newInstance() {
        return new TextAdaptiveFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.text_adaptive_fragment, container, false);
        ListView listview = rootView.findViewById(R.id.text_adapter_list_view);

        List<String> contentList = new ArrayList<>();
        contentList.add("招商银行");
        contentList.add("贵州茅台");
        contentList.add("东方雨虹");
        contentList.add("京东方A");
        contentList.add("五粮液");
        contentList.add("恒瑞医药");
        contentList.add("老板电器");
        contentList.add("美的集团");
        contentList.add("中国人寿");
        contentList.add("建设银行");
        contentList.add("韦尔股份");
        contentList.add("立讯精密");
        contentList.add("信维通信");
        contentList.add("隆基股份");

        BaseAdapter adapter = new TextAdapter(getActivity(), contentList);
        listview.setAdapter(adapter);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AdaptiveViewModel.class);
        // TODO: Use the ViewModel
    }

    class TextAdapter extends BaseAdapter {

        Context context;

        List<String> contentList = new ArrayList<>();

        public TextAdapter(Context context, List<String> contentList) {
            this.context = context;
            this.contentList = contentList;
        }

        @Override
        public int getCount() {
            return contentList.size();
        }

        @Override
        public Object getItem(int position) {
            return contentList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.text_adaptive_item_layout, null);
                holder = new ViewHolder();
                holder.tv = convertView.findViewById(R.id.item_tv_content);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.tv.setText(contentList.get(position));

            return convertView;
        }

        class ViewHolder {
            private TextView tv;
        }
    }

}