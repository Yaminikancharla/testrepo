package org.cruxframework.crux.core.client.ioc;

import org.cruxframework.crux.core.client.screen.views.View;
import com.google.gwt.core.client.GWT;

public class IocContainer_main_largeDisplayTouch extends org.cruxframework.crux.core.client.ioc.IocContainer {
  public IocContainer_main_largeDisplayTouch(View view){
    super(view);
  }
  public  org.testwar.client.MainController.MainView getorg_testwar_client_MainController_MainView(org.cruxframework.crux.core.client.ioc.IoCResource.Scope scope, String subscope){
    org.testwar.client.MainController.MainView result = _getScope(scope).getValue(new org.cruxframework.crux.core.client.ioc.IocProvider<org.testwar.client.MainController.MainView>(){
      public org.testwar.client.MainController.MainView get(){
        return GWT.create(org.testwar.client.MainController.MainView.class);
      }
    }, "org.testwar.client.MainController.MainView", subscope, 
    new IocScope.CreateCallback<org.testwar.client.MainController.MainView>(){
      public void onCreate(org.testwar.client.MainController.MainView newObject){
      }
    }
    );
    if (scope != org.cruxframework.crux.core.client.ioc.IoCResource.Scope.SINGLETON && result.getBoundCruxViewId() == null){
      result.bindCruxView(this.getBoundCruxViewId());
    }
    return result;
  }
}
