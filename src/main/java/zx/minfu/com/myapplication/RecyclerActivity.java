package zx.minfu.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        initView();
    }

    private void initView() {
        recycler = (RecyclerView) findViewById(R.id.recycler);
//        LinearLayoutManager manager=new LinearLayoutManager(this);
        GridLayoutManager manager=new GridLayoutManager(this,3);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(manager);
        recycler.setAdapter(new MyAdapter());
    }
     private String[] srry=new String[]{ "宋江", "卢俊义", "吴用",
             "公孙胜", "关胜", "林冲", "秦明", "呼延灼", "花荣", "柴进", "李应", "朱仝", "鲁智深",
             "武松", "董平", "张清", "杨志", "徐宁", "索超", "戴宗", "刘唐", "李逵", "史进", "穆弘",
             "雷横", "李俊", "阮小二", "张横", "阮小五", " 张顺", "阮小七", "杨雄", "石秀", "解珍",
             " 解宝", "燕青", "朱武", "黄信", "孙立", "宣赞", "郝思文", "韩滔", "彭玘", "单廷珪",
             "魏定国", "萧让", "裴宣", "欧鹏", "邓飞", " 燕顺", "杨林", "凌振", "蒋敬", "吕方",
             "郭 盛", "安道全", "皇甫端", "王英", "扈三娘", "鲍旭", "樊瑞", "孔明", "孔亮", "项充",
             "李衮", "金大坚", "马麟", "童威", "童猛", "孟康", "侯健", "陈达", "杨春", "郑天寿",
             "陶宗旺", "宋清", "乐和", "龚旺", "丁得孙", "穆春", "曹正", "宋万", "杜迁", "薛永", "施恩",
             "周通", "李忠", "杜兴", "汤隆", "邹渊", "邹润", "朱富", "朱贵", "蔡福", "蔡庆", "李立",
             "李云", "焦挺", "石勇", "孙新", "顾大嫂", "张青", "孙二娘", "王定六", "郁保四", "白胜",
             "时迁", "段景柱"};
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHoler>{


        @Override
        public MyHoler onCreateViewHolder(ViewGroup parent, int viewType) {
            View view=View.inflate(RecyclerActivity.this,android.R.layout.simple_list_item_1,null);
            return new MyHoler(view);
        }

        @Override
        public void onBindViewHolder(MyHoler holder, int position) {
            System.out.print("当前的位置::"+position);
                holder.viewById.setText(srry[position]);
        }

        @Override
        public int getItemCount() {
            System.out.print("geiitemcount::");
            return srry.length;

        }

        class MyHoler extends  RecyclerView.ViewHolder{

            private final TextView viewById;

            public MyHoler(View itemView) {
                super(itemView);
                viewById = (TextView) itemView.findViewById(android.R.id.text1);

            }
        }

    }
}
