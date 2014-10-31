package com.example.expandabletextviewinlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * @author ZhiCheng Guo
 * @version 2014年10月31日 上午10:28:08
 */
public class ListviewAdapter extends BaseAdapter{
	@SuppressWarnings("unused")
	private static final String TAG = ListviewAdapter.class.getSimpleName();

	private Context mContext;
	
	private String[] stringArray;
	public ListviewAdapter(Context context) {
		mContext  = context;
		stringArray = mContext.getResources().getStringArray(R.array.arrayString);
	}
	
	@Override
	public int getCount() {
		if (stringArray == null) {
			return 0;
		}
		return stringArray.length;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder = null;
		if (convertView == null) {
			viewHolder = new ViewHolder();
			convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_item, parent, false);
			viewHolder.mExpandableTextView = (ExpandableTextView) convertView.findViewById(R.id.expand_text_view);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		viewHolder.mExpandableTextView.setConvertText(position, stringArray[position]);
		return convertView;
	}
	
	
	private class ViewHolder{
		public ExpandableTextView mExpandableTextView;
	}
}
