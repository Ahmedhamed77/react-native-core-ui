package com.coreui

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.CoreUiViewManagerInterface
import com.facebook.react.viewmanagers.CoreUiViewManagerDelegate

@ReactModule(name = CoreUiViewManager.NAME)
class CoreUiViewManager : SimpleViewManager<CoreUiView>(),
  CoreUiViewManagerInterface<CoreUiView> {
  private val mDelegate: ViewManagerDelegate<CoreUiView>

  init {
    mDelegate = CoreUiViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<CoreUiView>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): CoreUiView {
    return CoreUiView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: CoreUiView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "CoreUiView"
  }
}
