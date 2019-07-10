package com.uk.tastytoasty;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Tasty {
	private Context context;
	private String message;
	
	private Integer duration;
	private Integer iconId;
	private Integer backgroundColorId;
	private Integer textColorId;
	
	private View toastLayout;
	private Boolean showTail;
	
	
	public static int LONG = Toast.LENGTH_LONG;
	public static int SHORT = Toast.LENGTH_SHORT;
	
	
	private Tasty(Builder builder) {
		this.context = builder.context;
		this.message = builder.message;
		this.duration = builder.duration;
		this.iconId = builder.iconId;
		this.backgroundColorId = builder.backgroundColorId;
		this.textColorId = builder.textColorId;
		this.showTail = builder.showTail;
	}
	
	
	private void show() {
		
		inflateToastLayout();
		Toast toast = configureToast();
		toast.show();
	}
	
	private void inflateToastLayout() {
		toastLayout = LayoutInflater.from(context)
			.inflate(R.layout.toast_layout, null);
	}
	
	private Toast configureToast() {
		Toast toast = new Toast(context);
		
		toast.setView(toastLayout);
		
		LinearLayout toastContainer  = toastLayout.findViewById(R.id.toastContainer);
		TextView tvMessage = toastLayout.findViewById(R.id.tvToastMsg);
		ImageView imgTail = toastLayout.findViewById(R.id.imgTail);
		ImageView imgIcon = toastLayout.findViewById(R.id.imgIcon);
		
		
		if (message != null) {
			tvMessage.setText(message);
		} else {
			tvMessage.setVisibility(View.GONE);
		}
		
		
		if (iconId != null) {
			imgIcon.setImageResource(iconId);
		} else {
			imgIcon.setVisibility(View.GONE);
		}
		
		
		if (backgroundColorId != null) {
			toastContainer.setBackgroundColor(context.getResources().getColor(backgroundColorId));
			imgTail.setColorFilter(ContextCompat.getColor(context, backgroundColorId), android.graphics.PorterDuff.Mode.SRC_IN);
		} else {//Default
			
			toastContainer.setBackgroundColor(context.getResources().getColor(R.color.pinkish_red));
			imgTail.setColorFilter(ContextCompat.getColor(context, R.color.pinkish_red), android.graphics.PorterDuff.Mode.SRC_IN);
		}
		
		
		if (textColorId != null) {
			tvMessage.setTextColor(context.getResources().getColor(textColorId));
		} else {
			tvMessage.setTextColor(context.getResources().getColor(R.color.white));
		}
		
		
		
		if (showTail == null || !showTail) {
			imgTail.setVisibility(View.GONE);
		} else {
			imgTail.setVisibility(View.VISIBLE);
		}
		
		
		//Don't need to worry, always non-null
		toast.setDuration(duration);
		
		return toast;
	}
	
	
	
	public static class Builder {
		private Context context;
		private String message;
		private Integer duration = LONG;                    //default
		private Integer iconId;
		private Integer backgroundColorId;
		private Integer textColorId;
		
		private Boolean showTail;
		
		private Tasty mToast;
		
		public Builder() {
		}
		
		public Builder(Context context) {
			this.context = context;
		}
		
		public Builder setContext(Context context) {
			this.context = context;
			return this;
		}
		
		public Builder setText(String message) {
			this.message = message;
			return this;
		}
		
		public Builder setDuration(int duration) {
			this.duration = duration;
			return this;
		}
		
		public Builder setTextColor(Integer textColorId) {
			this.textColorId = textColorId;
			return this;
		}
		
		
		public Builder setIconId(int iconId) {
			this.iconId = iconId;
			return this;
		}
		
		
		public Builder setBackgroundColor(int backgroundColorId) {
			this.backgroundColorId = backgroundColorId;
			return this;
		}
		
		
		public Builder showTail(Boolean showTail) {
			this.showTail = showTail;
			return this;
		}
		
		
		public void show() {
			mToast = new Tasty(this);
			mToast.show();
		}
		
		
	}
	
	
}
