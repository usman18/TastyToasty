package com.uk.tastytoasty;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TastyToasty {
	
	public static int LONG = Toast.LENGTH_LONG;
	public static int SHORT = Toast.LENGTH_SHORT;


	private Context context;
	private String message;
	
	private Integer duration = LONG;
	private Integer iconId;
	private Integer backgroundColorId;
	private Integer textColorId;
	
	private Boolean showTail;
	
	private View toastLayout;
	
	
	
	
	private TastyToasty(Builder builder) {
		this.context = builder.context;
		this.message = builder.message;
		this.duration = builder.duration;
		this.iconId = builder.iconId;
		this.backgroundColorId = builder.backgroundColorId;
		this.textColorId = builder.textColorId;
		this.showTail = builder.showTail;
	}
	
	// Instagram Like
	public static Toast instaLike(@NonNull Context context, String message) {
		return makeText(context, message, LONG, R.drawable.ic_action_favourite, R.color.insta_red, R.color.white, true);
	}
	
	// Instagram Comment
	public static Toast instaComment(@NonNull Context context, String message) {
		return makeText(context, message, LONG, R.drawable.ic_comment, R.color.insta_red, R.color.white, true);
	}
	
	// Instagram Follower
	public static Toast instaFollower(@NonNull Context context, String message) {
		return makeText(context, message, LONG, R.drawable.ic_follower, R.color.insta_red, R.color.white, true);
	}
	
	public static Toast instaAll(@NonNull Context context, String likeMessage, String followerMessage, String commentMessage) {
		
		View view = LayoutInflater.from(context)
			.inflate(R.layout.insta_all_layout, null);
		
		LinearLayout toastContainer = view.findViewById(R.id.toastContainer);
	
		ImageView imgLike = view.findViewById(R.id.imgLike);
		ImageView imgFollower = view.findViewById(R.id.imgFollower);
		ImageView imgComment = view.findViewById(R.id.imgComment);
		
		ImageView imgTail = view.findViewById(R.id.imgTail);
		
		TextView tvLike = view.findViewById(R.id.tvLikeMsg);
		TextView tvFollower = view.findViewById(R.id.tvFollowMsg);
		TextView tvComment = view.findViewById(R.id.tvCommentMsg);
		
		Toast toast = new Toast(context);
		toast.setView(view);
		
		toastContainer.setBackgroundColor(context.getResources().getColor(R.color.insta_red));
		
		imgLike.setImageResource(R.drawable.ic_action_favourite);
		imgFollower.setImageResource(R.drawable.ic_follower);
		imgComment.setImageResource(R.drawable.ic_comment);
		
		tvLike.setText(likeMessage);
		tvFollower.setText(followerMessage);
		tvComment.setText(commentMessage);
		
		imgTail.setVisibility(View.VISIBLE);
		
		toast.setDuration(Toast.LENGTH_LONG);
		
		return toast;
	}
	
	
	
	
	public static Toast star(@NonNull Context context, String message) {
		return makeText(context, message, LONG, R.drawable.ic_star, R.color.blue, R.color.white, false);
	}
	
	public static Toast success(@NonNull Context context, String message) {
		return makeText(context, message, LONG, R.drawable.ic_verified_user, R.color.green, R.color.white, false);
	}
	
	
	public static Toast error(@NonNull Context context, String message) {
		return makeText(context, message, LONG, R.drawable.ic_error, R.color.red, R.color.white, false);
	}
	
	
	public static Toast trending(@NonNull Context context, String message) {
		return makeText(context, message, LONG, R.drawable.ic_whatshot, R.color.orange, R.color.white, false);
	}
	
	
	/*
	*  Spectrum starts here
	*/
	public static Toast red(@NonNull Context context, String message, Integer iconId) {
		return makeText(context, message, LONG, iconId, R.color.red, R.color.white, false);
	}
	
	public static Toast orange(@NonNull Context context, String message, Integer iconId) {
		return makeText(context, message, LONG, iconId, R.color.orange, R.color.white, false);
	}
	
	public static Toast yellow(@NonNull Context context, String message, Integer iconId) {
		return makeText(context, message, LONG, iconId, R.color.yellow, R.color.white, false);
	}
	
	public static Toast green(@NonNull Context context, String message, Integer iconId) {
		return makeText(context, message, LONG, iconId, R.color.green, R.color.white, false);
	}
	
	public static Toast blue(@NonNull Context context, String message, Integer iconId) {
		return makeText(context, message, LONG, iconId, R.color.blue, R.color.white, false);
	}
	
	public static Toast indigo(@NonNull Context context, String message, Integer iconId) {
		return makeText(context, message, LONG, iconId, R.color.indigo, R.color.white, false);
	}
	
	
	public static Toast violet(@NonNull Context context, String message, Integer iconId) {
		return makeText(context, message, LONG, iconId, R.color.violet, R.color.white, false);
	}
	
	
	
	
	public static Toast makeText(@NonNull Context context, String message, Integer duration, Integer iconId, Integer backgroundColorId, Integer textColorId, Boolean showTail) {
		
		View toastLayout = LayoutInflater.from(context)
			.inflate(R.layout.toast_layout, null);
		
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
		
		
		if (duration != null) {
			toast.setDuration(duration);
		} else {
			toast.setDuration(Toast.LENGTH_LONG);
		}
		
		
		
		if (iconId != null) {
			imgIcon.setImageResource(iconId);
		} else {
			imgIcon.setVisibility(View.GONE);
		}
		
		
		if (backgroundColorId != null) {
			toastContainer.setBackgroundColor(context.getResources().getColor(backgroundColorId));
			imgTail.setColorFilter(ContextCompat.getColor(context, backgroundColorId), android.graphics.PorterDuff.Mode.SRC_IN);
		} else {
			//Default
			toastContainer.setBackgroundColor(context.getResources().getColor(R.color.insta_red));
			imgTail.setColorFilter(ContextCompat.getColor(context, R.color.insta_red), android.graphics.PorterDuff.Mode.SRC_IN);
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
		
		
		
		return toast;
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
			
			toastContainer.setBackgroundColor(context.getResources().getColor(R.color.insta_red));
			imgTail.setColorFilter(ContextCompat.getColor(context, R.color.insta_red), android.graphics.PorterDuff.Mode.SRC_IN);
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
		
		private TastyToasty mToast;
		
		public Builder() {
		}
		
		public Builder(@NonNull Context context) {
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
			mToast = new TastyToasty(this);
			mToast.show();
		}
		
		
	}
	
	
}
