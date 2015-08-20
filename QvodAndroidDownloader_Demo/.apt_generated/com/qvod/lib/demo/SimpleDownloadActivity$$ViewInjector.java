// Generated code from Butter Knife. Do not modify!
package com.qvod.lib.demo;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class SimpleDownloadActivity$$ViewInjector<T extends com.qvod.lib.demo.SimpleDownloadActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230722, "field 'upgradeProgressBar'");
    target.upgradeProgressBar = finder.castView(view, 2131230722, "field 'upgradeProgressBar'");
    view = finder.findRequiredView(source, 2131230723, "field 'updradeBtn' and method 'onClickUpdate'");
    target.updradeBtn = finder.castView(view, 2131230723, "field 'updradeBtn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickUpdate();
        }
      });
    view = finder.findRequiredView(source, 2131230724, "field 'tvUpdateTip'");
    target.tvUpdateTip = finder.castView(view, 2131230724, "field 'tvUpdateTip'");
    view = finder.findRequiredView(source, 2131230720, "field 'rotateView'");
    target.rotateView = finder.castView(view, 2131230720, "field 'rotateView'");
    view = finder.findRequiredView(source, 2131230721, "field 'flickerView'");
    target.flickerView = finder.castView(view, 2131230721, "field 'flickerView'");
  }

  @Override public void reset(T target) {
    target.upgradeProgressBar = null;
    target.updradeBtn = null;
    target.tvUpdateTip = null;
    target.rotateView = null;
    target.flickerView = null;
  }
}
