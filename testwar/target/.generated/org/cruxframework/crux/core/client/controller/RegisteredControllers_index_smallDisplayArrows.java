package org.cruxframework.crux.core.client.controller;

import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.screen.Screen;
import com.google.gwt.core.client.RunAsyncCallback;
import org.cruxframework.crux.core.client.Crux;
import org.cruxframework.crux.core.client.collection.FastMap;
import org.cruxframework.crux.core.client.utils.StringUtils;

public class RegisteredControllers_index_smallDisplayArrows implements org.cruxframework.crux.core.client.controller.RegisteredControllers {
  public RegisteredControllers_index_smallDisplayArrows(org.cruxframework.crux.core.client.screen.views.View view, org.cruxframework.crux.core.client.ioc.IocContainer_index_smallDisplayArrows iocContainer){
    this.view = view;
    this.iocContainer = iocContainer;
  }
  public <T> T getController(String controller){
    T ret = (T)controllers.get(controller);
    if (ret == null){
      if (ret == null){
        ret = (T)controllers.get(controller);
      }
    }
    return ret;
  }
  private FastMap<Object> controllers = new FastMap<Object>();
  private org.cruxframework.crux.core.client.screen.views.View view;
  private org.cruxframework.crux.core.client.ioc.IocContainer_index_smallDisplayArrows iocContainer;
}
