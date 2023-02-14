package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practice.MainActivity;
import com.example.practice.R;


public class ListDataAdapter extends BaseAdapter {

    private Context context;

    private String[] strName, strSub,strTime;
    private int[] images;
    public ListDataAdapter(Context context, String[] strName, String[] strSub, String[] strTime, int[] images) {

        this.context = context;
        this.strName = strName;
        this.strSub = strSub;
        this.strTime = strTime;
        this.images = images;

    }

    @Override
    public int getCount() {
        return strName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_row,null);
        ImageView imgData = view.findViewById(R.id.profileImage);
        TextView txtName = view.findViewById(R.id.textName);
        TextView txtSub = view.findViewById(R.id.textSub);
        TextView txtTime = view.findViewById(R.id.textTime);

        txtName.setText(strName[i]);
        txtSub.setText(strSub[i]);
        txtTime.setText(strTime[i]);
        imgData.setImageResource(images[i]);



        return view;
    }
}
