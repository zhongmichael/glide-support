package com.bumptech.glide.supportapp.random.__sync_cache;

import android.widget.ImageView;

import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

class SyncLoadImageViewTarget extends GlideDrawableImageViewTarget {
	private boolean isResourceReady;

	public SyncLoadImageViewTarget(ImageView view) {
		super(view);
	}

	@Override
	public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> animation) {
		super.onResourceReady(resource, animation);
		isResourceReady = true;
	}

	public boolean isLoaded() {
		return isResourceReady;
	}
}
