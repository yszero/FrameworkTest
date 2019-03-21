package net.yszero.frameworktest.butterknife;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import net.yszero.frameworktest.R;

import butterknife.BindArray;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;

public class ButterknifeActivity extends Activity {


    @BindView(R.id.activity_butterknife_btn1)
    public Button btn1;
    @BindView(R.id.activity_butterknife_btn2)
    public Button btn2;
    @BindView(R.id.activity_butterknife_tv1)
    public TextView tv1;
    @BindString(R.string.app_name)
    public String appName;
    @BindColor(R.color.colorAccent)
    public int textColor;
    @BindView(R.id.activity_butterknife_lv)
    public ListView textLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterknife);

        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        textLv.setAdapter(new MyAdapter(this));
    }


    @OnClick({R.id.activity_butterknife_btn1, R.id.activity_butterknife_btn2})
    public void onUpdateText(View view) {
        switch (view.getId()) {
            case R.id.activity_butterknife_btn1:
                tv1.setText(appName);
                break;
            case R.id.activity_butterknife_btn2:
                tv1.setTextColor(textColor);
                break;
        }

        Toast.makeText(this, "触发了", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.activity_butterknife_tv1)
    public void onShowText() {
        Toast.makeText(this, tv1.getText(), Toast.LENGTH_SHORT).show();
    }

    @BindArray(R.array.letter)
    public String[] letters;

    @BindArray(R.array.number)
    public int[] numbers;

    @OnItemClick(R.id.activity_butterknife_lv)
    public void onItemClick(int position) {
        Toast.makeText(this, letters[position] + numbers[position], Toast.LENGTH_SHORT).show();
    }


    public class MyAdapter extends BaseAdapter {

        private LayoutInflater inflater;

        public MyAdapter(Context context) {
            inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return numbers.length;
        }

        @Override
        public Object getItem(int position) {
            return numbers[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder holder;
            if (convertView != null) {
                holder = (ViewHolder) convertView.getTag();
            } else {
                convertView = inflater.inflate(R.layout.adapter_butterknife, parent, false);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            }

            holder.tvs[0].setText(letters[position]);
            holder.tvs[1].setText(numbers[position] + "");

            return convertView;
        }


        class ViewHolder {
            @BindViews({R.id.adapter_butterknife_tv1, R.id.adapter_butterknife_tv2})
            TextView[] tvs;

            public ViewHolder(View view) {
                ButterKnife.bind(this, view);
            }
        }


    }


}
